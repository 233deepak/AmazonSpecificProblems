package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestRectanleTest {

	@Test
	public void _3_5() throws Exception {

		LargestRectangle largestRectangle = new LargestRectangle();
		int[][] grid = new int[][] { { 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 1 },
				{ 1, 1, 0, 1, 0 } };
		int maxArea = largestRectangle.solve(ArrayHelper.getList(grid));
		assertEquals(6, maxArea);

	}

	@Test
	public void _3_3() throws Exception {

		LargestRectangle largestRectangle = new LargestRectangle();
		int[][] grid = new int[][] { { 1, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } };
		int maxArea = largestRectangle.solve(ArrayHelper.getList(grid));
		assertEquals(2, maxArea);

	}

	@Test
	public void _30_1() throws Exception {

		LargestRectangle largestRectangle = new LargestRectangle();
		int[][] grid = new int[][] { { 1 }, { 0 }, { 1 }, { 0 }, { 1 }, { 0 },
				{ 1 }, { 1 }, { 1 }, { 0 }, { 0 }, { 1 }, { 0 }, { 0 }, { 1 },
				{ 0 }, { 0 }, { 0 }, { 0 }, { 1 }, { 1 }, { 1 }, { 0 }, { 1 },
				{ 0 }, { 1 }, { 0 }, { 0 }, { 1 }, { 0 }, { 0 }, { 1 }, { 0 },
				{ 0 }, { 0 }, { 0 }, { 1 }, { 1 }, { 1 }, { 0 }, { 0 }, { 0 },
				{ 0 }, { 0 }, { 1 }, { 0 }, { 0 }, { 1 }, { 1 }, { 1 }, { 0 },
				{ 1 }, { 1 }, { 0 }, { 0 }, { 0 }, { 0 }, { 1 }, { 0 }, { 1 },
				{ 0 }, { 1 }, { 1 }, { 1 }, { 0 }, { 1 }, { 1 }, { 1 }, { 1 },
				{ 1 }, { 1 }, { 1 }, { 0 }, { 1 }, { 1 }, { 1 }, };
		int maxArea = largestRectangle.solve(ArrayHelper.getList(grid));
		assertEquals(8, maxArea);

	}
}
