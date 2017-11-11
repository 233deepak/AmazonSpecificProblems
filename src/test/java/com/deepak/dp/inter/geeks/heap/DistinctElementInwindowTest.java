package com.deepak.dp.inter.geeks.heap;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistinctElementInwindowTest {

	@Test
	public void _7_element_array() throws Exception {
		
		int[] array ={1,2,1,3,4,2,3}; 
		DistinctElemnt distinctElemnt =new DistinctElemnt();
		int[] count = distinctElemnt.count(array ,4);
		assertEquals(3, count[0]);
		assertEquals(4, count[1]);
		assertEquals(4, count[2]);
		

	}
}
