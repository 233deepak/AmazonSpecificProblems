package com.deepak.dp.inter.geeks.heap;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergerKSortedListTest {

	@Test
	public void merge_3_list() throws Exception {

		int[][] matrix = { { 1, 3, 5, 7 }, { 2, 4, 6, 8 }, { 0, 9, 10, 11 } };

		MergerArray mergerArray = new MergerArray();
		int array[] = mergerArray.merge(matrix);
		assertEquals(11, array[0]);
		assertEquals(0, array[11]);

	}

}
