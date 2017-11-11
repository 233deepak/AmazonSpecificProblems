package com.deepak.dp.inter.geeks.list;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.geeks.Node;

public class NthNodefromEndTest {

	@Test
	public void _5_node() throws Exception {

		Node node35 = new Node(35);
		Node node15 = new Node(15);
		Node node14 = new Node(14);
		Node node20 = new Node(20);

		node35.next = node15;
		node15.next = node14;
		node14.next = node20;

		NthNodeFromEnd enFromEnd = new NthNodeFromEnd();
		int number = enFromEnd.findNumber(node35, 2);
		assertEquals(14, number);

	}
	
	@Test
	public void _5_node_other_approach() throws Exception {

		Node node35 = new Node(35);
		Node node15 = new Node(15);
		Node node14 = new Node(14);
		Node node20 = new Node(20);

		node35.next = node15;
		node15.next = node14;
		node14.next = node20;

		NthNodeFromEnd enFromEnd = new NthNodeFromEnd();
		int number = enFromEnd.twoPointer(node35, 2);
		assertEquals(14, number);

	}

}
