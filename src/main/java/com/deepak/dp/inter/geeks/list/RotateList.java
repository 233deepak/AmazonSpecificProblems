package com.deepak.dp.inter.geeks.list;

import com.deepak.dp.inter.geeks.Node;

public class RotateList {

	public Node rotate(Node head, int count) {

		Node curr = head;
		for (int i = 1; i < count; i++) {
			curr = curr.next;
		}

		Node kthNode = curr;
		Node kplusOnethNode = curr.next;

		while (curr.next != null) {
			curr = curr.next;
		}

		kthNode.next = null;
		curr.next = head;

		head = kplusOnethNode;

		return head;
	}

}
