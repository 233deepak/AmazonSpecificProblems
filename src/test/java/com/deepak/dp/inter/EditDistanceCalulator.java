package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class EditDistanceCalulator {
	
	@Test
	public void twoString() throws Exception {
		
		 EditDistance editDistance = new EditDistance();
		 int minDist = editDistance.minDistance("Anshuman", "Antihuman");
		 assertEquals(2, minDist);
		
	}

}
