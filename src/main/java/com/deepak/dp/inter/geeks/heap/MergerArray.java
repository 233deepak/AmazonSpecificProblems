package com.deepak.dp.inter.geeks.heap;

public class MergerArray {

	public int[] merge(int[][] matrix) {
		MaxHeap heap = new MaxHeap();
		heap.setArray(matrix.length * matrix[0].length);
		for (int[] array : matrix) {
			for (int x : array) {
				heap.insert(x);
			}
		}

		return heap.array;
	}
}
