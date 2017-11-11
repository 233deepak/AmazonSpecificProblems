package com.deepak.dp.inter;

import java.util.ArrayList;

public class JumpGameMin {

	public int jump(ArrayList<Integer> a) {
		if (a.size() <= 1)
			return 0;

		// Return -1 if not possible to jump
		if (a.get(0) == 0)
			return -1;

		// initialization
		int maxReach = a.get(0);
		int step = a.get(0);
		int jump = 1;

		// Start traversing array
		for (int i = 1; i < a.size(); i++) {
			// Check if we have reached the end of the array
			if (i == a.size() - 1)
				return jump;

			// updating maxReach
			maxReach = Math.max(maxReach, i + a.get(i));

			// we use a step to get to the current index
			step--;

			// If no further steps left
			if (step == 0) {
				// we must have used a jump
				jump++;

				// Check if the current index/position or lesser index
				// is the maximum reach point from the previous indexes
				if (i >= maxReach)
					return -1;

				// re-initialize the steps to the amount
				// of steps to reach maxReach from position i.
				step = maxReach - i;
			}
		}

		return -1;
	}

}
