package org.gemoc.agro.simulation.solver;

import java.io.Serializable;
import java.util.Comparator;

import org.gemoc.agro.simulation.ActivityWork;

public class ActivityWorkDifficultyComparator implements
		Comparator<ActivityWork>, Serializable {

	public int compare(ActivityWork a, ActivityWork b) {
		if (hasStartEnd(a) && ! hasStartEnd(b)) {
			/*
			 * a is harder than b and should be upper
			 */
			return 1;
		}
		if (hasStartEnd(b) && !hasStartEnd(a)) {
			/*
			 * b is harder than a so a should be lower
			 */
			return -1;
		}
		return 0;
		// return new CompareToBuilder().append(a.getScheduledOn(),
		// b.getScheduledOn()).toComparison();
	}

	private boolean hasStartEnd(ActivityWork a) {
		return a.getActivity().getStartDate()!=null && a.getActivity().getEndDate()!=null;
	}

}