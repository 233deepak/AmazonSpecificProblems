package com.deepak.dp.inter;

public class Decoder {

	int[] memory;
	public int numDecodings(String a) {
		char[] messege = a.toCharArray();
		 memory = new int[a.length()+1];
		for (int index = 0; index < memory.length; index++)
			memory[index] = -1;

		return findWay(messege, messege.length);
	}

	private int findWay(char[] messege, int length) {
		if (length <= 0)
			return 1;
		if (length == 1) {
			return isValid(messege[length - 1] + "") ? 1 : 0;
		}
		if(memory[length]!=-1)
			return memory[length];
		int ways = 0;
		if (messege[length - 1] >'0')
			ways += findWay(messege, length - 1);

		if (messege[length-2] == '1' || (messege[length-2] == '2' && messege[length-1] < '7'))
			ways += findWay(messege, length - 2);
		memory[length] =ways;
		return ways;
	}

	private boolean isValid(String messege) {
		int encodedMess;
		try {
			encodedMess = Integer.parseInt(messege);
		} catch (NumberFormatException e) {
			return false;
		}
		return (encodedMess <= 26 && encodedMess > 0);
	}

}
