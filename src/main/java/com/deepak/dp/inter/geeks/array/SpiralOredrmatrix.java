package com.deepak.dp.inter.geeks.array;

import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

public class SpiralOredrmatrix {

	ArrayList<Integer> result;

	public ArrayList<Integer> traverse(int[][] matrix) {
		result = new ArrayList<Integer>();
		traverse(matrix, 1, matrix[0].length, 1, matrix.length);
		return result;
	}

	private void traverse(int[][] matrix, int l, int r, int t, int b) {

		if (t > b || l > r)
			return;
		for (int i = l; i <= r; i++)
			result.add(matrix[t - 1][i - 1]);
		for (int i = t + 1; i <= b; i++)
			result.add(matrix[i - 1][r - 1]);
		for (int i = r - 1; i >= l; i--)
			result.add(matrix[b - 1][i - 1]);
		for (int i = b - 1; i >= t + 1; i--)
			result.add(matrix[i - 1][l-1]);

		l++;
		r--;
		t++;
		b--;
		traverse(matrix, l, r, t, b);

	}
}
