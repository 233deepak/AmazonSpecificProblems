package com.deepak.dp.inter;

import java.util.List;

public class LongestIncreasingSequence {

	int[] memory;

	public int lis(final List<Integer> a) {
		memory = new int[a.size() + 1];
		for (int i = 0; i < a.size() + 1; i++)
			memory[i] = 1;
		findIncreasing(a, memory);
		return max(memory);
	}

	private int max(int[] memory2) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < memory2.length; i++) {
			if (memory2[i] > max)
				max = memory2[i];
		}
		return max;
	}

	private void findIncreasing(List<Integer> array, int[] increasing) {
		for (int i = 1; i < array.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (array.get(i) >array.get(j)
						&& ((increasing[j] + 1) > increasing[i])) {
					increasing[i] = (increasing[j] + 1);

				}
			}
		}

	}

	private int lis(List<Integer> a, int size) {
		if (size == 1)
			return 1;
		if (memory[size] != -1)
			return memory[size];

		int max = 1;
		for (int i = 1; i < size; i++) {
			int temp = lis(a, i);
			if (a.get(size - 1) >= a.get(i - 1) && ((temp + 1) > max)) {
				max = (temp + 1);
			}
		}

		memory[size] = max;
		return max;
	}

}
