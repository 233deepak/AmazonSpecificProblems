package com.deepak.dp.inter;

import java.util.List;

public class BuySellStock3 {

	int memory[][];

	public int maxProfit(final List<Integer> a) {

		memory = new int[2][a.size() + 1];
		for (int i = 0; i < a.size() + 1; i++) {
			memory[0][i] = -1;
			memory[1][i] = -1;
		}
		return max(a, 0, 1);
	}

	private int max(List<Integer> a, int i, int j) {

		if (j > a.size())
			return 0;

		if (memory[i][j] != -1) {
			return memory[i][j];
		}
		int buySell = 0;
		if (i == 0) {
			buySell = max(a, i + 1, j + 1) - a.get(j - 1);
		} else {
			buySell = max(a, i - 1, j + 1) + a.get(j - 1);
		}
		int noTrans = max(a, i, j + 1);
		int max = Math.max(buySell, noTrans);
		memory[i][j] =max;
		return max;
	}

}
