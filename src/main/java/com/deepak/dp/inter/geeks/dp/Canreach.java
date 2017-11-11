package com.deepak.dp.inter.geeks.dp;

public class Canreach {

	public boolean canReach(int[] array) {
		return canreach(array, array.length);
	}

	private boolean canreach(int[] array, int i) {
		if (i <= 1)
			return true;

		for (int j = i - 1; j > 0; j--) {
			if (array[j - 1] + j >= i) {
				if (canreach(array, j)) {
					return true;
				}
			}
		}

		return false;
	}
}
