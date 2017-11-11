package com.deepak.dp.inter;

import java.util.ArrayList;

public class ArrayHelper {
	public static  ArrayList<ArrayList<Integer>> getList(int[][] matrix) {
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
