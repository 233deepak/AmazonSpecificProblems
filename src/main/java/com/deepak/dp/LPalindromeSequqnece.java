package com.deepak.dp;

public class LPalindromeSequqnece {

	public int longestPallindromelength(String string) {
		char[] array = string.toCharArray();
		return lps(array, 1, array.length);
	}

	private int lps(char[] array, int i, int length) {
		if (i > array.length || length < 1)
			return 0;
		if (array[i - 1] == array[length - 1])
			return 1 + lps(array, i + 1, length - 1);
		else {
			return max(lps(array, i, length - 1), lps(array, i + 1, length));
		}
	}

	private int max(int i, int j) {

		return (i > j) ? i : j;
	}

}
