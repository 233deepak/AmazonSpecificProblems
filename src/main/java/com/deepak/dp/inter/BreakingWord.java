package com.deepak.dp.inter;

import java.util.ArrayList;

public class BreakingWord {

	ArrayList<String> memory[];

	public ArrayList<String> wordBreak(String a, ArrayList<String> b) {

		memory = new ArrayList[a.length() + 1];
		for (int i = 0; i < a.length() + 1; i++) {
			memory[i] = null;
		}
		return breakWord(a, b, 1);
	}

	private ArrayList<String> breakWord(String a, ArrayList<String> b, int i) {

		ArrayList<String> currentSol = new ArrayList<String>();
		if (i > a.length()){
			currentSol.add("");
			return currentSol;
		}
			;
		if (memory[i] != null)
			return memory[i];
		for (int k = i; k <= a.length(); k++) {
			String subString = a.substring(i - 1, k);
			if (b.contains(subString)) {
				ArrayList<String> subSols = breakWord(a, b, k + 1);
				for (String string : subSols) {
					String e = subString + " " + string;
					currentSol.add(e.trim());
				}

			}
		}
		memory[i] = currentSol;
		return currentSol;
	}

}
