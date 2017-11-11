package com.deepak.dp.inter;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class CoinInfiniteTest {

	@Test
	public void exchange_4() throws Exception {

		CoinExchange coinExchange = new CoinExchange();
		ArrayList<Integer> coins = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		int ways = coinExchange.coinchange2(coins, 4);
		Assert.assertEquals(4, ways);
	}
	
	@Test
	public void exchange_458() throws Exception {

		CoinExchange coinExchange = new CoinExchange();
		ArrayList<Integer> coins = new ArrayList<Integer>(Arrays.asList(18, 24, 23, 10, 16, 19, 2, 9, 5, 12, 17, 3, 28, 29, 4, 13, 15, 8));
		int ways = coinExchange.coinchange2(coins, 458);
		Assert.assertEquals(867621, ways);
	}

}
