package com.deepak.dp.techgig;

import java.util.Scanner;

public class CoinChange {

	static long memory[][];

	public static String CoinChange(int input1, int[] input2) {
		if (input1 == 0)
			return String.valueOf(0);
		memory = new long[input1 + 1][input2.length + 1];
		for (int i = 0; i < input1 + 1; i++)
			for (int j = 0; j < input2.length + 1; j++)
				memory[i][j] = -1;
		long noOfways = change(input2, input1, input2.length);
		return String.valueOf(noOfways);
	}

	private static long change(int[] array, int n, int i) {
		if (n < 0 || i <= 0)
			return 0;
		if (n == 0)
			return 1;
		if (memory[n][i] != -1)
			return memory[n][i];
		long ways = change(array, n - array[i - 1], i)
				+ change(array, n, i - 1);
		memory[n][i] = ways;
		return ways;
	}

	public static void main(String[] args) {

		/*
		 * Scanner in = new Scanner(System.in); String output; int ip1 =
		 * Integer.parseInt(in.nextLine().trim()); int ip2_size = 0; ip2_size =
		 * Integer.parseInt(in.nextLine().trim()); int[] ip2 = new
		 * int[ip2_size]; int ip2_item; for(int ip2_i = 0; ip2_i < ip2_size;
		 * ip2_i++) { ip2_item = Integer.parseInt(in.nextLine().trim());
		 * ip2[ip2_i] = ip2_item; } output = CoinChange(ip1,ip2);
		 * System.out.println(String.valueOf(output));
		 */
		System.out.println(CoinChange(2, new int[] { 3, 2, 1 }));
		System.out.println(CoinChange(4, new int[] { 1, 2, 3 }));
		System.out.println(CoinChange(458, new int[] { 18, 24, 23, 10, 16, 19,
				2, 9, 5, 12, 17, 3, 28, 29, 4, 13, 15, 8 }));
		System.out.println(CoinChange(0, new int[] { 18 }));

	}
}
