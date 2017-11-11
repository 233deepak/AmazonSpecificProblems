package com.deepak.dp.inter.geeks.heap;

import java.util.HashMap;
import java.util.Map;

public class DistinctElemnt {

	public int[] count(int[] array, int k) {

		int[] count = new int[array.length];
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		int dist_count = 0;
		for (int i = 1; i <= k; i++) {
			int key = array[i - 1];
			if (countMap.containsKey(key)) {
				countMap.put(key, countMap.get(key) + 1);
			} else {
				countMap.put(key, 1);
				dist_count++;
			}
		}

		int index = 0;
		count[index++] = dist_count;
		for (int i = k; i < array.length; i++) {
           
		}

		return null;
	}
}
