package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestValidParantesisTest {

	@Test
	public void _6_element() throws Exception {

		LongestValid longestValid = new LongestValid();
		int length = longestValid.findLongestLength(")()())");
		assertEquals(4, length);

	}
}
