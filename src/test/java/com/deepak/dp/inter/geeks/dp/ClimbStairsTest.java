package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClimbStairsTest {

	
	@Test
	public void _4_stairs() throws Exception {
		ClimbStairs climbStairs =new ClimbStairs();
		int ways = climbStairs.climb(4);
		assertEquals(5, ways);
		
	}
}
