package com.deepak.dp.inter.geeks.dp;

import java.util.Stack;

public class Histogram {

	public int findArea(int[] array) {

		Stack<Integer> stack = new Stack<Integer>();
		int maxArea = Integer.MIN_VALUE;
		int i = 1;
		for (; i < array.length; i++) {
			if (stack.isEmpty()) {
				stack.push(i);
			} else if (array[stack.peek()] < array[i-1]) {
				stack.push(i);
			} else {
				int top = stack.peek();
				stack.pop();
				int area = array[top-1]
						*  (stack.isEmpty()?i:i-stack.peek()-1);
				if (area > maxArea)
					maxArea = area;
				stack.push(i);

			}

		}

		while(!stack.isEmpty()){
			int top = stack.peek();
			stack.pop();
			int area = array[top]
					* (i - ((stack.isEmpty()) ? 0 : stack.peek()) - 1);
			if (area > maxArea)
				maxArea = area;
			
		}
		return maxArea;
	}

}
