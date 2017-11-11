package com.deepak.dp.inter.geeks.heap;

public class RainWaterTrap {

	public int findTrap(int[] array) {

		int count = 0;
		for (int i = 1; i < array.length - 1; i++) {
			int maxLeft = findMaxLeft(array, i);
			int maxRight = findMaxRight(array, i);
			int min = Math.min(maxLeft, maxRight);
			count += min - array[i];
		}

		return count;
	}

	private int findMaxRight(int[] array, int index) {
		int max = Integer.MIN_VALUE;
		for (int i = index + 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	private int findMaxLeft(int[] array, int index) {

		int max = Integer.MIN_VALUE;
		for (int i = index - 1; i >= 0; i--) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

}
