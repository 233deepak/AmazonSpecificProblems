package com.deepak.dp.inter.geeks.list;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.geeks.ListCalculator;
import com.deepak.dp.inter.geeks.Node;

public class AddtwoNumberTest {

	@Test
	public void _2_no() throws Exception {
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node3 = new Node(3);
		node5.next = node6;
		node6.next = node3;

		Node node28 = new Node(8);
		Node node24 = new Node(4);
		Node node22 = new Node(2);

		node28.next = node24;
		node24.next = node22;

		ListAddition addition = new ListAddition();
		Node result = addition.addList(node5,node28);

		assertEquals(1, result.val);
		assertEquals(4, result.next.val);
		assertEquals(0, result.next.next.val);
		assertEquals(5, result.next.next.next.val);

	}
}
