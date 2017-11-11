package com.deepak.dp.inter;

import java.util.ArrayList;

public class LargestRectangle {

	public int solve(ArrayList<ArrayList<Integer>> A) {

		int[][] hist = new int[A.size()][A.get(0).size()];

		for (int c = 0; c < A.get(0).size(); c++) {
			for (int r = 0; r < A.size(); r++) {
				Integer currentNumber = A.get(r).get(c);
				if (r == 0)
					hist[r][c] = currentNumber;
				else if (currentNumber == 0) {
					hist[r][c] = 0;
				} else {
					hist[r][c] = hist[r - 1][c] + currentNumber;
				}
			}
		}

		for (int r = 0; r < A.size(); r++) {
			hist[r] = sort(hist[r], hist.length);
		}

		int globalMax = Integer.MIN_VALUE;
		for (int r = 0; r < A.size(); r++) {
			for (int c = 0; c < A.get(0).size(); c++) {
				int temp = hist[r][c] * (c + 1);
				if (temp > globalMax)
					globalMax = temp;
			}
		}

		return globalMax;

	}

	private int[] sort(int[] array, int k) {
		int[] b = new int[array.length];
		int[] c = new int[k + 1];
		for (int i = 0; i < array.length; i++) {
			c[array[i]] = c[array[i]] + 1;
		}

		for (int i = c.length - 2; i >= 0; i--) {
			c[i] = c[i] + c[i + 1];
		}

		for (int i = array.length - 1; i >= 0; i--) {
			b[c[array[i]] - 1] = array[i];
			c[array[i]] = c[array[i]] - 1;
		}
		return b;
	}
}
