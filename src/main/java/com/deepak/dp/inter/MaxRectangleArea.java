package com.deepak.dp.inter;

import java.util.ArrayList;
import java.util.Stack;

public class MaxRectangleArea {

	public int maximalRectangle(ArrayList<ArrayList<Integer>> a) {

		int columnSize = a.get(0).size();
		int[] tempArray = new int[columnSize];
		for (int i = 0; i < columnSize; i++) {
			tempArray[i] = a.get(0).get(i);
		}

		int maxArea = findmaxArea(tempArray, -1);
		for (int i = 2; i <= a.size(); i++) {
			for (int j = 1; j <= tempArray.length; j++) {
				Integer integer = a.get(i - 1).get(j - 1);
				tempArray[j - 1] = (integer == 1) ? tempArray[j - 1] + integer
						: integer;
			}
			int temp = findmaxArea(tempArray, maxArea);
			maxArea = (temp > maxArea) ? temp : maxArea;
		}
		return maxArea;

	}

	public int findmaxArea(int[] tempArray, int maxArea) {

		// Create an empty stack. The stack holds indexes of hist[] array
		// The bars stored in stack are always in increasing order of their
		// heights.
		Stack<Integer> s = new Stack();

		int max_area = 0; // Initialize max area
		int tp; // To store top of stack
		int area_with_top; // To store area with top bar as the smallest bar

		// Run through all bars of given histogram
		int i = 0;
		while (i < tempArray.length) {
			// If this bar is higher than the bar on top stack, push it to stack
			if (s.empty() || tempArray[s.peek()] <= tempArray[i])
				s.push(i++);

			// If this bar is lower than top of stack, then calculate area of
			// rectangle
			// with stack top as the smallest (or minimum height) bar. 'i' is
			// 'right index' for the top and element before top in stack is
			// 'left index'
			else {
				tp = s.peek(); // store the top index
				s.pop(); // pop the top

				// Calculate the area with hist[tp] stack as smallest bar
				area_with_top = tempArray[tp]
						* (s.empty() ? i : i - s.peek() - 1);

				// update max area, if needed
				if (max_area < area_with_top)
					max_area = area_with_top;
			}
		}

		// Now pop the remaining bars from stack and calculate area with every
		// popped bar as the smallest bar
		while (s.empty() == false) {
			tp = s.peek();
			s.pop();
			area_with_top = tempArray[tp] * (s.empty() ? i : i - s.peek() - 1);

			if (max_area < area_with_top)
				max_area = area_with_top;
		}

		return max_area;

	}

}
