package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class StairsTest {

	@Test
	public void stairsWith3step() throws Exception {
		StairClimber stairs =new StairClimber();
		int ways = stairs.climbStairs(3);
		assertEquals(3, ways);
		
	}
	
	@Test
	public void stairsWith5step() throws Exception {
		StairClimber stairs =new StairClimber();
		int ways = stairs.climbStairs(5);
		assertEquals(8, ways);
		
	}
}
