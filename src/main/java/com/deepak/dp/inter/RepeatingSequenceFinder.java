package com.deepak.dp.inter;

public class RepeatingSequenceFinder {

	int[][] memory;

	public int anytwo(String a) {
		memory = new int[a.length()][a.length()];
		for (int i = 0; i < a.length(); i++)
			for (int j = 0; j < a.length(); j++)
				memory[i][j] = -1;
		int repeatSequence = repeatSequence(a, a.length() - 1, a.length() - 1);
		return (repeatSequence > 1) ? 1 : 0;
	}

	private int repeatSequence(String a, int i, int j) {
		if (i < 0 || j < 0)
			return 0;

		if (memory[i][j] != -1)
			return memory[i][j];

		if (i != j && (a.charAt(i) == a.charAt(j))) {
			return 1 + repeatSequence(a, i - 1, j - 1);
		}

		int max = max(repeatSequence(a, i - 1, j), repeatSequence(a, i, j - 1));
		memory[i][j] = max;
		return max;
	}

	private int max(int i, int j) {
		return (i > j) ? i : j;
	}

}
