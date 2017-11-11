package com.deepak.dp.inter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class EqualAvragePartitionTest {

	@Test
	public void _6_digits_array() throws Exception {
		EqualAvragePartion avragePartion = new EqualAvragePartion();
		ArrayList<ArrayList<Integer>> lists = avragePartion
				.avgset(new ArrayList<Integer>(Arrays.asList(1, 7, 15, 29, 11,
						9)));
		ArrayList<Integer> part2 = lists.get(1);
		ArrayList<Integer> part1 = lists.get(0);
		assertTrue(part1.contains(15));
		assertTrue(part1.contains(9));

		assertTrue(part2.contains(11));
		assertTrue(part2.contains(29));
		assertTrue(part2.contains(7));
		assertTrue(part2.contains(1));

	}
	
	@Test
	public void _4_digits_array() throws Exception {
		EqualAvragePartion avragePartion = new EqualAvragePartion();
		ArrayList<ArrayList<Integer>> lists = avragePartion
				.avgset(new ArrayList<Integer>(Arrays.asList( 22, 12, 32, 19)));
		assertEquals(0, lists.size());
	}
	
	@Test
	public void _7_digits_array() throws Exception {
		EqualAvragePartion avragePartion = new EqualAvragePartion();
		ArrayList<ArrayList<Integer>> lists = avragePartion
				.avgset(new ArrayList<Integer>(Arrays.asList( 18, 29, 0, 47, 0, 41, 40, 28, 7, 1 )));
		assertEquals(0, lists.size());
	}
	
	

}
