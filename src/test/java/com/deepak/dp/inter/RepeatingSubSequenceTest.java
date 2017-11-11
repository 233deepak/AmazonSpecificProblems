package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class RepeatingSubSequenceTest {

	@Test
	public void string_length_4() throws Exception {
		RepeatingSequenceFinder sequence = new RepeatingSequenceFinder();
		int isPresent = sequence.anytwo("abab");
		assertEquals(1, isPresent);

	}
	
	@Test
	public void string_length_0() throws Exception {
		RepeatingSequenceFinder sequence = new RepeatingSequenceFinder();
		int isPresent = sequence.anytwo("abba");
		assertEquals(0, isPresent);

	}
}
