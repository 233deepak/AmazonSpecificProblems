package com.deepak.dp.inter.geeks;


public class ReorderLinkedList {

	public Node reorder(Node head) {

		Node slow = head;
		Node fast = head.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node node2 = slow.next;
		Node rev = reverse(node2);
		Node merge = merge(rev, head);
		return merge;

	}

	private Node merge(Node rev, Node head) {
		Node result = null;
		while (rev != null && head != null) {
			result = head;
			result.next = rev;

			head = head.next;
			rev = rev.next;
		}

		return result;
	}

	private Node reverse(Node head) {
		Node rev = head;
		rev.next =null;
		while (head.next != null) {
			Node temp = rev;
			rev = head.next;
			rev.next = temp;

			head = head.next;
		}
		return rev;
	}

}
