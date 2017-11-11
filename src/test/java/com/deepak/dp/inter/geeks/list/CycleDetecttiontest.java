package com.deepak.dp.inter.geeks.list;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.geeks.Node;

public class CycleDetecttiontest {

	@Test
	public void _5_node_cycle() throws Exception {

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node2;

		DetectCycle cycle = new DetectCycle();
		cycle.fixCycle(node1);
		assertNull(node5.next);
	}

}
