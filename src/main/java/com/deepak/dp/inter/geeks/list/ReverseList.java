package com.deepak.dp.inter.geeks.list;

import com.deepak.dp.inter.geeks.Node;

public class ReverseList {

	public Node reverse(Node head, int k) {

		Node subHead = head;
		while (subHead != null) {
			NodeResult result = reverseSubList(subHead, k);
			subHead = result.lastNode.next;
			

		}
		return head;

	}

	private NodeResult reverseSubList(Node subHead, int k) {
		int move = 1;
		Node currNode = subHead;
		Node next = currNode.next;
		while (next != null) {
			move++;
			Node temp = next.next;
			next.next = subHead;
			subHead = next;
			currNode.next = temp;
			next = temp;
			if (move == k)
				break;

		}

		return new NodeResult(subHead, currNode);
	}

	class NodeResult {
		Node head;
		Node lastNode;

		public NodeResult(Node head, Node lastNode) {
			super();
			this.head = head;
			this.lastNode = lastNode;
		}

		@Override
		public String toString() {
			return "NodeResult [head=" + head + ", lastNode=" + lastNode + "]";
		}

	}

}
