package com.deepak.dp.inter;

public class PalindromePart {

	int memory[];

	public int minCut(String a) {

		memory = new int[a.length() + 1];
		for (int i = 0; i < a.length() + 1; i++)
			memory[i] = -1;
		return minCut(a, 1) - 1;
	}

	private int minCut(String a, int i) {

		if (i > a.length()) {
			return 0;
		}
		if (memory[i] != -1)
			return memory[i];
		int min = Integer.MAX_VALUE;
		for (int j = i; j <= a.length(); j++) {
			String subString = a.substring(i - 1, j);
			if (isPalindrome(subString)) {
				int temp = 1 + minCut(a, j + 1);
				if (temp < min) {
					min = temp;
				}
			}

		}
		memory[i] = min;
		return min;
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
