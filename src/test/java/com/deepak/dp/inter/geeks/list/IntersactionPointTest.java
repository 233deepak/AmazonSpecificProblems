package com.deepak.dp.inter.geeks.list;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.geeks.Node;

public class IntersactionPointTest {

	@Test
	public void findIntersect() throws Exception {

		Node node3 = new Node(3);
		Node node6 = new Node(6);
		Node node9 = new Node(9);
		Node node15 = new Node(15);
		Node node30 = new Node(30);

		node3.next = node6;
		node6.next =node9;
		node9.next = node15;
		node15.next = node30;

		Node node10 = new Node(10);
		node10.next = node15;

		IntersactionList intersactionList = new IntersactionList();
		Node mergePoint = intersactionList.findIntersaction(node3, node10);

		assertEquals(15, mergePoint.val);


	}

}
