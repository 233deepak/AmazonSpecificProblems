package com.deepak.dp.inter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class RodCuttingTest {

	@Test
	public void base_case() throws Exception {
		OptimalRodCut rodCut = new OptimalRodCut();
		int[] array = { 1, 2, 5 };
		ArrayList<Integer> result = rodCut.rodCut(6,
				new ArrayList<Integer>(Arrays.asList(1, 2, 5)) );
		assertEquals(Arrays.asList(2, 1, 5), result);

	}

}
