package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class EditDistanceTest {
	
	@Test
	public void distance_1() throws Exception {
		EditDistance distance = new EditDistance();
		int dist = distance.findDis("geek","gesek");
		assertEquals(1, dist);
		
	}

}
