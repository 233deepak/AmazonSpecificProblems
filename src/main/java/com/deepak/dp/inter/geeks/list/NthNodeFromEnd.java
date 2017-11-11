package com.deepak.dp.inter.geeks.list;

import com.deepak.dp.inter.geeks.Node;

public class NthNodeFromEnd {

	public int findNumber(Node head, int k) {
		int size = findSize(head);
		Node curr = head;
		int n = size - k + 1;
		for (int i = 1; i < n; i++)
			curr = curr.next;

		return curr.val;
	}

	private int findSize(Node head) {
		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}
		return count;
	}

	public int twoPointer(Node head, int k) {
		Node slow = head;
		Node fast = head;

		for (int i = 1; i < k; i++)
			fast = fast.next;

		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.val;
	}

}
