package com.deepak.dp.inter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MinSumPathTest {

	@Test
	public void _3_3_matrix() throws Exception {
		MinPathFinder finder = new MinPathFinder();
		int[][] matrix = { { 1, 3, 2 }, { 4, 3, 1 }, { 5, 6, 1 } };
		ArrayList<ArrayList<Integer>> a = getList(matrix);
		int minPath = finder.minPathSum(a);
        assertEquals(8, minPath);
	}

	private ArrayList<ArrayList<Integer>> getList(int[][] matrix) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < matrix.length; i++) {
			ArrayList<Integer> array = new ArrayList<Integer>();
			for (int j = 0; j < matrix[i].length; j++)
				array.add(matrix[i][j]);
			lists.add(array);
		}
		return lists;
	}
}
