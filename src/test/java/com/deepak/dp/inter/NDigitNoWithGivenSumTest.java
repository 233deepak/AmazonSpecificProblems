package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class NDigitNoWithGivenSumTest {

	@Test
	public void two_digit_number_sum_4() throws Exception {
		NDigitNumberFinder finder = new NDigitNumberFinder();
		int ways = finder.solve(2, 4);
		assertEquals(4, ways);

	}
	
	@Test
	public void two_digit_number_sum_6() throws Exception {
		NDigitNumberFinder finder = new NDigitNumberFinder();
		int ways = finder.solve(3, 6);
		assertEquals(21, ways);

	}
	
	@Test
	public void two_digit_number_sum_5() throws Exception {
		NDigitNumberFinder finder = new NDigitNumberFinder();
		int ways = finder.solve(2, 5);
		assertEquals(5, ways);

	}
	
	@Test
	public void two_digit_number_sum_41() throws Exception {
		NDigitNumberFinder finder = new NDigitNumberFinder();
		int ways = finder.solve(3, 4);
		assertEquals(10, ways);

	}
	
	@Test
	public void two_digit_number_sum_large() throws Exception {
		NDigitNumberFinder finder = new NDigitNumberFinder();
		int ways = finder.solve(75, 22);
		assertEquals(478432066, ways);

	}
	
	
	
	
}
