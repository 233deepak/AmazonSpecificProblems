package com.deepak.dp.inter.geeks.heap;

public class Parantehsis {

	public void print(int n) {

		char[] array = new char[2 * n];
		printparanthesis(array, 0);

	}

	private void printparanthesis(char[] array, int pos) {
		if (pos == array.length) {
			for (int i = 0; i <array.length; i++)
				System.out.print(array[i]);
			System.out.println();
			return;
		}

		
		array[pos] = '(';
		printparanthesis(array, pos + 1);
		array[pos] = ')';
		printparanthesis(array, pos + 1);
	}

}
