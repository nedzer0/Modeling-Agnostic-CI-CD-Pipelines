package org.gemoc.agro.simulation.solver;

import java.util.Calendar;
import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.util.InternalEList;
import org.gemoc.agro.activitiesDSL.ActivityResource;
import org.gemoc.agro.activitiesDSL.Comp;
import org.gemoc.agro.activitiesDSL.Date;
import org.gemoc.agro.activitiesDSL.DelaySinceActivy;
import org.gemoc.agro.activitiesDSL.ExploitationActivity;
import org.gemoc.agro.activitiesDSL.Predicate;
import org.gemoc.agro.activitiesDSL.ResourceKind;
import org.gemoc.agro.activitiesDSL.TempOfTheDay;
import org.gemoc.agro.exploitation.Resource;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.ClimateData;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.FeedbackLevel;
import org.gemoc.agro.simulation.ResourceAllocation;
import org.gemoc.agro.simulation.SchedulingFeedback;
import org.gemoc.agro.simulation.SimulationFactory;
import org.optaplanner.core.api.score.Score;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.score.director.easy.EasyScoreCalculator;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

public class AgroScoreCalculator implements
    EasyScoreCalculator<SimulationSolution> {

  private static final Calendar CAL_INSTANCE = Calendar.getInstance();

  public static int nbSolutions = 0;

  @Override
  public Score calculateScore(SimulationSolution solution) {
    int hardScore = 0;
    int softScore = 0;
    AgroScoreCalculator.nbSolutions++;

    Multimap<ExploitationActivity, ActivityWork> activityToWork = HashMultimap
        .create();
    Multimap<Day, ActivityWork> scheduledWork = HashMultimap.create();
    for (ActivityWork work : solution.getSimulation().getWorkToDo()) {
      work.getSchedulingFeedback().clear();

      if (work.getActivity() != null) {
        activityToWork.put(work.getActivity(), work);
      }
    }

    Multimap<ActivityWork, ResourceAllocation> workToAllocation = HashMultimap
        .create();
    for (ResourceAllocation allocated : solution.getSimulation()
        .getAllocations()) {
      workToAllocation.put(allocated.getWork(), allocated);
    }

    for (ActivityWork allocatedWork : workToAllocation.keySet()) {
      Collection<ResourceAllocation> allocations = workToAllocation
          .get(allocatedWork);
      Set<Resource> usedResource = Sets.newLinkedHashSet();
      for (ResourceAllocation alloc : allocations) {
        if (usedResource.contains(alloc.getResource())
            && alloc.getWork().getScheduledOn() != null) {
          hardScore += mediumPenalty(1);
          addFeedback(
              alloc.getWork(),
              createFeedback(FeedbackLevel.ERROR, "Resource "
                  + alloc.getResource().getName()
                  + " is allocated more than one time on the "
                  + alloc.getWork().getScheduledOn().getDay() + " "
                  + alloc.getWork().getScheduledOn().getMonth()));
        }
        if (alloc.getResource() != null) {
          usedResource.add(alloc.getResource());
        }
      }

    }

    Multimap<Day, Resource> dayToResource = HashMultimap.create();
    Set<Day> daysUsed = Sets.newLinkedHashSet();
    for (ResourceAllocation alloc : solution.getSimulation().getAllocations()) {
      if (alloc.getResource() != null && alloc.getWork() != null
          && alloc.getWork().getScheduledOn() != null) {
        dayToResource
            .put(alloc.getWork().getScheduledOn(), alloc.getResource());
        daysUsed.add(alloc.getWork().getScheduledOn());
      }
    }

    /*
     * the more different days we use, the better
     */
    softScore += daysUsed.size() * 100;

    /*
     * Constraint : a given resource can only be used for a given activity on a
     * given day.
     */
    for (Day d : dayToResource.keySet()) {
      Collection<Resource> allResourcesForThisDay = dayToResource.get(d);
      Set<Resource> uniqueResources = Sets
          .newLinkedHashSet(allResourcesForThisDay);
      int delta = allResourcesForThisDay.size() - uniqueResources.size();
      if (delta > 0) {
        hardScore += mediumPenalty(delta);
        System.out
            .println("Several uses of the same resource for the same day.");
      }
    }

    /*
     * Constraint: all the resources which are required should be allocated.
     */
    for (ResourceAllocation alloc : solution.getSimulation().getAllocations()) {
      if (alloc.getResource() == null) {
        hardScore += mediumPenalty(1);
        addFeedback(
            alloc.getWork(),
            (createFeedback(FeedbackLevel.ERROR, "A required resource of kind "
                + alloc.getKind().getName() + " is missing.")));
      }
    }

    for (ActivityWork work : solution.getSimulation().getWorkToDo()) {

      /*
       * Constraint : all work needing a resource should have a corresponding
       * allocation of the right type
       */
      Multimap<ResourceKind, Resource> allocationsForThisWork = HashMultimap
          .create();
      for (ResourceAllocation allocated : workToAllocation.get(work)) {
        if (allocated.getResource() != null) {
          allocationsForThisWork.put(allocated.getKind(),
              allocated.getResource());
        }
      }

      for (ActivityResource use : work.getActivity().getUses()) {
        if (use.getResourceKind() != null) {

          int delta = allocationsForThisWork.get(use.getResourceKind()).size()
              - use.getQuantity();
          if (delta > 0) {
            /*
             * we are missing at least an allocation of this type.
             */
            hardScore += mediumPenalty(delta);
            addFeedback(
                work,
                createFeedback(FeedbackLevel.ERROR, "This activity is missing "
                    + delta + " resources of kind "
                    + use.getResourceKind().getName()));
          }
        }
      }

      /*
       * Constraint : All work should be scheduled
       */
      if (work.getScheduledOn() == null) {
        hardScore += mediumPenalty(1);
        addFeedback(
            work,
            createFeedback(FeedbackLevel.ERROR,
                "This activity is not scheduled."));
      } else {
        scheduledWork.put(work.getScheduledOn(), work);
        if (work.getActivity() != null) {

          /*
           * Constraint : the activity predicates are valid
           */

          for (Predicate p : work.getActivity().getPredicates()) {
            /*
             * delay are focused on the same surface..
             */
            if (p instanceof DelaySinceActivy) {
              DelaySinceActivy delayConstraint = (DelaySinceActivy) p;
              for (ActivityWork otherWorkOnSameAct : activityToWork
                  .get(delayConstraint.getPrerequisite())) {
                if (otherWorkOnSameAct.getOnSurface() == work.getOnSurface()
                    && otherWorkOnSameAct.getScheduledOn() != null) {

                  int nbDaysInBetween = absoluteDelta(work.getScheduledOn(),
                      otherWorkOnSameAct.getScheduledOn());
                  /*
                   * if delta > 0 this activity scheduled date is later than the
                   * when activity it depends on is scheduled.
                   */
                  if (nbDaysInBetween < 0) {
                    hardScore += mediumPenalty(2);
                    addFeedback(
                        work,
                        createFeedback(FeedbackLevel.ERROR,
                            "This activity (" + work.getActivity().getName() + ") starts before  "
                                + otherWorkOnSameAct.getActivity().getName()
                                + " ("
                                + otherWorkOnSameAct.getScheduledOn().getDay()
                                + " "
                                + otherWorkOnSameAct.getScheduledOn()
                                    .getMonth() + ") whereas it should not."));

                  } else if (delayConstraint.getDays() != 0
                      && nbDaysInBetween < delayConstraint.getDays()) {
                    hardScore += mediumPenalty(nbDaysInBetween * 5);
                    addFeedback(
                        work,
                        createFeedback(
                            FeedbackLevel.ERROR,
                            "The minimum number of days ("
                                + delayConstraint.getDays()
                                + ") in between this activity ("
                                + work.getActivity().getName() + ") and "
                                + otherWorkOnSameAct.getActivity().getName()
                                + " is not respected : " + nbDaysInBetween
                                + "."));
                  }
                }

              }
            }

            if (p instanceof TempOfTheDay) {
              TempOfTheDay tempConstraint = (TempOfTheDay) p;
              if (tempConstraint.getComparison() == Comp.MORE_THAN
                  && work.getScheduledOn().getTemperature() < tempConstraint
                      .getLowerTempBound()) {
                hardScore += mediumPenalty(1);
                addFeedback(
                    work,
                    createFeedback(FeedbackLevel.ERROR,
                        "The minimum temperature is not respected."));
              }
              if (tempConstraint.getComparison() == Comp.LESS_THAN
                  && work.getScheduledOn().getTemperature() > tempConstraint
                      .getLowerTempBound()) {
                hardScore += mediumPenalty(1);
                addFeedback(
                    work,
                    createFeedback(FeedbackLevel.ERROR,
                        "The minimum temperature is not respected."));
              }

            }
          }
        }
      }

    }
    return HardSoftScore.valueOf(hardScore, softScore);
  }

  private int checkAllocationIsRightKind(int hardScore, ResourceAllocation alloc) {
    if (alloc.getResource().getKind() != alloc.getKind()) {
      hardScore += mediumPenalty(10);
      addFeedback(
          alloc.getWork(),
          createFeedback(FeedbackLevel.ERROR, "Resource"
              + alloc.getResource().getName() + " is not of kind "
              + alloc.getKind().getName() + "."));
    }
    return hardScore;
  }

  private int checkDateRange(int hardScore, ActivityWork work) {
    int scheduledDay = numberOfDayInYear(work.getScheduledOn());
    Date minimumDayToStart = work.getActivity().getStartDate();
    Date maximumDayToStart = work.getActivity().getEndDate();
    if (minimumDayToStart != null) {
      int minDayToStart = numberOfDayInYear(work.getActivity().getStartDate());
      if (scheduledDay < minDayToStart) {
        hardScore += mediumPenalty(2);
        addFeedback(
            work,
            createFeedback(
                FeedbackLevel.ERROR,
                "This activity starts before the specified start date :"
                    + minimumDayToStart.getDay() + " "
                    + minimumDayToStart.getMonth()));
      }
    }
    if (maximumDayToStart != null) {
      int maxDayToStart = numberOfDayInYear(work.getActivity().getEndDate());
      if (scheduledDay > maxDayToStart) {
        hardScore += mediumPenalty(1);
        addFeedback(
            work,
            createFeedback(
                FeedbackLevel.ERROR,
                "This activity starts " + work.getScheduledOn().getDay() + " "
                    + work.getScheduledOn().getMonth()
                    + " which is after the specified end date:"
                    + maximumDayToStart.getDay() + " "
                    + maximumDayToStart.getMonth()));
      }
    }
    return hardScore;
  }

  private void addFeedback(ActivityWork work, SchedulingFeedback createFeedback) {
    ((InternalEList) work.getSchedulingFeedback()).addUnique(createFeedback);
  }

  private int absoluteDelta(Day a, Day b) {
    ClimateData container = (ClimateData) a.eContainer();
    int aDay = container.getDays().indexOf(a);
    int bDay = container.getDays().indexOf(b);
    return aDay - bDay;
  }

  private int mediumPenalty(int ratio) {
    return -Math.abs(ratio) * 100;
  }

  private SchedulingFeedback createFeedback(FeedbackLevel error, String message) {
    SchedulingFeedback feedback = SimulationFactory.eINSTANCE
        .createSchedulingFeedback();
    feedback.setLevel(error);
    feedback.setMessage(message);
    return feedback;
  }

  public static int numberOfDayInYear(Day day) {
    Calendar cal = CAL_INSTANCE;
    cal.set(Calendar.DAY_OF_MONTH, day.getDay());
    cal.set(Calendar.MONTH, day.getMonth().getValue());
    return cal.get(Calendar.DAY_OF_YEAR);
  }

  public static int numberOfDayInYear(Date day) {
    Calendar cal = CAL_INSTANCE;
    cal.set(Calendar.DAY_OF_MONTH, day.getDay());
    cal.set(Calendar.MONTH, day.getMonth().getValue());
    return cal.get(Calendar.DAY_OF_YEAR);
  }

  /*
   * return the nb days between the dates.
   */
  private int delta(Day scheduledOn, Date date) {
    Calendar cal = CAL_INSTANCE;
    cal.set(Calendar.DAY_OF_MONTH, date.getDay());
    cal.set(Calendar.MONTH, date.getMonth().getValue());
    int dateDayOfYear = cal.get(Calendar.DAY_OF_YEAR);

    cal.set(Calendar.DAY_OF_MONTH, scheduledOn.getDay());
    cal.set(Calendar.MONTH, scheduledOn.getMonth().getValue());
    int scheduleDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
    return scheduleDayOfYear - dateDayOfYear;
  }

  /*
   * return the nb days between the dates.
   */
  private int delta(Day scheduledOn, Day date) {
    Calendar cal = CAL_INSTANCE;
    cal.set(Calendar.DAY_OF_MONTH, date.getDay());
    cal.set(Calendar.MONTH, date.getMonth().getValue());
    int dateDayOfYear = cal.get(Calendar.DAY_OF_YEAR);

    cal.set(Calendar.DAY_OF_MONTH, scheduledOn.getDay());
    cal.set(Calendar.MONTH, scheduledOn.getMonth().getValue());
    int scheduleDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
    return scheduleDayOfYear - dateDayOfYear;
  }

}
