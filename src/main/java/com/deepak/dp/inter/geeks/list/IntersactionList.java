package com.deepak.dp.inter.geeks.list;

import com.deepak.dp.inter.geeks.Node;

public class IntersactionList {

	public Node findIntersaction(Node head1, Node head2) {
		int size1 = findSize(head1);
		int size2 = findSize(head2);
		int d = Math.abs(size2 - size1);
		if (size1 > size2) {
			head1 = move(head1, d);
		} else {
			move(head2, d);
		}

		return findInterPoint(head1, head2);
	}

	private Node findInterPoint(Node head1, Node head2) {

		while (head1 != null && head2 != null) {

			if (head1 == head2)
				return head1;

			head1 = head1.next;
			head2 = head2.next;
		}

		return null;
	}

	private Node move(Node head, int d) {
		for (int i = 1; i <= d; i++)
			head = head.next;

		return head;
	}

	private int findSize(Node head) {
		int count = 0;
		Node curr = head;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

}
