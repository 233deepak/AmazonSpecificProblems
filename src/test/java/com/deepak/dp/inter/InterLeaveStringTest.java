package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterLeaveStringTest {

	@Test
	public void basecase() throws Exception {
		InterleavingFinder finder = new InterleavingFinder();
		int way = finder.isInterleave("aabcc", "dbbca", "aadbbcbcac");
		assertEquals(1, way);
	}
	
	@Test
	public void basecase_negative() throws Exception {
		InterleavingFinder finder = new InterleavingFinder();
		int way = finder.isInterleave("aabcc", "dbbca", "aadbbbaccc");
		assertEquals(0, way);
	}

}
