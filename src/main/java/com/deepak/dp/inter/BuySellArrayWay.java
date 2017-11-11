package com.deepak.dp.inter;

import java.util.List;

public class BuySellArrayWay {

	public int maxProfit(final List<Integer> a) {

		int max = 0;
		int i = 0;
		while (i < a.size() - 1) {

			while (i < a.size() - 1 && (a.get(i) >= a.get(i + 1))) {
				i++;
			}

			if (i == a.size() - 1)
				break;
			int minima =a.get(i++);
			while (i < a.size() && a.get(i) >= a.get(i - 1)) {
				i++;
			}
			
			max+= a.get(i-1) -minima;
			

		}
		return max;

	}

}
