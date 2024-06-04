package org.gemoc.agro.simulation.solver;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gemoc.agro.exploitation.Resource;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.ResourceAllocation;
import org.gemoc.agro.simulation.Schedule;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.api.domain.solution.cloner.PlanningCloneable;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

import com.google.common.collect.ImmutableList;

@PlanningSolution
public class SimulationSolution implements Solution<HardSoftScore>,
    PlanningCloneable<SimulationSolution> {

  // the EObject representing the problem to be mutated
  private Schedule sim;

  public SimulationSolution(Schedule sim) {
    this.sim = sim;
  }

  @Override
  public Collection<? extends Object> getProblemFacts() {
    return ImmutableList.copyOf(this.sim.getClimateData().getDays());
  }

  @PlanningEntityCollectionProperty
  public List<ActivityWork> getWorkToSchedule() {
    return sim.getWorkToDo();
  }

  @PlanningEntityCollectionProperty
  public List<ResourceAllocation> getResourcesToAllocate() {
    return sim.getAllocations();
  }

  @ValueRangeProvider(id = "days")
  public List<Day> getDays() {
    return sim.getClimateData().getDays();
  }

  @ValueRangeProvider(id = "resources")
  public List<Resource> getResources() {
    return sim.getExploitation().getResources();
  }

  @Override
  public HardSoftScore getScore() {
    return HardSoftScore.valueOf(this.sim.getHardScore(),
        this.sim.getSoftScore());
  }

  @Override
  public void setScore(HardSoftScore arg0) {
    this.sim.setHardScore(arg0.getHardScore());
    this.sim.setSoftScore(arg0.getSoftScore());
  }

  public Schedule getSimulation() {
    return this.sim;
  }

  @Override
  public SimulationSolution planningClone() {
    Schedule copy = EcoreUtil.copy(this.sim);
    EcoreUtil.resolveAll(copy);
    SimulationSolution clone = new SimulationSolution(copy);
    return clone;
  }
}
