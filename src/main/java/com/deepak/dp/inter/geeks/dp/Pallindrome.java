package com.deepak.dp.inter.geeks.dp;

public class Pallindrome {

	public int mincusts(String string) {

		return mincusts(string, 1);
	}

	private int mincusts(String string, int i) {

		if (i >= string.length())
			return 0;

		int minCuts = Integer.MAX_VALUE;
		for (int j = i; j < string.length(); j++) {
			String sub = string.substring(i - 1, j);
			if (isPalindrome(sub)) {
				int cuts = 1 + mincusts(string, j + 1);
				if (cuts < minCuts)
					minCuts = cuts;
			}

		}

		return minCuts;
	}

	private boolean isPalindrome(String subString) {
		if (subString.length() == 1)
			return true;
		int i = 1, j = subString.length();

		while (i <= j) {
			if (subString.charAt(i - 1) != subString.charAt(j - 1))
				return false;
			i++;
			j--;
		}

		return true;
	}

}
