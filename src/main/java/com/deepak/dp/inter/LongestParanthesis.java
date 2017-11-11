package com.deepak.dp.inter;

public class LongestParanthesis {

	int[] memory;

	public int longestValidParentheses(String a) {
		memory = new int[a.length() + 1];
		if (a.length() == 0 || a.length() == 1)
			return 0;
		for (int i = 0; i < a.length() + 1; i++)
			memory[i] = -1;
		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= a.length(); i++) {
			int maxLength = maxLength(a, i);
			if (maxLength > max)
				max = maxLength;
		}
		return max;
	}

	private int maxLength(String a, int i) {

		if (i > a.length())
			return 0;

		int max = 0;
		if (memory[i] != -1)
			return memory[i];
		if (i == a.length())
			return 0;
		if (a.charAt(i - 1) == '(' && a.charAt(i) == ')') {

			max = 2 + maxLength(a, i + 2);
		}

		if (a.charAt(i - 1) == '(' && a.charAt(i) == '(') {
			int nextMax = maxLength(a, i + 1);
			int nextIndex = i + nextMax + 1;
			if (nextIndex > a.length()) {
				return 0;
			}
			if (a.charAt(nextIndex - 1) == ')')
				max = 2 + maxLength(a, i + 1) + maxLength(a, nextIndex + 1);
		}
		memory[i] = max;
		return max;
	}

}
