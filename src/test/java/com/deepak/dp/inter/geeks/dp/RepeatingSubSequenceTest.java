package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class RepeatingSubSequenceTest {

	@Test
	public void _4_element() throws Exception {
		RepeatingSequence reSequence = new RepeatingSequence();
	    boolean isPresent = reSequence.hasRepeat("abab");
	    assertEquals(true, isPresent);

	}

	@Test
	public void _7_element() throws Exception {
		RepeatingSequence reSequence = new RepeatingSequence();
	    boolean isPresent = reSequence.hasRepeat("aabebcdd");
	    assertEquals(true, isPresent);

	}
}
