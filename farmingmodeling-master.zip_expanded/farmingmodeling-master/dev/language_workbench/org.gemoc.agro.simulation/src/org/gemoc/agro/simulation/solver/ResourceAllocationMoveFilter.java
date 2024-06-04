package org.gemoc.agro.simulation.solver;

import org.gemoc.agro.exploitation.Resource;
import org.gemoc.agro.simulation.ResourceAllocation;
import org.optaplanner.core.impl.heuristic.selector.common.decorator.SelectionFilter;
import org.optaplanner.core.impl.heuristic.selector.move.generic.ChangeMove;
import org.optaplanner.core.impl.score.director.ScoreDirector;

public class ResourceAllocationMoveFilter implements
    SelectionFilter<ChangeMove> {

  public boolean accept(ScoreDirector scoreDirector, ChangeMove move) {

    ResourceAllocation allocation = (ResourceAllocation) move.getEntity();
    Resource resource = (Resource) move.getToPlanningValue();

    return allocation.getKind() == resource.getKind();

  }

}
