package com.deepak.dp.inter;

public class StairClimber {

	int[] memory;

	public int climbStairs(int a) {
		memory = new int[a + 1];
		for (int i = 0; i < memory.length; i++)
			memory[i] = -1;
		return climb(a);
	}

	public int climb(int stairLength) {
		if (stairLength < 0)
			return 0;
		if (stairLength == 0)
			return 1;

		if (memory[stairLength] != -1)
			return memory[stairLength];
		int ways = 0;
		ways += climb(stairLength - 1);
		ways += climb(stairLength - 2);
		memory[stairLength] = ways;
		return ways;
	}

}
