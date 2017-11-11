package com.deepak.dp.inter.geeks.array;

public class RepeatNumber {

	public int findMissing(int[] array) {

		int repeat = 0;
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			if (array[Math.abs(value)-1] < 0) {
				repeat = Math.abs(value);
				break;
			}
			array[Math.abs(value)-1] = -array[Math.abs(value)-1];

		}

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += Math.abs(array[i]);
		}

		int originalSum = (array.length * (array.length + 1)) / 2;
		int missing = originalSum - (sum - repeat);

		return missing;
	}

}
