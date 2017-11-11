package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniquePathInGridTest {

	@Test
	public void _3_3_grid() throws Exception {
		UniquePathFinder pathFinder = new UniquePathFinder();
		int[][] grid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int path = pathFinder.uniquePathsWithObstacles(ArrayHelper
				.getList(grid));
		assertEquals(2, path);

	}

}
