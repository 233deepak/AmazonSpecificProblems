package com.deepak.dp.inter;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class IncDecSequenceTest {

	@Test
	public void sequence() throws Exception {
		int[] array = { 1, 11, 2, 10, 4, 5, 2, 1 };
		IncDecSequence sequence = new IncDecSequence();
		int length = sequence.findLis(array);
		assertEquals(6, length);

	}

	@Test
	public void sequenceList() throws Exception {
		int[] array = { 1, 11, 2, 10, 4, 5, 2, 1 };
		List<Integer> list = Arrays.asList(1, 11, 2, 10, 4, 5, 2, 1);
		IncDecSequence sequence = new IncDecSequence();
		int length = sequence.longestSubsequenceLength(list);
		assertEquals(6, length);

	}

	

	@Test
	public void sequenceList1() throws Exception {
		List<Integer> list = Arrays.asList(333, 306, 200, 397, 361, 458, 209,
				4, 436, 282, 221, 358, 126, 235, 489, 444, 134, 42, 257, 240,
				305, 480, 195, 102, 175, 44, 345, 224, 452, 249, 49, 173, 200,
				241, 285, 438, -9, 132, 80, 238, 428, 463, 334, 399, 449, 242,
				39, 56, 453, 108, 95, 492, 277, 109, 188, 376, 400, 265, 212,
				304, 223, 321, 338, 120, 380, 74, 459, 277, 423, 176, 309, 465,
				135, 170, 88, 11, 242, 305, 11, 19, 486, -7, 414, 442, 419, 3,
				49, 201, 150, 127, 285, -5, 166, 320, 371, 12, 312, 267, 202,
				360, 418, 481, 360, 409, 347, 139, 356, 277, 389, 212, 491,
				272, 31, 206, 154, 265, 291, 174, 255, 398, 30, 360, 450, 432,
				405, 244, 118, 320, 147, 277, 437, 495, 459, 273, 218, 197,
				111, 449, 96, 236, 341, 496, 186, 61, 384, 123, 428, 492, 200,
				389, 248, 95, 248, 74, 244, 300, 295, 264, 18, 278, 283, 51,
				204, 0, 78, 333, 430, 168, 384, 402, 347, 406, 130, 64, 186,
				339, 385, 458, 425, 120, 151, 402);
		IncDecSequence sequence = new IncDecSequence();
		int length = sequence.longestSubsequenceLength(list);
		assertEquals(34, length);

	}

	@Test
	public void empty() throws Exception {
		List<Integer> list = Arrays.asList();
		IncDecSequence sequence = new IncDecSequence();
		int length = sequence.longestSubsequenceLength(list);
		assertEquals(0, length);

	}

	@Test
	public void trival() throws Exception {
		List<Integer> list = Arrays.asList(1, 3, 5, 6, 4, 8, 4, 3, 2, 1);
		IncDecSequence sequence = new IncDecSequence();
		int length = sequence.longestSubsequenceLength(list);
		assertEquals(9, length);

	}
}
