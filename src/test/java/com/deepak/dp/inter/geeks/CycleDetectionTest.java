package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

public class CycleDetectionTest {

	@Test
	public void _5_nodes() throws Exception {

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
		
		CycleDetector cycleDetector = new CycleDetector();
		cycleDetector.removeCycle(node1);
		assertNull(node5.next);
		
		

	}

}
