package com.deepak.dp.inter;

import java.util.ArrayList;
import java.util.Collections;

public class EqualAvragePartion {

	public ArrayList<ArrayList<Integer>> avgset(ArrayList<Integer> a) {

		int totalSum = 0;
		for (Integer integer : a) {
			totalSum += integer;
		}
		int ratio = totalSum / a.size();
		ArrayList<Integer> partA = null;
		for (int size = 1; size <= a.size() / 2; size++) {
			int requiredSum = ratio * size;
			ArrayList<ArrayList<Integer>> list = getIntegersWithSum(a,
					requiredSum, size);
			if (list != null && !list.isEmpty()) {
				partA = list.get(0);
				Collections.sort(partA);
				break;
			}

		}
		ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
		if (partA == null)
			return arrayLists;
		ArrayList<Integer> partB = new ArrayList<Integer>();
		for (Integer integer : a) {
			if (!partA.contains(integer))
				partB.add(integer);
		}

		Collections.sort(partB);
		if (avg(partA) != avg(partB))
			return arrayLists;
		arrayLists.add(partA);
		arrayLists.add(partB);
		return arrayLists;
	}

	private double avg(ArrayList<Integer> partA) {
		int totalSum = 0;
		for (Integer integer : partA) {
			totalSum += integer;
		}
		double ratio = (double)totalSum / partA.size();
		return ratio;
	}

	private ArrayList<ArrayList<Integer>> getIntegersWithSum(
			ArrayList<Integer> a, int requiredSum, int size) {

		ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
		if (size == 1 && a.contains(requiredSum)) {
			ArrayList<Integer> integers = new ArrayList<Integer>();
			integers.add(requiredSum);
			arrayLists.add(integers);
			return arrayLists;
		}
		if (size == 1 && !a.contains(requiredSum))
			return null;
		if (requiredSum < 0 || size <= 0)
			return null;

		for (int index = 1; index <= a.size(); index++) {
			ArrayList<ArrayList<Integer>> list = getIntegersWithSum(a,
					requiredSum - a.get(index - 1), size - 1);
			if (list != null)
				for (ArrayList<Integer> integers : list) {
					integers.add(a.get(index - 1));
					arrayLists.add(integers);
				}

		}
		return arrayLists;
	}
}
