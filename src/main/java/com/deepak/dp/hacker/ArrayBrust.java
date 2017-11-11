package com.deepak.dp.hacker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayBrust {

	static String[] getShrunkArray(String[] inputArray, int burstLength) {
		ArrayList<String> strings = new ArrayList<String>();
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		for (int index = 0; index < inputArray.length; index++) {
			if (!countMap.containsKey(inputArray[index])) {
				countMap.put(inputArray[index], 1);
			} else {
				countMap.put(inputArray[index],
						countMap.get(inputArray[index]) + 1);
			}
		}

		for (String key : countMap.keySet()) {
			if (countMap.get(key) < burstLength) {
				for (int i = 1; i <= countMap.get(key); i++)
					strings.add(key);
			}
		}

		String[] array = new String[strings.size()];
		int i=0;
		for (int index = 0; index < inputArray.length; index++) {
			if (strings.contains(inputArray[index]))
				array[i++] = inputArray[index];
		}
		return array;
	}

}
