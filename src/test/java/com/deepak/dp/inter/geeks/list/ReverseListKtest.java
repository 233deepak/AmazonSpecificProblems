package com.deepak.dp.inter.geeks.list;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.geeks.Node;

public class ReverseListKtest {

	@Test
	public void _10_node() throws Exception {

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;

		ReverseList reverseList = new ReverseList();
		Node head = reverseList.reverse(node1, 3);

		assertEquals(3, head.val);

	}

}
