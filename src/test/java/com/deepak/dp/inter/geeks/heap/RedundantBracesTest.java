package com.deepak.dp.inter.geeks.heap;

import static org.junit.Assert.*;

import org.junit.Test;

public class RedundantBracesTest {

	@Test
	public void _valid_redaundant_braces() throws Exception {
		
		RedundantBraces braces =new RedundantBraces();
		assertTrue(braces.isRedundant("((a+b)+((c+d)))"));
		
	}
	

	@Test
	public void _valid2_redaundant_braces() throws Exception {
		
		RedundantBraces braces =new RedundantBraces();
		assertTrue(braces.isRedundant("(((a+(b)))+(c+d))"));
		
	}
}
