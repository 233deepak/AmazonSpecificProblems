package com.deepak.dp.inter;

import java.util.List;

public class BuySellStock {

	int[] memory;

	public int maxProfit(final List<Integer> a) {
		memory = new int[a.size() + 1];
		for (int i = 0; i <= a.size(); i++)
			memory[i] = -1;
		return maxProfit(a, a.size());
	}

	private int maxProfit(List<Integer> a, int i) {
		if (i <= 0)
			return 0;
		int max = Integer.MIN_VALUE;
		if (memory[i] != -1)
			return memory[i];
		for (int j = i + 1; j <= a.size(); j++) {
			int temp = a.get(j - 1) - a.get(i - 1);
			if (temp > max) {
				max = temp;
			}
		}
		int temp = maxProfit(a, i - 1);
		max = Math.max(max, temp);
		memory[i] = max;
		return max;
	}
}
