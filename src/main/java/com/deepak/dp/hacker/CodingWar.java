package com.deepak.dp.hacker;

public class CodingWar {

	static int memory[][];

	static int getCountOfPossibleTeams(int[] coders) {
		int array[] = new int[3];
		/*memory = new int[4][coders.length + 1];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < coders.length + 1; j++)
				memory[i][j] = -1;*/
		return getCount(3, coders.length, array, coders);
	}

	private static int getCount(int i, int length, int[] array, int coders[]) {
		if (i == 0) {
			return fitConstrains(array) ? 1 : 0;
		}

		if (i > length)
			return 0;
		/*if(memory[i][j]!=-1)
			return */
		int ways = 0;
		array[i - 1] = coders[length - 1];
		ways += getCount(i - 1, length - 1, array, coders);
		array[i - 1] = 0;
		ways += getCount(i, length - 1, array, coders);
		return ways;
	}

	private static boolean fitConstrains(int[] array) {
		if (array[0] > array[1] && array[1] > array[2])
			return true;
		if (array[0] < array[1] && array[1] < array[2])
			return true;
		return false;
	}
}
