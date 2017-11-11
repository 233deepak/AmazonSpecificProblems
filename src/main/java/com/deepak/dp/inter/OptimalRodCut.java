package com.deepak.dp.inter;

import java.util.ArrayList;

public class OptimalRodCut {

	public ArrayList<Integer> rodCut(int A, ArrayList<Integer> B) {
		B.add(0, 0);
		B.add(B.size(), A);
		ArrayList<Integer> result = new ArrayList<Integer>();
		findOptimalCut(B, result, 0, A);
		return result;
	}

	private int findOptimalCut(ArrayList<Integer> b, ArrayList<Integer> result,
			int i, int j) {

		
		int min = Integer.MAX_VALUE;
		int indexI = b.indexOf(i);
		int indexJ = b.indexOf(j);
		for (int k = indexI + 1; k < indexJ; k++) {
			int sum = i - j + findOptimalCut(b, result, i, b.get(k))
					+ findOptimalCut(b, result, b.get(k), j);
			if (sum < min)
				min = sum;
		}
		return min;

	}

}
