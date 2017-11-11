package com.deepak.dp.inter.geeks.array;

import java.util.ArrayList;

public class DuplicateInArray {

	public ArrayList<Integer> findDup(int[] array) {

		ArrayList<Integer> integers = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			int index = array[i];
			if (array[index-1] < 0)
				integers.add(index);
			array[Math.abs(index)-1] = -Math.abs(index );
		}

		return integers;
	}

}
