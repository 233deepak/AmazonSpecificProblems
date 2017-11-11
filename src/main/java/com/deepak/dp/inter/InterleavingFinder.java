package com.deepak.dp.inter;

public class InterleavingFinder {

	int[][][] memory;

	public int isInterleave(String a, String b, String c) {
		memory = new int[a.length() + 1][b.length() + 1][c.length() + 1];
		for (int i = 0; i < a.length()+1; i++)
			for (int j = 0; j < b.length() + 1; j++)
				for (int k = 0; k < c.length() + 1; k++)
					memory[i][j][k] = -1;

		int way = way(a, b, c, a.length(), b.length(), c.length());
		return (way > 0) ? 1 : 0;
	}

	private int way(String a, String b, String c, int i, int j, int k) {
		if (i <= 0 && j <= 0 && k <= 0)
			return 1;
		int ways = 0;
		if (memory[i][j][k] != -1)
			return memory[i][j][k];
		if (i > 0 && a.charAt(i - 1) == c.charAt(k - 1))
			ways += way(a, b, c, i - 1, j, k - 1);
		if (j > 0 && b.charAt(j - 1) == c.charAt(k - 1))
			ways += way(a, b, c, i, j - 1, k - 1);
		memory[i][j][k] = ways;
		return ways;
	}

}
