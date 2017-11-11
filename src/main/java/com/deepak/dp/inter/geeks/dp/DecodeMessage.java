package com.deepak.dp.inter.geeks.dp;

public class DecodeMessage {

	public int wayToDecode(String message) {

		return wayToDecode(message, 1);
	}

	private int wayToDecode(String message, int i) {
		if (i >= message.length())
			return 1;
		if (i == message.length())
			return 1;

		int ways = 0;
		ways += wayToDecode(message, i + 1);
		String subString = message.substring(i-1, i + 1);
		if (subString.compareTo("1") >=0 && subString.compareTo("26") <=0) {
			ways += wayToDecode(message, i + 2);

		}
		return ways;
	}
}
