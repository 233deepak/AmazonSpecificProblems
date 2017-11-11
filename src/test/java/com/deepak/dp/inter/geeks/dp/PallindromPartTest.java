package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class PallindromPartTest {

	@Test
	public void _3_lengthArray() throws Exception {

		Pallindrome pallindrome = new Pallindrome();
		int minCuts = pallindrome.mincusts("aab");
		assertEquals(1, minCuts);

	}
	
	@Test
	public void _6_lengthArray() throws Exception {

		Pallindrome pallindrome = new Pallindrome();
		int minCuts = pallindrome.mincusts("ababbbabbababa");
		assertEquals(3, minCuts);

	}

}
