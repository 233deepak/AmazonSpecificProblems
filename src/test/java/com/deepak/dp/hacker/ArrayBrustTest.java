package com.deepak.dp.hacker;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayBrustTest {
	
	@Test
	public void base_case() throws Exception {
		
		ArrayBrust arraybrust = new  ArrayBrust();
		String[] array = ArrayBrust.getShrunkArray(new String[]{"a","b","c","c","c","d","e","e"}, 3);
		assertArrayEquals(new String[]{"a","b","d","e","e"}, array);
		
	}
	
	@Test
	public void base_case2() throws Exception {
		
		ArrayBrust arraybrust = new  ArrayBrust();
		String[] array = ArrayBrust.getShrunkArray(new String[]{"a","b","c","d","e","e","e","e","d","d","c","b","f","g","f"}, 3);
		assertArrayEquals(new String[]{"a","b","c","c","b","f","g","f"}, array);
		
	}

}
