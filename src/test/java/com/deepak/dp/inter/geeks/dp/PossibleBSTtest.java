package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class PossibleBSTtest {

	@Test
	public void _3_root() throws Exception {

		CountNumberOfBSt countNumberOfBSt = new CountNumberOfBSt();
		int count = countNumberOfBSt.count(3);
		assertEquals(5, count);

	}
	
	@Test
	public void _2_root() throws Exception {

		CountNumberOfBSt countNumberOfBSt = new CountNumberOfBSt();
		int count = countNumberOfBSt.count(2);
		assertEquals(2, count);

	}

}
