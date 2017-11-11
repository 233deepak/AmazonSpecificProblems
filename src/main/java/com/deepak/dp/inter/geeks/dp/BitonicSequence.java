package com.deepak.dp.inter.geeks.dp;

public class BitonicSequence {

	int[] incs;
	int[] desc;
	int[] bitonic;

	public int findSeauence(int[] array) {

		incs = new int[array.length];
		desc = new int[array.length];
		bitonic = new int[array.length];
		findInsSequence(array);
		finaDescSequence(array);

		for (int i = 0; i < array.length; i++) {
			bitonic[i] = incs[i] + desc[i] - 1;
		}

		int max = bitonic[0];

		for (int i = 1; i < array.length; i++) {
			if (bitonic[i] > max)
				max = bitonic[i];
		}

		return max;
	}

	private void finaDescSequence(int[] array) {
		for (int i = 0; i < array.length; i++)
			desc[i] = 1;

		for (int i = array.length - 2; i > 0; i--) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[i] > array[j] && (desc[j] + 1) > desc[i]) {
					desc[i] = desc[j] + 1;
				}
			}

		}
	}

	private void findInsSequence(int[] array) {
		for (int i = 0; i < array.length; i++)
			incs[i] = 1;

		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] > array[j] && (incs[j] + 1) > incs[i]) {
					incs[i] = incs[j] + 1;
				}
			}

		}

	}

}
