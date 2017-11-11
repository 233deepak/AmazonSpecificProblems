package com.deepak.dp.inter;

import java.util.ArrayList;

public class JumpGame {

	int[] memory;

	public int canJump(ArrayList<Integer> a) {
		memory = new int[a.size() + 1];
		for (int i = 0; i < a.size() + 1; i++)
			memory[i] = -1;
		return canJumpOtherApprocah(a, 1, a.size());
	}

	private int canJumpOtherApprocah(ArrayList<Integer> a, int i, int size) {
		if (i > size)
			return 0;
		if (i == size)
			return 1;
		if (memory[i] != -1)
			return memory[i];
		int maxDis = a.get(i - 1);
		int canReach = 0;
		for (int j = i + maxDis; j > i; j--) {
			canReach = canJumpOtherApprocah(a, j, size);
			if (canReach == 1) {
				memory[i] = canReach;
				return canReach;
			}
		}
		memory[i] = canReach;
		return canReach;
	}

	/*
	 * private int canJump(ArrayList<Integer> a, int i) { if (i <= 0) return 0;
	 * if (i == 1) return 1; if (memory[i] != -1) return memory[i]; int canJump
	 * = 0; for (int j = i - 1; j > 0; j--) { int dist = i - j; canJump =
	 * (a.get(j - 1) >= dist && canJump(a, j) == 1) ? 1 : 0; if (canJump == 1) {
	 * memory[i] = canJump; return canJump; } } memory[i] = canJump; return
	 * canJump; }
	 */

}
