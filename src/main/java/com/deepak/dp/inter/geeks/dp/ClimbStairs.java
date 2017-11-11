package com.deepak.dp.inter.geeks.dp;

public class ClimbStairs {

	int[] memory;

	public int climb(int noOFStairs) {
		memory = new int[noOFStairs + 1];
		for (int i = 0; i < noOFStairs + 1; i++) {
			memory[i] = -1;
		}

		return waysToClimb(noOFStairs);
	}

	private int waysToClimb(int i) {

		if (i < 0)
			return 0;
		if (i == 0)
			return 1;

		if (memory[i] != -1)
			return memory[i];

		int ways = 0;
		ways += waysToClimb(i - 1);
		ways += waysToClimb(i - 2);
		memory[i] = ways;
		return ways;
	}

}
