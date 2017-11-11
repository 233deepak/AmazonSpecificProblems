package com.deepak.dp.inter.geeks.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class WaysTodecodeTest {

	@Test
	public void _3_length_message() throws Exception {
		DecodeMessage decodeMessage = new DecodeMessage();
		int ways = decodeMessage.wayToDecode("121");
		assertEquals(3, ways);

	}

}
