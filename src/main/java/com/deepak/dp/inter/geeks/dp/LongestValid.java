package com.deepak.dp.inter.geeks.dp;

import java.util.Stack;

public class LongestValid {

	public int findLongestLength(String string) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(-1);

		int result = 0;
		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) == '(')
				stack.push(i);

			if (string.charAt(i) == ')') {
				stack.pop();

				if (!stack.isEmpty()) {
					int top = stack.peek();
					result = (i - top) > result ? (i - top) : result;
				} else {
					stack.push(i);
				}

			}

		}

		return result;
	}
}
