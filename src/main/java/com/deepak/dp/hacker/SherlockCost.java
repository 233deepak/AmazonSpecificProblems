package com.deepak.dp.hacker;

public class SherlockCost {

	int[][] memory;

	public int maximizeCost(int[] b) {
		memory = new int[b.length + 1][100];
		for (int i = 0; i <= b.length; i++) {
			memory[i][0] = -1;
			memory[i][1] = -1;
		}
		return maximizeCost(b, b.length, 0);
	}
	
	private int maximizezCost(int[] b, int length, int left) {
		if (length == 1) {
			return 0;
		}

		if (memory[length][left] != -1)
			return memory[length][left];
		
		int low = maximizeCost(b, length - 1, 1);
		int high = maximizeCost(b, length - 1, 0);
		int leftSum = max(low, high + Math.abs(b[length - 2] - 1));
		int right = max(low + Math.abs(b[length - 1] - 1),
				high + Math.abs(b[length - 2] - b[length - 1]));

		int max = max(leftSum, right);
		memory[length][left] = max;
		return max;
	}

	private int maximizeCost(int[] b, int length, int left) {
		if (length == 1) {
			return 0;
		}

		if (memory[length][left] != -1)
			return memory[length][left];

		int low = maximizeCost(b, length - 1, 1);
		int high = maximizeCost(b, length - 1, 0);
		int leftSum = max(low, high + Math.abs(b[length - 2] - 1));
		int right = max(low + Math.abs(b[length - 1] - 1),
				high + Math.abs(b[length - 2] - b[length - 1]));

		int max = max(leftSum, right);
		memory[length][left] = max;
		return max;
	}

	private int max(int j, int i) {
		return (j > i) ? j : i;
	}

}

/*
 * Brute force private int maximizeCost(int[] b, int[] a, int length) { if
 * (allslotFilled(a)) { return calcuateSum(a); }
 * 
 * a[length - 1] = 1; int leftSum = maximizeCost(b, a, length - 1); a[length -
 * 1]=0; a[length - 1] = b[length - 1]; int rightSum = maximizeCost(b, a, length
 * - 1); a[length - 1]=0; return max(leftSum, rightSum);
 * 
 * }
 * 
 * private int calcuateSum(int[] a) { int sum = 0; for (int i = 1; i < a.length;
 * i++) { sum += Math.abs(a[i] - a[i - 1]); } return sum; }
 * 
 * private int max(int leftSum, int rightSum) { return (leftSum > rightSum) ?
 * leftSum : rightSum; }
 * 
 * private boolean allslotFilled(int[] a) { for (int x : a) if (x == 0) return
 * false; return true; }
 */