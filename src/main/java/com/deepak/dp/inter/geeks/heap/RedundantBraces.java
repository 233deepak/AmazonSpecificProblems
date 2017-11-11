package com.deepak.dp.inter.geeks.heap;

import java.util.Stack;

public class RedundantBraces {

	public boolean isRedundant(String text) {
		Stack<Integer> stack = new Stack<Integer>();
		int lastPoped = Integer.MIN_VALUE, currentPoped = Integer.MIN_VALUE;
		for (int index = 0; index < text.length(); index++) {

			if (text.charAt(index) == '(') {
				stack.push(index);
			}
			if (text.charAt(index) == ')' && !stack.isEmpty()) {
				int top = stack.pop();
				if (lastPoped == Integer.MIN_VALUE) {
					currentPoped = top;
					lastPoped = top;
				} else {
					lastPoped = currentPoped;
					currentPoped = top;
				}

				if (lastPoped == currentPoped + 1)
					return true;

			}

		}

		return false;
	}

}
