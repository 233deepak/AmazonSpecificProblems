package com.deepak.dp.inter.geeks;

public class ListCalculator {

	Node result;
	public Node add(Node head1, Node head2) {

		int size1 = getSize(head1);
		int size2 = getSize(head1);

		if (size1 == size2) {
			calculateSum(head1, head2);
		}

		return result;
	}

	private int calculateSum(Node head1, Node head2) {
		if (head1 == null && head2 == null)
			return 0;
		int carry = calculateSum(head1.next, head2.next);
		int sum = carry + head1.val + head2.val;
		Node temp = new Node(sum % 10);
		if (result == null) {
			result = temp;
		} else {
			temp.next = result;
			result = temp;
		}
		return sum / 10;
	}

	private int getSize(Node head) {
		int size = 0;
		while (head != null) {
			size++;
			head = head.next;
		}
		return size;
	}

}
