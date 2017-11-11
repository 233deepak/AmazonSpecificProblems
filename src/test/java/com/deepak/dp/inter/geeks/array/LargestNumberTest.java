package com.deepak.dp.inter.geeks.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestNumberTest {

	@Test
	public void largestString() throws Exception {
		int array[] = { 54, 546, 548, 60 };
		LargestNumber largestNumber = new LargestNumber();
		largestNumber.sort(array);
		assertEquals(60, array[0]);

	}
	
	@Test
	public void largest10() throws Exception {
		int array[] = { 1, 34, 3, 98, 9, 76, 45, 4 };
		LargestNumber largestNumber = new LargestNumber();
		largestNumber.sort(array);
		assertEquals(98, array[0]);
		assertEquals(9, array[1]);

	}

}
