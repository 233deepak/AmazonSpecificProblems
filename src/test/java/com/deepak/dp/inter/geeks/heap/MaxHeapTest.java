package com.deepak.dp.inter.geeks.heap;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxHeapTest {

	@Test
	public void buid_max_heap() throws Exception {
		int[] array = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		MaxHeap heap = new MaxHeap();
		heap.build(array);

		assertEquals(16, array[0]);

	}
	
	@Test
	public void buid_max_heap_Extract() throws Exception {
		int[] array = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		MaxHeap heap = new MaxHeap();
		heap.build(array);
		
		int max = heap.extractMax();

		assertEquals(16, max);

	}
	
	@Test
	public void buid_max_increase_key() throws Exception {
		int[] array = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		MaxHeap heap = new MaxHeap();
		heap.build(array);
		
		int max = heap.extractMax();
		
		heap.increaseKey(3,15);

		assertEquals(15, array[0]);

	}
	
	@Test
	public void buid_max_insert() throws Exception {
		int[] array = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		MaxHeap heap = new MaxHeap();
		heap.build(array);
		
		int max = heap.extractMax();
		
		heap.increaseKey(3,15);
		
		heap.insert(18);

		assertEquals(18, array[0]);

	}

}
