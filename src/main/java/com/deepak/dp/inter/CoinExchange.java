package com.deepak.dp.inter;

import java.util.ArrayList;

public class CoinExchange {

	int[][] memory;

	public int coinchange2(ArrayList<Integer> a, int b) {
		memory = new int[a.size()][b + 1];
		for (int i = 0; i < a.size(); i++)
			for (int j = 0; j < b + 1; j++)
				memory[i][j] = -1;
		return exchange(a, b, a.size() - 1);
	}

	private int exchange(ArrayList<Integer> a, int b, int i) {

		if (b < 0 || i < 0)
			return 0;
		if (b == 0)
			return 1;
		if (memory[i][b] != -1)
			return memory[i][b];
		long count = exchange(a, b - a.get(i), i) + exchange(a, b, i - 1);
		memory[i][b] = (int) (count % 1000007);
		return (int) (count % 1000007);
	}

}
