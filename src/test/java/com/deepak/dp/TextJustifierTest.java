package com.deepak.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextJustifierTest {
	
	@Test
	public void justifyEmptyString() throws Exception {
		TextJustifier justifier =new TextJustifier();
		int minBadness= justifier.printNeatly("");
		assertEquals(minBadness, 0);
	}
	
	@Test
	public void justifyLongString() throws Exception {
		TextJustifier justifier =new TextJustifier();
		String line = "Geeks for Geeks";
		int minBadness= justifier.printNeatly(line);
		assertEquals(minBadness, 0);
		
	}

}
