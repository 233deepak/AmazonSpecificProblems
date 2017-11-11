package com.deepak.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RodCuttingTest {

	@Test
	public void rodOfLength4() throws Exception {
		RodCutter rodCutter = getRodCutter();
		int[] p = { 1, 5, 8, 9 };
		int profit = rodCutter.bootmUpCutRod(p, 4, 0);
		assertEquals(10, profit);
		rodCutter.printOptimalCuts(4);
	}

	@Test
	public void rodOfLength10() throws Exception {
		RodCutter rodCutter = getRodCutter();
		int[] p = { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
		int profit = rodCutter.bootmUpCutRod(p, 10, 0);
		assertEquals(30, profit);
	}

	private RodCutter getRodCutter() {
		RodCutter rodCutter = new RodCutter();
		return rodCutter;
	}

	@Test
	public void rodWithLength40() throws Exception {
		RodCutter rodCutter = getRodCutter();
		int[] price = new int[80];
		for (int i = 0; i < 80; i++) {
			price[i] = i;
		}
		int profit = rodCutter.bootmUpCutRod(price, 40, 0);
		assertEquals(39, profit);
		rodCutter.printOptimalCuts(40);
	}

	@Test
	public void rodWithLength4WithCost() throws Exception {
		RodCutter rodCutter = getRodCutter();
		int[] p = { 1, 5, 8, 9 };
		int profit = rodCutter.bootmUpCutRod(p, 4, 2);
		assertEquals(9, profit);
		rodCutter.printOptimalCuts(4);
	}

}
