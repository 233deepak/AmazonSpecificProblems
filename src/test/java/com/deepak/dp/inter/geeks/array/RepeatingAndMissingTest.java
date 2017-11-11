package com.deepak.dp.inter.geeks.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class RepeatingAndMissingTest {

	@Test
	public void _6_element() throws Exception {
		int[] array = { 4, 3, 6, 2, 1, 1 };
		RepeatNumber repeat = new RepeatNumber();
		int missing = repeat.findMissing(array);
		assertEquals(5, missing);

	}

}
