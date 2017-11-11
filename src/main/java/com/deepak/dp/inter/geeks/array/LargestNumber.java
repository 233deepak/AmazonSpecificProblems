package com.deepak.dp.inter.geeks.array;

public class LargestNumber {

	public void sort(int[] array) {

		sort(array, 0, array.length - 1);
	}

	private void sort(int[] array, int p, int r) {

		if (p > r)
			return;

		int partition = partition(array, p, r);
		sort(array, p, partition - 1);
		sort(array, partition + 1, r);

	}

	private int partition(int[] array, int p, int r) {
		int x = array[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (compare(array[j], x) > 0) {
				i++;
				swap(array, i, j);
			}

		}
		i++;
		swap(array, i, r);
		return i;
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	private int compare(int i, int x) {
		String iStr = "" + i;
		String xStr = "" + x;
		return iStr.compareTo(xStr);
	}

}
