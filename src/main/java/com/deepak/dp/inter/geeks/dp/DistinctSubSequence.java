package com.deepak.dp.inter.geeks.dp;

public class DistinctSubSequence {

	public int form(String source, String target) {

		return waysToForm(source, target, source.length(), target.length());
	}

	private int waysToForm(String source, String target, int i, int j) {

		if (i < j)
			return 0;
		if (i == 0 && j == 0)
			return 1;

		int ways = 0;
		if (source.charAt(i - 1) == target.charAt(j - 1))
			ways += waysToForm(source, target, i - 1, j - 1);
		ways += waysToForm(source, target, i - 1, j);
		return ways;
	}
}
