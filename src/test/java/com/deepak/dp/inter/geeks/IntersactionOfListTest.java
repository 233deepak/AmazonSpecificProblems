package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntersactionOfListTest {

	@Test
	public void _2_list() throws Exception {

		Node node3 = new Node(3);
		Node node6 = new Node(6);
		Node node9 = new Node(9);
		Node node15 = new Node(9);
		Node node30 = new Node(9);

		Node node10 = new Node(10);

		node3.next = node6;
		node6.next = node9;
		node9.next = node15;
		node15.next = node30;

		node10.next = node15;

		InterSaction interSaction = new InterSaction();
		Node intersaction = interSaction.find(node3, node10);

		assertEquals(15, intersaction.val);

	}

}
