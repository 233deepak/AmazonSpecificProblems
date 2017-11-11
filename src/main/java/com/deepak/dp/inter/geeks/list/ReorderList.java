package com.deepak.dp.inter.geeks.list;

import com.deepak.dp.inter.geeks.Node;

public class ReorderList {

	public Node reorder(Node head) {

		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node revHead = slow.next;
		slow.next =null;
		revHead = reverse(revHead);
		Node res = merge(head, revHead);
		return res;
	}

	private Node merge(Node head, Node revHead) {
		Node result = new Node(0);
		Node currNode = result;
		while (head != null || revHead != null) {

			if (head != null) {
				currNode.next = head;
				head = head.next;
				currNode = currNode.next;
			}

			if (revHead != null) {
				currNode.next = revHead;
				revHead = revHead.next;
				currNode = currNode.next;
			}

		}

		return result.next;
	}

	public Node reverse(Node head) {

		Node currNode = head;
		Node nextNode = currNode.next;

		while (nextNode != null) {
			Node tempNode = nextNode.next;
			nextNode.next = head;
			head = nextNode;
			currNode.next = tempNode;
			nextNode = tempNode;
		}

		return head;

	}

}
