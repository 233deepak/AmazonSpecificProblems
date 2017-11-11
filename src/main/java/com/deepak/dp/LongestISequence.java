package com.deepak.dp;

public class LongestISequence {

	public int findLis(int[] array) {
		return lis(array, array.length);
	}

	private int lis(int[] array, int length) {
		if (length == 1)
			return 1;
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < length; i++) {
			int temp = lis(array, length - i);
			if (temp > max) {
				if (array[length - 1] > array[length - i - 1]) {
					temp += 1;
				}
				max = temp;
			}
		}
		return max;
	}
	
	

}
