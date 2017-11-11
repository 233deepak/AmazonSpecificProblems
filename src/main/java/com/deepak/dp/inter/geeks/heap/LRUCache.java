package com.deepak.dp.inter.geeks.heap;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	int capacity;
	DNode head;
	DNode tail;

	Map<Integer, DNode> cache;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		cache = new HashMap<Integer, DNode>();
	}

	public void set(int key, int value) {

	}

	public int get(int key) {
		return 0;
	}

}
