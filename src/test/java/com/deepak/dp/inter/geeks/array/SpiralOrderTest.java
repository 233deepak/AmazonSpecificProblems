package com.deepak.dp.inter.geeks.array;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SpiralOrderTest {

	@Test
	public void _4_4matrix() throws Exception {

		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		SpiralOredrmatrix spiralOredrmatrix = new SpiralOredrmatrix();
		ArrayList<Integer> spiral = spiralOredrmatrix.traverse(matrix);
		assertEquals(1, spiral.get(0).intValue());
		//assertEquals(8, spiral.get(7).intValue());
		//assertEquals(1, spiral.get(10).intValue());
		assertEquals(10, spiral.get(15).intValue());
		

	}

}
