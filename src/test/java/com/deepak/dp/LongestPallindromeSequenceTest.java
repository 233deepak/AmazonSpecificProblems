package com.deepak.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestPallindromeSequenceTest {
	
	@Test
	public void stringWithLengt5() throws Exception {
		LPalindromeSequqnece lps = new LPalindromeSequqnece();
		int lenght = lps.longestPallindromelength("civic");
		assertEquals(5, lenght);
	}
	
	@Test
	public void stringWithLength7() throws Exception {
		LPalindromeSequqnece lps = new LPalindromeSequqnece();
		int lenght = lps.longestPallindromelength("racecar");
		assertEquals(7, lenght);
	}
	
	@Test
	public void stringWithLength5() throws Exception {
		LPalindromeSequqnece lps = new LPalindromeSequqnece();
		int lenght = lps.longestPallindromelength("character");
		assertEquals(5, lenght);
	}

}
