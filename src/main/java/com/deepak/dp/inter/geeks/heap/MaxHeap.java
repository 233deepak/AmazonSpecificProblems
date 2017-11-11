package com.deepak.dp.inter.geeks.heap;

public class MaxHeap {

	int heapSize;
	int[] array;

	public void build(int[] array) {
		this.array = array;
		heapSize = array.length;
		for (int i = array.length / 2; i > 0; i--) {
			heapify(array, i);
		}

	}

	private void heapify(int[] array, int i) {

		if (i > array.length / 2)
			return;

		int rightIndex = 2 * i + 1;
		int leftIndex = 2 * i;
		int largest = i;

		if (leftIndex <= heapSize && array[leftIndex - 1] > array[i - 1])
			largest = leftIndex;

		if (rightIndex <= heapSize
				&& array[rightIndex - 1] > array[largest - 1])
			largest = rightIndex;

		if (largest != i) {
			swap(array, largest, i);
			heapify(array, largest);
		}
	}

	private void swap(int[] array, int largest, int i) {
		int temp = array[largest - 1];
		array[largest - 1] = array[i - 1];
		array[i - 1] = temp;
	}

	public int extractMax() {

		if (heapSize < 1) {
			return -1;
		}

		int max = array[0];
		swap(array, 1, heapSize);
		heapify(array, 1);
		heapSize = heapSize - 1;
		return max;
	}

	public void increaseKey(int i, int key) {
		if (i > heapSize)
			return;

		array[i - 1] = key;
		while (i > 1 && array[i - 1] > array[(i / 2) - 1]) {
			swap(array, i, (i / 2));
			i = (i / 2);
		}

	}

	public void insert(int key) {
		heapSize = heapSize + 1;
		array[heapSize - 1] = Integer.MAX_VALUE;
		increaseKey(heapSize, key);

	}

	public void setArray(int i) {
		this.array = new int[i];
		heapSize = 0;

	}
}
