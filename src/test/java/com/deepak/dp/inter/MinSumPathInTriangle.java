package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinSumPathInTriangle {

	@Test
	public void _4_4_matrix() throws Exception {
		MinSumPathTriangle minsuPathTriangle = new MinSumPathTriangle();
		int[][] array = { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };
		int minPath = minsuPathTriangle
				.minimumTotal(ArrayHelper.getList(array));
		assertEquals(11, minPath);

	}

	@Test
	public void _4_10_matrix() throws Exception {
		MinSumPathTriangle minsuPathTriangle = new MinSumPathTriangle();
		int[][] array = { { 9 }, { 1, 7 }, { 2, 3, 6 }, { 5, 5, 8, 1 },
				{ 4, 7, 1, 3, 8 }, { 4, 8, 0, 4, 6, 0 },
				{ 3, 2, 6, 9, 4, 1, 3 }, { 7, 8, 8, 3, 8, 1, 5, 3 },
				{ 5, 4, 3, 6, 5, 9, 5, 4, 9 }, { 1, 7, 5, 5, 4, 1, 8, 8, 3, 5 }

		};
		int minPath = minsuPathTriangle
				.minimumTotal(ArrayHelper.getList(array));
		assertEquals(33, minPath);

	}
	
	

}
