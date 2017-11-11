package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestValidParanthesisTest {

	@Test
	public void _6_character() throws Exception {
		LongestParanthesis longestParanthesis = new LongestParanthesis();
		int length = longestParanthesis.longestValidParentheses(")()())");
		assertEquals(4, length);
	}
	
	@Test
	public void _61_character() throws Exception {
		LongestParanthesis longestParanthesis = new LongestParanthesis();
		int length = longestParanthesis.longestValidParentheses("(()())");
		assertEquals(6, length);
	}
	

	@Test
	public void _long_character() throws Exception {
		LongestParanthesis longestParanthesis = new LongestParanthesis();
		int length = longestParanthesis.longestValidParentheses(")()))(())((())))))())()(((((())())((()())(())((((())))())((()()))(()(((()()(()((()()))(())()))(((");
		assertEquals(30, length);
	}


	
	@Test
	public void _1_character() throws Exception {
		LongestParanthesis longestParanthesis = new LongestParanthesis();
		int length = longestParanthesis.longestValidParentheses("(");
		assertEquals(0, length);
	}
	
	@Test
	public void _3_character() throws Exception {
		LongestParanthesis longestParanthesis = new LongestParanthesis();
		int length = longestParanthesis.longestValidParentheses("(()");
		assertEquals(2, length);
	}

}
