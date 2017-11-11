package com.deepak.dp.inter.geeks;

public class RotateLinkedList {

	public Node rotate(Node head, int k) {

		Node kNode = head;
		for (int i = 1; i <k; i++) {
			kNode = kNode.next;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		Node kNext = kNode.next;
		kNode.next = null;
		last.next = head;
		head = kNext;
		return head;
	}

}
