package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestAreauHistogramTest {

	@Test
	public void _7_element() throws Exception {
		int[] array = { 6, 2, 5, 4, 5, 1, 6 };
		Histogram histogram = new Histogram();
		int area = histogram.findArea(array);
		assertEquals(12, area);

	}

}
