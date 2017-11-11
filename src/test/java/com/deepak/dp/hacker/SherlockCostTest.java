package com.deepak.dp.hacker;

import static org.junit.Assert.*;

import org.junit.Test;

public class SherlockCostTest {

	@Test
	public void sherlock_2_elements() throws Exception {
		int[] b = { 10, 1 };
		SherlockCost sherlockCost = new SherlockCost();
		int cost = sherlockCost.maximizeCost(b);
		assertEquals(9, cost);
	}

	@Test
	public void sherlock_5_elements() throws Exception {
		int[] b = { 10, 1, 10, 1, 10 };
		SherlockCost sherlockCost = new SherlockCost();
		int cost = sherlockCost.maximizeCost(b);
		assertEquals(36, cost);
	}

	@Test
	public void sherlock_large_elements() throws Exception {
		int[] b = { 100, 2, 100, 2, 100 };
		SherlockCost sherlockCost = new SherlockCost();
		int cost = sherlockCost.maximizeCost(b);
		assertEquals(396, cost);

	}

	@Test
	public void sherlock_3_elements() throws Exception {
		int[] b = { 2, 4, 3 };
		SherlockCost sherlockCost = new SherlockCost();
		int cost = sherlockCost.maximizeCost(b);
		System.out.println(cost);
		assertEquals(6, cost);

	}

}
