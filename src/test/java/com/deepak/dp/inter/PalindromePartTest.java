package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromePartTest {

	@Test
	public void _length_3() throws Exception {

		PalindromePart part = new PalindromePart();
		int min = part.minCut("aab");
		assertEquals(1, min);
	}
	
	@Test
	public void _length_4() throws Exception {

		PalindromePart part = new PalindromePart();
		int min = part.minCut("aabb");
		assertEquals(1, min);
	}
	
	@Test
	public void _length_6() throws Exception {

		PalindromePart part = new PalindromePart();
		int min = part.minCut("abaaba");
		assertEquals(0, min);
	}

}
