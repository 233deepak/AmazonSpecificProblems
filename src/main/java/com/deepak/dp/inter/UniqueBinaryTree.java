package com.deepak.dp.inter;

public class UniqueBinaryTree {

	public int numTrees(int a) {
		return noofTree(1, a);
	}

	private int noofTree(int i, int a) {

		if (i >= a)
			return 1;

		int count = 0;
		for (int j = i; j <= a; j++) {
			int left = noofTree(i, j - 1);
			int right = noofTree(j + 1, a);
			count += left * right;
		}
		return count;
	}

}
