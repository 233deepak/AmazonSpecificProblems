package com.deepak.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestSequenceTest {

	@Test
	public void longestSequenceOfLength1() throws Exception {
		LongestISequence lis = new LongestISequence();
		int[] array = { 9 };
		int length = lis.findLis(array);
		assertEquals(1, length);
	}

	@Test
	public void longestSequenceOfLength6() throws Exception {
		LongestISequence lis = new LongestISequence();
		int[] array = { 9, 4, 5, 1, 8, 10 };
		int length = lis.findLis(array);
		assertEquals(4, length);
	}

}
