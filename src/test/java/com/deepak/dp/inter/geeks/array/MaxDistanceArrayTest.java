package com.deepak.dp.inter.geeks.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxDistanceArrayTest {

	@Test
	public void _9_elements() throws Exception {
		int[] array = { 34, 8, 10, 3, 2, 80, 30, 33 };
		MaxDistanceCalculator calculator = new MaxDistanceCalculator();
		int maxDist = calculator.maxDist(array);
		assertEquals(6, maxDist);

	}

}
