package com.deepak.dp;

public class MatrixChainMultplier {

	public int multiply(int n, int[] p) {
		int[][] m = new int[n + 1][n + 1];
		init(n, m);
		for (int l = 1; l <= n; l++) {
			for (int i = 1; i <= n - l; i++) {
				int j = i + l;
				int min = Integer.MAX_VALUE;
				for (int k = i; k < j; k++) {
					int cost = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
					if (cost < min) {
						min = cost;
					}

				}
				m[i][j] = min;
			}
		}

		return m[1][n];
	}

	private void init(int n, int[][] m) {
		for (int i = 0; i < n + 1; i++)
			m[i][i] = 0;
	}

}
