package com.deepak.dp.inter.geeks.dp;

public class MaxProduct {

	public int findMaxP(int[] array) {

		int maxSoFar = 1;
		int maxEndingHere = 1;
		int minEndingHere = 1;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > 0) {
				maxEndingHere = maxEndingHere * array[i];
				// minEndingHere = Math.min(a, b)
			} else if (array[i] == 0) {
				maxEndingHere = 1;
				minEndingHere = 1;
			} else {

				int temp = maxEndingHere;
				maxEndingHere = Math.max(1, array[i] * minEndingHere);
				minEndingHere = temp * array[i];
			}

			if (maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
			}

		}

		return maxSoFar;
	}
}
