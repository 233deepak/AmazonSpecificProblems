package com.deepak.dp.inter;

import java.util.List;

public class IncDecSequence {


	public int findLis(int[] array) {
		int[] increasing;
		int[] decreasing;
		increasing = new int[array.length];
		decreasing = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			increasing[i] = 1;
			decreasing[i] = 1;
		}

		findIncreasing(array ,increasing);
		findDecreasing(array ,decreasing);
		return bitonic(increasing,decreasing);

	}

	private int bitonic(int[] increasing, int[] decreasing) {
		int[] bitonic = new int[increasing.length];
		for (int i = 0; i < bitonic.length; i++) {
			bitonic[i] = (increasing[i] + decreasing[i]) - 1;

		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < bitonic.length; i++) {
			if (bitonic[i] > max)
				max = bitonic[i];
		}
		return max;
	}

	private void findIncreasing(int[] array, int[] increasing) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] >= array[j]
						&& ((increasing[j] + 1) > increasing[i])) {
					increasing[i] = (increasing[j] + 1);

				}
			}
		}

	}

	private void findDecreasing(int[] array, int[] decreasing) {
		for (int i = array.length-2; i >=0; i--) {
			for (int j = array.length-1; j >i; j--) {
				if (array[i] >array[j]
						&& (  decreasing[i]<(decreasing[j] + 1))) {
					decreasing[i] = (decreasing[j] + 1);

				}
			}
		}

	}
	
	public int longestSubsequenceLength(final List<Integer> A) {
		int[] array = new int[A.size()];
		for(int i=0;i<array.length;i++)
			array[i]=A.get(i);
		int findLis = findLis(array);
		return (findLis==Integer.MIN_VALUE)?0:findLis;
    }
}
