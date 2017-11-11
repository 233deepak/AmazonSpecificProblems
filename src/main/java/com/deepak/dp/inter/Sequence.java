package com.deepak.dp.inter;

public class Sequence {

	int[][] memory;

	public int numDistinct(String s, String t) {
		memory = new int[s.length() + 1][t.length() + 1];
		for (int i = 0; i < s.length() + 1; i++)
			for (int j = 0; j < t.length() + 1; j++)
				memory[i][j] = -1;
		return numDistinct(s, t, s.length(), t.length());

	}

	private int numDistinct(String s, String t, int i, int j) {
		if (j <= 0)
			return 1;
		if (i <= 0 && j <= 0)
			return 1;
		if (i < j)
			return 0;
		if (memory[i][j] != -1)
			return memory[i][j];

		int sum = 0;
		sum += numDistinct(s, t, i - 1, j);
		if (s.charAt(i - 1) == t.charAt(j - 1))
			sum += numDistinct(s, t, i - 1, j - 1);
		memory[i][j] = sum;
		return sum;
	}
}
