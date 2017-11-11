package com.deepak.dp.inter;

import java.util.ArrayList;

public class MinSumPathTriangle {

	int memory[][];

	public int minimumTotal(ArrayList<ArrayList<Integer>> a) {

		memory = new int[a.size() + 1][a.size() + 1];
		for (int i = 0; i < a.size() + 1; i++)
			for (int j = 0; j < a.size() + 1; j++)
				memory[i][j] = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.get(a.size() - 1).size(); i++) {
			int temp = minPath(a, a.size(), a.size() - i);
			if (temp < min)
				min = temp;
		}
		return min;
	}

	public int minPath(ArrayList<ArrayList<Integer>> a, int i, int j) {
		if(i==1 && j==1)
			return a.get(i-1).get(j-1);
		
		if (i <= 0 || j <= 0)
			return Integer.MAX_VALUE;

		if (!validColumn(a, i, j))
			return Integer.MAX_VALUE;

		if (memory[i][j] != -1)
			return memory[i][j];
		int sum = 0;
		int r1 = minPath(a, i - 1, j);
		int r2 = minPath(a, i - 1, j - 1);
		//int r3 = minPath(a, i - 1, j + 1);
		Integer min = min(r1, r2);
		sum = a.get(i - 1).get(j - 1) + ((min==Integer.MAX_VALUE)?0:min);
		memory[i][j] = sum;
		return sum;
	}

	private boolean validColumn(ArrayList<ArrayList<Integer>> a, int i, int j) {

		return j <= a.get(i - 1).size();
	}

	private Integer min(int i, int j) {
		return (i < j) ? i : j;
	}

}
