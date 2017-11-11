package com.deepak.dp.inter;

public class EditDistance {

	private final int INSERT = 1;
	private final int DELETE = 1;
	private final int COPY = 0;
	private final int REPLACE = 1;

	int[][] cost;

	public int minDistance(String a, String b) {
		cost = new int[a.length() + 1][b.length() + 1];
		for (int i = 0; i <= a.length(); i++)
			for (int j = 0; j <= b.length(); j++)
				cost[i][j] = -1;
		return min(a, a.length() - 1, b, b.length() - 1);

	}

	private int min(String a, int i, String b, int j) {
		if (j < 0 && i > j)
			return DELETE + min(a, i - 1, b, j);
		if (j < 0)
			return 0;
		if (i < 0)
			return INSERT + min(a, i, b, j - 1);

		if (cost[i][j] != -1)
			return cost[i][j];
		if (a.charAt(i) == b.charAt(j)) {
			int j2 = COPY + min(a, i - 1, b, j - 1);
			cost[i][j] = j2;
			return j2;
		} else {
			int findMin = findMin(INSERT + min(a, i, b, j - 1),
					DELETE + min(a, i - 1, b, j),
					REPLACE + min(a, i - 1, b, j - 1));
			cost[i][j] = findMin;
			return findMin;
		}
	}

	private int findMin(int i, int j, int k) {
		int min = (i < j) ? i : j;
		return (min < k) ? min : k;
	}

}
