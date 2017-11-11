package com.deepak.dp.inter;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LISTest {

	@Test
	public void sequence_4() throws Exception {
		LongestIncreasingSequence increasingSequence = new LongestIncreasingSequence();
		List<Integer> array = Arrays.asList(0, 8, 4, 12);
		int length = increasingSequence.lis(array);
		assertEquals(3, length);
	}
	
	
	@Test
	public void sequence_15() throws Exception {
		LongestIncreasingSequence increasingSequence = new LongestIncreasingSequence();
		List<Integer> array = Arrays.asList(0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15);
		int length = increasingSequence.lis(array);
		assertEquals(6, length);
	}
	
	
	@Test
	public void sequence_5() throws Exception {
		LongestIncreasingSequence increasingSequence = new LongestIncreasingSequence();
		List<Integer> array = Arrays.asList(84, 80, 27);
		int length = increasingSequence.lis(array);
		assertEquals(1, length);
	}
	
	@Test
	public void sequence_10() throws Exception {
		LongestIncreasingSequence increasingSequence = new LongestIncreasingSequence();
		List<Integer> array = Arrays.asList(14, 24, 18, 46, 55, 53, 82, 18, 101, 20, 78, 35, 68, 9, 16, 93, 101, 85, 81, 28, 78 );
		int length = increasingSequence.lis(array);
		assertEquals(7, length);
	}
	
	@Test
	public void sequence_11() throws Exception {
		LongestIncreasingSequence increasingSequence = new LongestIncreasingSequence();
		List<Integer> array = Arrays.asList(30, 92, 22, 48, 52, 64, 92, 50, 85, 38, 97, 15, 14, 75, 59, 46, 74, 6, 95, 67, 86, 88, 25, 49, 67, 69, 50, 99, 83, 49, 60, 6, 90, 1, 50, 41, 57, 18, 36, 5, 44, 100, 23, 33, 52, 11, 46, 49, 34, 27, 77, 57, 93, 82, 38, 95, 6, 51, 100, 32, 11, 26, 50, 3, 55, 39, 84, 54, 44, 75, 76, 51, 21, 40, 28, 50, 30, 6, 84, 58, 76, 42, 35, 49, 98, 49, 13, 101, 3, 1, 60, 48, 99, 70 );
		int length = increasingSequence.lis(array);
		assertEquals(13, length);
	}
	
	 
	
	
	

}
