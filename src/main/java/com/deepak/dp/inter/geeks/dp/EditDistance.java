package com.deepak.dp.inter.geeks.dp;

public class EditDistance {

	public static int INSERT = 1;
	public static int DELETE = 1;
	public static int REPLACE = 1;

	int memory[][];

	public int findDis(String source, String target) {

		memory = new int[source.length() + 1][target.length() + 1];
		for (int i = 0; i < source.length() + 1; i++)
			for (int j = 0; j < target.length() + 1; j++)
				memory[i][j] = -1;

		return findDis(source, target, source.length(), target.length());
	}

	private int findDis(String source, String target, int i, int j) {

		if (i == 0 && j == 0)
			return 0;
		if (i == 0 && j > 0)
			return INSERT + findDis(source, target, i, j - 1);

		if (j == 0 && i > 0)
			return DELETE + findDis(source, target, i - 1, j);

		if (memory[i][j] != -1)
			return memory[i][j];
		int operation = Integer.MIN_VALUE;
		if (source.charAt(i-1) == target.charAt(j-1))
			findDis(source, target, i - 1, j - 1);
		else {
			int insert = INSERT + findDis(source, target, i, j - 1);
			int delete = DELETE + findDis(source, target, i - 1, j);
			int replace = REPLACE + findDis(source, target, i - 1, j - 1);
			operation = Math.min(delete, Math.min(insert, replace));
		}
		memory[i][j] = operation;
		return operation;
	}

}
