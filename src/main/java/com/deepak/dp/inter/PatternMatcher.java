package com.deepak.dp.inter;

public class PatternMatcher {

	int[][] memory;

	public int isMatch(final String s, final String p) {
		memory = new int[s.length() + 1][p.length() + 1];
		for (int i = 0; i < s.length() + 1; i++)
			for (int j = 0; j < p.length() + 1; j++)
				memory[i][j] = -1;
		int match = match(s, p, s.length(), p.length());
		return (match > 0) ? 1 : 0;

	}

	private int match(String s, String p, int i, int j) {
		if (j <= 0 && i > 0)
			return 0;
		if (i <= 0 && j > 0) {
			return (hasAllStar(p, j)) ? 1 : 0;
		}
		if (i <= 0 && j <= 0)
			return 1;
		if (memory[i][j] != -1)
			return memory[i][j];
		int match = 0;
		if (p.charAt(j - 1) == '*' && j == 1)
			return 1;
		if (p.charAt(j - 1) == '*') {
			for (int k = i; k > 0; k--) {
				match += match(s, p, k, j - 1);
			}
		}
		if (p.charAt(j - 1) == '?')
			match += match(s, p, i - 1, j - 1);
		if (p.charAt(j - 1) == s.charAt(i - 1))
			match += match(s, p, i - 1, j - 1);
		memory[i][j] = match;
		return match;
	}

	private boolean hasAllStar(String p, int j) {
		while (j > 0) {
			if(p.charAt(j - 1) != '*'){
				return false;
			}
			j--;
		}
		return true;
	}

}
