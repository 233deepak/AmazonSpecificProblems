package com.deepak.dp.inter.geeks.array;

public class RotateMatrix {

	public void rotateAntiClockWise(int[][] matrix) {

		rotateAntiClockWise(matrix, 1, matrix[0].length, 1, matrix.length);

	}

	private void rotateAntiClockWise(int[][] matrix, int l, int r, int t, int b) {

		if (t > b || l > r)
			return;

		for (int i = l; i < r; i++) {
			int temp1 = matrix[t - 1][i - 1];
			int temp2 = matrix[matrix.length - i][l - 1];
			int temp3 = matrix[b - 1][matrix.length - i];
			int temp4 = matrix[i - 1][r - 1];

			matrix[t - 1][i - 1] = temp4;
			matrix[matrix.length - i][l - 1] = temp1;
			matrix[b - 1][matrix.length - i] = temp2;
			matrix[i - 1][r - 1] = temp3;
		}

		t++;
		b--;
		l++;
		r--;
		rotateAntiClockWise(matrix, l, r, t, b);

	}

}
