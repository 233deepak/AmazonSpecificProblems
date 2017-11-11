package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestISequenceTest {

	@Test
	public void _9_element() throws Exception {

		int[] array = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		LongestISequence sequence = new LongestISequence();
		int lis = sequence.findLIS(array);
		assertEquals(6, lis);

	}

	@Test
	public void _5_element() throws Exception {

		int[] array = { 3, 10, 2, 1, 20 };
		LongestISequence sequence = new LongestISequence();
		int lis = sequence.findLIS(array);
		assertEquals(3, lis);

	}

}
