package com.deepak.dp.inter;

public class NDigitNumberFinder {

	int[][] memory;

	public int solve(int A, int B) {
		memory = new int[B+1][A+1];
		for (int i = 0; i < B+1; i++)
			for (int j = 0; j < A+1; j++)
				memory[i][j] = -1;
		long find = find(B, A);
		return (int) (find );
	}

	private long find(int s, int n) {
	    if (s < 0)
			return 0;
		if (n == 1) {
			return (s > 0 && s <= 9) ? 1 : 0;
		}

		if (memory[s][n] != -1)
			return memory[s][n] ;
		long ways = 0;
		for (int i = 0; i <= 9; i++) {
			ways += (find(s - i, n - 1));
		}
		memory[s][n] = (int) (ways%1000000007)  ;
		return ways%1000000007;
	}

}
