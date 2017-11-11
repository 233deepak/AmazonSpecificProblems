package com.deepak.dp.inter.geeks.heap;

import java.util.Stack;

public class MinStack {

	private Stack<Integer> stack;
	private int min;

	public MinStack() {
		stack = new Stack<Integer>();
	}

	public void push(int item) {
		if (stack.isEmpty()) {
			stack.push(item);
			min = item;
		}

		if (item < min) {
			stack.push((2 * item) - min);
			min = item;
		} else {
			stack.push(item);
		}
	}

	public int min() {
		return min;
	}

	public int pop() {
		int item = stack.pop();
		if (item >= min)
			return item;
		else {
			min = (2 * min) - item;
			item = min;
		}
		return item;

	}

}
