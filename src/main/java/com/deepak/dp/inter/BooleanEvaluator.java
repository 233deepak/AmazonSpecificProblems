package com.deepak.dp.inter;

public class BooleanEvaluator {

	int[][] memoryTrue;
	int[][] memoryFalse;

	public int cnttrue(String a) {
		int length = a.length() / 2;
		char[] operand = new char[length + 1];
		char[] operator = new char[length];
		int oindex = 0;
		int opIndex = 0;
		for (int i = 0; i < a.length(); i++) {
			if (i % 2 == 0)
				operand[oindex++] = a.charAt(i);
			else
				operator[opIndex++] = a.charAt(i);
		}
		memoryTrue = new int[operand.length + 1][operand.length + 1];
		memoryFalse = new int[operand.length + 1][operand.length + 1];
		initialize(memoryTrue, operand.length);
		initialize(memoryFalse, operand.length);
		return countTrue(operand, operator, 1, operand.length);

	}

	private void initialize(int[][] memory, int length) {
		for (int i = 0; i < length + 1; i++)
			for (int j = 0; j < length + 1; j++)
				memory[i][j] = -1;

	}

	private int countTrue(char[] operand, char[] operator, int i, int j) {
		if (i == j)
			return (operand[i - 1] == 'T') ? 1 : 0;

		if (memoryTrue[i][j] != -1)
			return memoryTrue[i][j];
		int ways = 0;
		for (int k = i; k < j; k++) {
			if (operator[k - 1] == '|') {
				ways += (countTrue(operand, operator, i, k) * countTrue(
						operand, operator, k + 1, j));
				ways += (countTrue(operand, operator, i, k) * countFalse(
						operand, operator, k + 1, j));
				ways += (countFalse(operand, operator, i, k) * countTrue(
						operand, operator, k + 1, j));
			}
			if (operator[k - 1] == '&') {
				ways += (countTrue(operand, operator, i, k) * countTrue(
						operand, operator, k + 1, j));
			}
			if (operator[k - 1] == '^') {
				ways += (countTrue(operand, operator, i, k) * countFalse(
						operand, operator, k + 1, j));
				ways += (countFalse(operand, operator, i, k) * countTrue(
						operand, operator, k + 1, j));
			}
		}
		memoryTrue[i][j] = ways % 1003;
		return ways % 1003;

	}

	private int countFalse(char[] operand, char[] operator, int i, int j) {
		if (i == j)
			return (operand[i - 1] == 'F') ? 1 : 0;

		if (memoryFalse[i][j] != -1)
			return memoryFalse[i][j];
		int ways = 0;
		for (int k = i; k < j; k++) {
			if (operator[k - 1] == '|') {
				ways += (countFalse(operand, operator, i, k) * countFalse(
						operand, operator, k + 1, j));
			}
			if (operator[k - 1] == '&') {
				ways += (countFalse(operand, operator, i, k) * countFalse(
						operand, operator, k + 1, j));
				ways += (countFalse(operand, operator, i, k) * countTrue(
						operand, operator, k + 1, j));
				ways += (countTrue(operand, operator, i, k) * countFalse(
						operand, operator, k + 1, j));
			}
			if (operator[k - 1] == '^') {
				ways += (countTrue(operand, operator, i, k) * countTrue(
						operand, operator, k + 1, j));
				ways += (countFalse(operand, operator, i, k) * countFalse(
						operand, operator, k + 1, j));
			}
		}
		memoryFalse[i][j] = ways % 1003;
		return ways % 1003;

	}

}
