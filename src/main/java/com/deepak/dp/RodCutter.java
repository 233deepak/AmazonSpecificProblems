package com.deepak.dp;

public class RodCutter {

	private int[] s;

	public int bootmUpCutRod(int[] p, int n, int cost) {
		int[] r = new int[n + 1];
		s = new int[n + 1];
		r[0] = 0;
		for (int j = 1; j <= n; j++) {
			int max = Integer.MIN_VALUE;
			for (int i = 1; i <= j; i++) {
				int temp = p[i - 1] + r[j - i];
				if (i != j)
					temp -= cost;
				if (temp > max) {
					max = temp;
					s[j] = i;
				}

			}
			r[j] = max;
		}
		return r[n];
	}

	public void printOptimalCuts(int n) {
		System.out.print("(");
		while (n > 0) {
			System.out.print(s[n]);
			n = n - s[n];
		}
		System.out.print(")");
	}

}
