package com.deepak.dp.inter.geeks.list;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.geeks.Node;

public class ReorderLinkedListTest {

	@Test
	public void _6_node_list() throws Exception {

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		ReorderList reorderList = new ReorderList();
		Node head = reorderList.reorder(node1);

		assertEquals(5, head.next.val);

	}
	
	@Test
	public void _6_reverse_list() throws Exception {

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		ReorderList reorderList = new ReorderList();
		Node head = reorderList.reverse(node1);

		assertEquals(5, head.val);

	}

}
