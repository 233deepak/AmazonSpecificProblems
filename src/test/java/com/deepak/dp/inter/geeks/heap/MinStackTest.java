package com.deepak.dp.inter.geeks.heap;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinStackTest {

	@Test
	public void _minstack() throws Exception {

		MinStack minStack = new MinStack();
		minStack.push(18);
		minStack.push(19);
		minStack.push(20);
		minStack.push(15);
		minStack.push(16);

		assertEquals(15, minStack.min());

		minStack.pop();
		minStack.pop();

		assertEquals(18, minStack.min());

	}

}
