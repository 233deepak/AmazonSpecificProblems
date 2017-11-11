package com.deepak.dp.inter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class MinJumpTest {

	@Test
	public void _5_array() throws Exception {
		JumpGameMin gameMin =new JumpGameMin();
		int minCount = gameMin.jump(new ArrayList<Integer>(Arrays.asList(2,3,1,1,4)));
		assertEquals(2, minCount);
	}
	
	@Test
	public void _20_array() throws Exception {
		JumpGameMin gameMin =new JumpGameMin();
		int minCount = gameMin.jump(new ArrayList<Integer>(Arrays.asList(33, 21, 50, 0, 0, 46, 34, 3, 0, 12, 33, 0, 31, 37, 15, 17, 34, 18, 0, 4, 12, 41, 18, 35, 37, 34, 0, 47, 0, 39, 32, 49, 5, 41, 46, 26, 0, 2, 49, 35, 4, 19, 2, 27, 23, 49, 19, 38, 0, 33, 47, 1, 21, 36, 18, 33, 0, 1, 0, 39, 0, 22, 0, 9, 36, 45, 31, 4, 14, 48, 2, 33, 0, 39, 0, 37, 48, 44, 0, 11, 24, 16, 10, 23, 22, 41, 32, 14, 22, 16, 23, 38, 42, 16, 15, 0, 39, 23, 0, 42, 15, 25, 0, 41, 2, 48, 28)));
		assertEquals(3, minCount);
	}
	
	@Test
	public void _negative_array() throws Exception {
		JumpGameMin gameMin =new JumpGameMin();
		int minCount = gameMin.jump(new ArrayList<Integer>(Arrays.asList(0, 46, 46, 0, 2, 47, 1, 24, 45, 0, 0, 24, 18, 29, 27, 11, 0, 0, 40, 12, 4, 0, 0, 0, 49, 42, 13, 5, 12, 45, 10, 0, 29, 11, 22, 15, 17, 41, 34, 23, 11, 35, 0, 18, 47, 0, 38, 37, 3, 37, 0, 43, 50, 0, 25, 12, 0, 38, 28, 37, 5, 4, 12, 23, 31, 9, 26, 19, 11, 21, 0, 0, 40, 18, 44, 0, 0, 0, 0, 30, 26, 37, 0, 26, 39, 10, 1, 0, 0, 3, 50, 46, 1, 38, 38, 7, 6, 38, 27, 7, 25, 30, 0, 0, 36, 37, 6, 39, 40, 32, 41, 12, 3, 44, 44, 39, 2, 26, 40, 36, 35, 21, 14, 41, 48, 50, 21, 0, 0, 23, 49, 21, 11, 27, 40, 47, 49)));
		assertEquals(-1, minCount);
	}
	
	@Test
	public void _negativ_array() throws Exception {
		JumpGameMin gameMin =new JumpGameMin();
		int minCount = gameMin.jump(new ArrayList<Integer>(0));
		assertEquals(0, minCount);
	}
	 
	@Test
	public void _mod() throws Exception {
		System.out.print(49 % 26 % 5 % 1);
	}
	 
}
