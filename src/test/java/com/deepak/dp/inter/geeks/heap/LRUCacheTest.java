package com.deepak.dp.inter.geeks.heap;

import static org.junit.Assert.*;

import org.junit.Test;

public class LRUCacheTest {

	@Test
	public void _insert3() throws Exception {

		LRUCache cache = new LRUCache(2);
		cache.set(1, 10);
		cache.set(5, 12);
		int x = cache.get(5);
		assertEquals(12, x);
		x = cache.get(1);
		assertEquals(10, x);
		cache.set(6, 14);
		x = cache.get(5);
		assertEquals(-1, x);

	}

}
