package com.deepak.dp.inter.geeks.dp;

public class Interleaved {

	public boolean canForm(String string, String string2, String string3) {

		return canForm(string, string2, string3, string.length(),
				string2.length(), string3.length());
	}

	private boolean canForm(String target, String source1, String source2,
			int k, int i, int j) {

		if (k == 0 && j == 0 && i == 0)
			return true;
		if (target.charAt(k - 1) == source1.charAt(i - 1))
			return canForm(target, source1, source2, k - 1, i - 1, j);
		if (target.charAt(k - 1) == source2.charAt(j - 1))
			return canForm(target, source1, source2, k - 1, i, j - 1);
		return false;
	}
}
