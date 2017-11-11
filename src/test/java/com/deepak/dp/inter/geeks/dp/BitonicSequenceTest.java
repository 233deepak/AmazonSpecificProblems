package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitonicSequenceTest {

	@Test
	public void _6_element() throws Exception {
		int[] array = { 12, 11, 40, 5, 3, 1 };
		BitonicSequence biSequence = new BitonicSequence();
		int length = biSequence.findSeauence(array);
		assertEquals(5, length);
	}

}
