package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistinctSubSequenceTest {

	@Test
	public void valid_strings() throws Exception {
		
		DistinctSubSequence subSequence =new DistinctSubSequence();
		int ways = subSequence.form("rabbbit","rabbit");
		assertEquals(3, ways);
		
		
	}
}
