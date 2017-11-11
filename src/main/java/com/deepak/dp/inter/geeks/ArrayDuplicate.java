package com.deepak.dp.inter.geeks;

public class ArrayDuplicate {

	public void printDuplicate(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int indexElement = Math.abs(array[i]);
			if (array[indexElement] < 0) {
				System.out.println(indexElement);
			} else {
				array[indexElement] = -array[indexElement];
			}
		}

	}
}
