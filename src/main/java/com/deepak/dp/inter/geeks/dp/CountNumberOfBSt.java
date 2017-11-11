package com.deepak.dp.inter.geeks.dp;

public class CountNumberOfBSt {

	public int count(int n) {
		return count(1, n);
	}

	private int count(int i, int n) {

		if (i == n)
			return 1;

		if (i > n)
			return 1;

		int count = 0;
		for (int k = i; k <= n; k++) {
			int left = count(i, k - 1);
			int right = count(k + 1, n);
			count += left * right;

		}
		return count;
	}
}
