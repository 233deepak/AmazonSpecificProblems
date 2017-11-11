package com.deepak.dp.inter.geeks.dp;

public class LongestISequence {

	public int findLIS(int[] array) {

		return lis(array, array.length);
	}

	private int lis(int[] array, int length) {

		if (length == 1)
			return 1;

		int max = Integer.MIN_VALUE;
		for (int i = length-1; i >= 1; i--) {
			int temp = lis(array, i);
			if (array[length - 1] > array[i - 1] && (temp + 1) > max) {
				max = temp + 1;
			}
			if (temp > max)
				max = temp;
		}
		return max;
	}
}
