package com.deepak.dp.inter.geeks.array;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DuplicateInArrayTest {

	@Test
	public void _7_element_array() throws Exception {
		DuplicateInArray duplicateInArray = new DuplicateInArray();
		ArrayList<Integer> integers = duplicateInArray.findDup(new int[] { 1,
				2, 3, 1, 3, 6, 6 });
		assertTrue(integers.contains(1));
		assertTrue(integers.contains(3));
		assertTrue(integers.contains(6));

	}

}
