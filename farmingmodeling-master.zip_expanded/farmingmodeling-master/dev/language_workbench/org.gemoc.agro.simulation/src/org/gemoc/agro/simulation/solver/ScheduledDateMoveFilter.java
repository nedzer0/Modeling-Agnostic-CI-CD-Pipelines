package org.gemoc.agro.simulation.solver;

import org.gemoc.agro.activitiesDSL.Date;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.Day;
import org.optaplanner.core.impl.heuristic.selector.common.decorator.SelectionFilter;
import org.optaplanner.core.impl.heuristic.selector.move.generic.ChangeMove;
import org.optaplanner.core.impl.score.director.ScoreDirector;

public class ScheduledDateMoveFilter implements SelectionFilter<ChangeMove> {

  public boolean accept(ScoreDirector scoreDirector, ChangeMove move) {

    /*
     * we should return true if the given day is in the range of the possible
     * ones.
     */
    ActivityWork work = (ActivityWork) move.getEntity();
    Day day = (Day) move.getToPlanningValue();

    int scheduledDay = AgroScoreCalculator.numberOfDayInYear(day);

    boolean startInRange = false;
    boolean endInRange = false;

    Date minimumDayToStart = work.getActivity().getStartDate();
    Date maximumDayToStart = work.getActivity().getEndDate();

    if (minimumDayToStart != null) {
      int minDayToStart = AgroScoreCalculator
          .numberOfDayInYear(minimumDayToStart);
      startInRange = !(scheduledDay < minDayToStart);
    } else {
      startInRange = true;
    }
    if (maximumDayToStart != null) {
      int maxDayToStart = AgroScoreCalculator.numberOfDayInYear(work
          .getActivity().getEndDate());
      endInRange = !(scheduledDay > maxDayToStart);

    } else {
      endInRange = true;
    }

    return startInRange && endInRange;

  }

}
