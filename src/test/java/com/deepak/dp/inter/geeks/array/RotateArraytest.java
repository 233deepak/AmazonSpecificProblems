package com.deepak.dp.inter.geeks.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateArraytest {

	@Test
	public void roata3_3_matrix() throws Exception {

		RotateMatrix rotateMatrix = new RotateMatrix();
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };

		rotateMatrix.rotateAntiClockWise(matrix);
		assertEquals(4, matrix[0][0]);

	}

}
