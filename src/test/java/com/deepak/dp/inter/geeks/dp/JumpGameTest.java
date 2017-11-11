package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class JumpGameTest {

	@Test
	public void _5_element() throws Exception {

		int[] array = { 2, 3, 1, 1, 4 };
		Canreach canreach = new Canreach();
		assertTrue(canreach.canReach(array));

	}

	@Test
	public void _6_element() throws Exception {

		int[] array = { 3, 2, 1, 0, 4 };
		Canreach canreach = new Canreach();
		assertFalse(canreach.canReach(array));

	}

}
