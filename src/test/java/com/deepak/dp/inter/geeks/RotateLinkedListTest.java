package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateLinkedListTest {

	@Test
	public void _6_node() throws Exception {

		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node40 = new Node(40);
		Node node50 = new Node(50);
		Node node60 = new Node(60);

		node10.next = node20;
		node20.next = node30;
		node30.next = node40;
		node40.next = node50;
		node50.next = node60;

		RotateLinkedList linkedList = new RotateLinkedList();
		Node head = linkedList.rotate(node10, 4);

		assertEquals(50, head.val);

	}

}
