package com.deepak.dp.inter;

import java.util.ArrayList;

public class DungeonPrincess {

	int[][] memory;

	public int calculateMinimumHP(ArrayList<ArrayList<Integer>> a) {
		if (a.size() == 0)
			return 0;
		memory = new int[a.size() + 1][a.get(0).size() + 1];
		for (int i = 0; i <= a.size(); i++)
			for (int j = 0; j <= a.get(0).size(); j++)
				memory[i][j] = -1;
		return minPath(a, 1, 1);
	}

	private int minPath(ArrayList<ArrayList<Integer>> a, int i, int j) {

		if (i > a.size() || j > a.get(0).size())
			return Integer.MAX_VALUE;
		if (a.size() == i && a.get(0).size() == j) {
			int value = a.get(i - 1).get(j - 1);
			return Math.max(1,1-value);
		}

		if (memory[i][j] != -1)
			return memory[i][j];
		int value = a.get(i - 1).get(j - 1);
		int down = minPath(a, i + 1, j);
		int right = minPath(a, i, j + 1);
		int min = Math.min(down, right);
		int sum = min - value;
		sum=Math.max(1, sum);
		memory[i][j] = sum;
		return sum;
	}

}
