package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rotate90Test {

	@Test
	public void _4_4matrix() throws Exception {
		RotateArray rotateArray = new RotateArray();
		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 },
				{ 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		rotateArray.rotate(matrix);

		assertEquals(4, matrix[0][0]);
	}

}
