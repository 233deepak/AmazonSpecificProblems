package com.deepak.dp.inter;

import java.util.ArrayList;

public class BreakingWord2 {

	int memory[];

	public int wordBreak(String a, ArrayList<String> b) {

		memory = new int[a.length() + 1];
		for (int i = 0; i < a.length() + 1; i++) {
			memory[i] = -1;
		}
		return canBreak(a, b, 1);
	}

	private int canBreak(String a, ArrayList<String> b, int i) {

		if (i > a.length())
			return 1;
		if (memory[i] != -1) {
			return memory[i];
		}
		int result = 0;
		for (int j = i; j <= a.length(); j++) {
			String subString = a.substring(i - 1, j);
			if (b.contains(subString)) {
				int temp = canBreak(a, b, j + 1);
				result = result | temp;
				if (result == 1) {
					memory[i] = result;
					return result;
				}

			}
		}
		memory[i] = result;
		return result;
	}

}
