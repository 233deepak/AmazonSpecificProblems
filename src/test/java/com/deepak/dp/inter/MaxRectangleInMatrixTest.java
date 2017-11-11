package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxRectangleInMatrixTest {

	@Test
	public void _3_3_matrix() throws Exception {
		MaxRectangleArea rectangleArea = new MaxRectangleArea();
		int[][] matrix = { { 1, 1, 1 }, { 0, 1, 1 }, { 1, 0, 0 } };
		int maxArea = rectangleArea.maximalRectangle(ArrayHelper
				.getList(matrix));
		assertEquals(4, maxArea);
	}

	@Test
	public void _5_5_matrix() throws Exception {
		MaxRectangleArea rectangleArea = new MaxRectangleArea();
		int[][] matrix = { { 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1, 1, 0 },
				{ 1, 1, 1, 1, 1, 0, 0, 0 }, { 0, 1, 1, 1, 1, 0, 0, 0 }, };
		int maxArea = rectangleArea.maximalRectangle(ArrayHelper
				.getList(matrix));
		assertEquals(21, maxArea);
	}

	@Test
	public void _5_6_matrix() throws Exception {
		MaxRectangleArea rectangleArea = new MaxRectangleArea();
		int[][] matrix = { { 0, 0, 1, 0, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 1, 0, 1, 0, 1 },
				{ 0, 1, 0, 0, 0, 1, 1, 0, 1 }, { 0, 1, 0, 0, 0, 0, 1, 1, 1 },
				{ 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 0, 1, 0, 1 } };

		int maxArea = rectangleArea.maximalRectangle(ArrayHelper
				.getList(matrix));
		assertEquals(9, maxArea);
	}

	@Test
	public void _10_10_matrix() throws Exception {
		MaxRectangleArea rectangleArea = new MaxRectangleArea();
		int[][] matrix = { { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0 },
				{ 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1 },
				{ 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 } };
		int maxArea = rectangleArea.maximalRectangle(ArrayHelper
				.getList(matrix));
		assertEquals(30, maxArea);
	}

	@Test
	public void _histogram() throws Exception {
		MaxRectangleArea rectangleArea = new MaxRectangleArea();
		int[] array = { 2, 1, 2, 3 };
		int maxArea = rectangleArea.findmaxArea(array, -1);
		assertEquals(4, maxArea);
	}

}
