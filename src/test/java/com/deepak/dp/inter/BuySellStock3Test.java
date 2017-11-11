package com.deepak.dp.inter;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BuySellStock3Test {

	@Test
	public void _3_days_prices() throws Exception {
		BuySellStock3  sellStock3 =new BuySellStock3();
		int maxProfit = sellStock3.maxProfit(Arrays.asList(1,2,3));
		assertEquals(2, maxProfit);
		
	}
	

	@Test
	public void _3__prices() throws Exception {
		BuySellArrayWay  sellStock3 =new BuySellArrayWay();
		int maxProfit = sellStock3.maxProfit(Arrays.asList(1,2,3));
		assertEquals(2, maxProfit);
		
	}
	
	@Test
	public void _2__prices() throws Exception {
		BuySellArrayWay  sellStock3 =new BuySellArrayWay();
		int maxProfit = sellStock3.maxProfit(Arrays.asList(1,2));
		assertEquals(1, maxProfit);
		
	}
}
