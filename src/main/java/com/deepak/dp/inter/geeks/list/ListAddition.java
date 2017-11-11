package com.deepak.dp.inter.geeks.list;

import com.deepak.dp.inter.geeks.Node;

public class ListAddition {

	Node result;

	public Node addList(Node node1, Node node2) {

		int size1 = getSize(node1);
		int size2 = getSize(node2);
		int diff = size1 - size2;
		if (diff == 0) {
			int carry = sum(node1, node2);
			if (carry > 0) {
				Node tempNode = new Node(carry);
				tempNode.next = result;
				result = tempNode;
			}
		} else {

		}

		return result;
	}

	private int sum(Node node1, Node node2) {
		if (node1 == null && node2 == null)
			return 0;

		int carry = sum(node1.next, node2.next);
		int sum = node1.val + node2.val + carry;
		Node temp = new Node(sum % 10);
		if (result == null) {
			result = temp;
		} else {
			temp.next = result;
			result = temp;
		}

		return sum / 10;
	}

	private int getSize(Node node) {
		int count = 0;
		Node current = node;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

}
