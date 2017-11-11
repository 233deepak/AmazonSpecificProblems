package com.deepak.dp.inter;

import java.util.List;

public class MaxContiniousProd {

	int[][] memory;

	public int maxProduct(final List<Integer> a) {
		memory = new int[a.size() + 1][a.size() + 1];
		for (int i = 0; i <= a.size(); i++)
			for (int j = 0; j <= a.size(); j++)
				memory[i][j] = Integer.MIN_VALUE;
		return maxProduct(a, 1, a.size());

	}

	private int maxProduct(List<Integer> a, int i, int j) {
		if (i == j)
			return a.get(i - 1);
		int mid = (i + j) / 2;
		int left = maxProduct(a, i, mid);
		int right = maxProduct(a, mid + 1, j);
		int merge = merge(a, i, j, mid);
		return max(left, right, merge);
	}

	private int max(int left, int right, int merge) {
		return Math.max(Math.max(left, right), merge);
	}

	private int merge(List<Integer> a, int i, int j, int mid) {
		int leftProduct = 1;
		int index = mid;
		if (a.get(mid - 1) == 0 || a.get(mid) == 0)
			return 0;

		while (index >= i) {
			Integer value = a.get(index - 1);
			if (value == 0)
				break;
			int temp = leftProduct * value;
			if (temp > leftProduct)
				leftProduct = temp;
			index--;
		}

		int rightProduct = 1;
		index = mid + 1;

		while (index <= j) {
			Integer value = a.get(index - 1);
			if (value == 0)
				break;
			int temp = rightProduct * value;
			if (temp > rightProduct)
				rightProduct = temp;
			
			index++;
		}

		return leftProduct * rightProduct;
	}
}
