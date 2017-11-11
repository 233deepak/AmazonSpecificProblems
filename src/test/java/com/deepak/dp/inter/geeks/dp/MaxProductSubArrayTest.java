package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxProductSubArrayTest {

	@Test
	public void _5array_element() throws Exception {

		int array[] = { 6, -3, -10, 0, 2 };
		MaxProduct maxProduct = new MaxProduct();
		int max = maxProduct.findMaxP(array);
		assertEquals(180, max);

	}

	@Test
	public void _6array_element() throws Exception {

		int array[] = { -1, -3, -10, 0, 60 };
		MaxProduct maxProduct = new MaxProduct();
		int max = maxProduct.findMaxP(array);
		assertEquals(60, max);

	}

}
