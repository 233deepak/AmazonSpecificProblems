package com.deepak.dp.inter.geeks.dp;

public class RepeatingSequence {

	public boolean hasRepeat(String text) {

		int length = hasRepeat(text, text.length(), text.length());
		return length > 1;
	}

	private int hasRepeat(String text, int i, int j) {

		if (i <= 0 || j <= 0)
			return 0;

		if (i != j && text.charAt(i-1) == text.charAt(j-1))
			return 1 + hasRepeat(text, i - 1, j - 1);
		int left = hasRepeat(text, i - 1, j);
		int right = hasRepeat(text, i, j - 1);
		return Math.max(left, right);
	}

}
