package com.deepak.dp.inter;

import java.util.ArrayList;

public class UniquePathFinder {

	int[][] memory;

	public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> a) {
		if (a.size() == 0)
			return 0;
		memory = new int[a.size() + 1][a.get(0).size() + 1];
		for (int i = 0; i < a.size() + 1; i++)
			for (int j = 0; j < a.get(0).size() + 1; j++)
				memory[i][j] = -1;
		return path(a, a.size(), a.get(0).size());
	}

	private int path(ArrayList<ArrayList<Integer>> a, int i, int j) {
		if (i <= 0 || j <= 0)
			return 0;
		if (i == 1 && j == 1 && notObstacle(a, i, j))
			return 1;

		if (memory[i][j] != -1)
			return memory[i][j];

		int paths = 0;
		if (notObstacle(a, i, j)) {
			paths = path(a, i - 1, j) + path(a, i, j - 1);

		}
		memory[i][j] = paths;
		return paths;
	}

	private boolean notObstacle(ArrayList<ArrayList<Integer>> a, int i, int j) {
		return a.get(i - 1).get(j - 1) != 1;
	}

}
