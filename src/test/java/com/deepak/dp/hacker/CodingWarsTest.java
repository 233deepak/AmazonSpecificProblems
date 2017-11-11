package com.deepak.dp.hacker;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodingWarsTest {
	
	@Test
	public void base_case() throws Exception {
		
		CodingWar codingWar = new CodingWar();
		int ways =CodingWar.getCountOfPossibleTeams(new int[]{5,2,3,1,4});
		assertEquals(3, ways);
	}

}
