package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterleavingStringTest {

	@Test
	public void _3_string() throws Exception {

		Interleaved interleaved = new Interleaved();
		assertTrue(interleaved.canForm("aadbbcbcac", "aabcc", "dbbca"));

	}
	
	@Test
	public void _invalid_string() throws Exception {

		Interleaved interleaved = new Interleaved();
		assertFalse(interleaved.canForm("aadbbbaccc", "aabcc", "dbbca"));

	}

}
