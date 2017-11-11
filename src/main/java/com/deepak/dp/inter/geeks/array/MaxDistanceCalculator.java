package com.deepak.dp.inter.geeks.array;

public class MaxDistanceCalculator {

	public int maxDist(int[] array) {
		int[] leftMin = new int[array.length];
		leftMin[0] = array[0];
		for (int i = 1; i < array.length; i++) {
			leftMin[i] = Math.min(array[i], leftMin[i - 1]);
		}

		int[] rightMax = new int[array.length];
		rightMax[array.length - 1] = array[array.length - 1];
		for (int i = array.length - 2; i >= 0; i--) {
			rightMax[i] = Math.max(array[i], rightMax[i + 1]);
		}

		int i = 0;
		int j = 0;
		int maxDiff = -1;
		while (i < array.length && j < array.length) {

			if (leftMin[i] < rightMax[j]) {
				maxDiff = Math.max(maxDiff, j - i);
				j++;
			} else
				i++;
		}

		return maxDiff;
	}

}
