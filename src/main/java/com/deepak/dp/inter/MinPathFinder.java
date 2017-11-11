package com.deepak.dp.inter;

import java.util.ArrayList;

public class MinPathFinder {

	int[][] memory;

	public int minPathSum(ArrayList<ArrayList<Integer>> a) {
		if (a.size() == 0)
			return 0;

		memory = new int[a.size() + 1][a.get(0).size() + 1];
		for (int i = 0; i <= a.size(); i++)
			for (int j = 0; j <= a.get(0).size(); j++)
				memory[i][j] = -1;
		return minPath(a, a.size(), a.get(0).size());
	}

	private int minPath(ArrayList<ArrayList<Integer>> a, int m, int n) {
		if (m < 1 || n < 1)
			return Integer.MAX_VALUE;

		if (m == 1 && n == 1)
			return a.get(m - 1).get(n - 1);
		if (memory[m][n] != -1)
			return memory[m][n];
		int sum = 0;
		Integer currentNode = a.get(m - 1).get(n - 1);
		sum = currentNode + min(minPath(a, m - 1, n), minPath(a, m, n - 1));
		memory[m][n] = sum;
		return sum;
	}

	private Integer min(int i, int j) {
		return (i < j) ? i : j;
	}
}
