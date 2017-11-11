package com.deepak.dp.inter.geeks.heap;

import static org.junit.Assert.*;

import org.junit.Test;

public class RainWaterTrapTest {

	@Test
	public void _5_elements() throws Exception {

		RainWaterTrap rainWaterTrap = new RainWaterTrap();
		int count = rainWaterTrap.findTrap(new int[] { 3, 0, 0, 2, 0, 4 });
		assertEquals(10, count);
	}

	@Test
	public void _3_elements() throws Exception {

		RainWaterTrap rainWaterTrap = new RainWaterTrap();
		int count = rainWaterTrap.findTrap(new int[] { 2, 0, 2 });
		assertEquals(2, count);
	}

	@Test
	public void _10_elements() throws Exception {

		RainWaterTrap rainWaterTrap = new RainWaterTrap();
		int count = rainWaterTrap.findTrap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3,
				2, 1, 2, 1 });
		assertEquals(6, count);
	}
}
