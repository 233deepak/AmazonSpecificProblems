package com.deepak.dp.inter;

import java.util.List;

public class BuySellStockWithKTransaction {

	int[][] memory;

	public int maxProfit(final List<Integer> a) {
		memory = new int[a.size() + 1][a.size() + 1];
		for (int i = 0; i < a.size() + 1; i++)
			for (int j = 0; j < a.size() + 1; j++)
				memory[i][j] = -1;
		return maxProfit(a, 0, 1);
	}

	private int maxProfit(List<Integer> a, int i, int j) {
		if (j > a.size())
			return 0;
		if (memory[i][j] != -1)
			return memory[i][j];
		int buy = maxProfit(a, i + 1, j + 1) - a.get(j - 1);
		int sell = 0;
		if (i > 0)
			sell = maxProfit(a, i - 1, j + 1) + a.get(j - 1) * i;
		int doNothing = maxProfit(a, i, j + 1);
		int profit = Math.max(buy, sell);
		profit = Math.max(doNothing, profit);
		memory[i][j] = profit;
		return profit;
	}
}
