package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistinctSubsequenceTest {
	
	@Test
	public void length_4() throws Exception {
		Sequence sequence =new Sequence();
		int ways =sequence.numDistinct("rabbbit", "rabbit");
		assertEquals(3, ways);
		
	}
	
	@Test
	public void length_56() throws Exception {
		Sequence sequence =new Sequence();
		int ways =sequence.numDistinct("aaaababbababbaabbaaababaaabbbaaabbb", "bbababa");
		assertEquals(22113, ways);
		
	}

}
