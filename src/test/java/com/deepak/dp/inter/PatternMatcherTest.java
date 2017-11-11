package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatternMatcherTest {

	@Test
	public void simpleTextCase() throws Exception {
		PatternMatcher matcher = new PatternMatcher();
		int match = matcher.isMatch("ab", "?*");
		assertEquals(1, match);

	}
	
	@Test
	public void no_wild_cards() throws Exception {
		PatternMatcher matcher = new PatternMatcher();
		int match = matcher.isMatch("aa", "a");
		assertEquals(0, match);

	}
	
	@Test
	public void simple_text() throws Exception {
		PatternMatcher matcher = new PatternMatcher();
		int match = matcher.isMatch("aa", "aa");
		assertEquals(1, match);

	}
	
	@Test
	public void complex_text() throws Exception {
		PatternMatcher matcher = new PatternMatcher();
		int match = matcher.isMatch("aab", "c*a*b");
		assertEquals(0, match);

	}
	
	@Test
	public void complex_text_1() throws Exception {
		PatternMatcher matcher = new PatternMatcher();
		int match = matcher.isMatch("aaa", "*");
		assertEquals(1, match);

	}
	
	@Test
	public void complex_text_5() throws Exception {
		PatternMatcher matcher = new PatternMatcher();
		int match = matcher.isMatch("cc", "***??");
		assertEquals(1, match);

	}
	
	@Test
	public void complex_text_6() throws Exception {
		PatternMatcher matcher = new PatternMatcher();
		int match = matcher.isMatch("acba", "*?b*a*ba*");
		assertEquals(0, match);

	}
	
	

}
