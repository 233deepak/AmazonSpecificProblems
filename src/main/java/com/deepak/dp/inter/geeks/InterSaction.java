package com.deepak.dp.inter.geeks;

public class InterSaction {

	public Node find(Node head1, Node head2) {

		int size1 = size(head1);
		int size2 = size(head2);

		int diff = size1 - size2;
		for (int i = 1; i <= diff; i++) {
			head1 = head1.next;
		}

		while (head1 != null && head2 != null) {
			if (head1 == head2)
				return head1;

			head1 = head1.next;
			head2 = head2.next;
		}

		return null;
	}

	private int size(Node head1) {
		int count = 0;
		while (head1 != null) {
			count++;
			head1 = head1.next;
		}
		return count;
	}

}
