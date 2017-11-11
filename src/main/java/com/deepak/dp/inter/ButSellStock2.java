package com.deepak.dp.inter;

import java.util.List;

public class ButSellStock2 {

	int[][] memory;

	public int maxProfit(final List<Integer> a) {
		memory = new int[3][a.size() + 1];
		for (int i = 0; i < a.size() + 1; i++) {
			memory[0][i] = -1;
			memory[1][i] = -1;
			memory[2][i] = -1;
		}
		return maxiMizeProfit(a, a.size(), 2);
	}

	private int maxiMizeProfit(List<Integer> a, int j, int k) {

		if (j <= 0 || k <= 0)
			return 0;

		if (memory[k][j] != -1)
			return memory[k][j];
		int noTrans = maxiMizeProfit(a, j - 1, k);
		int max = Integer.MIN_VALUE;
		for (int i = j - 1; i > 0; i--) {
			int profit = a.get(j - 1) - a.get(i - 1)
					+ maxiMizeProfit(a, i, k - 1);
			if (profit > max)
				max = profit;

		}
		int maxProfit = Math.max(noTrans, max);
		memory[k][j] = maxProfit;
		return maxProfit;

	}
}
