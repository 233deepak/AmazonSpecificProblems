package com.deepak.dp.inter.geeks.list;

import com.deepak.dp.inter.geeks.Node;

public class DetectCycle {

	public void fixCycle(Node head) {

		Node slow = head;
		Node fast = head.next;

		while (fast != null && fast.next != null) {
			if (slow == fast)
				break;
			slow = slow.next;
			fast = fast.next.next;

		}

		Node curr = head;
		while (curr != null) {
			if (canReach(curr, slow))
				break;
			curr = curr.next;
		}

	}

	private boolean canReach(Node curr, Node slow) {

		Node temp = slow.next;
		Node prev = slow;
		while (temp != null && temp != slow) {
			if (temp.val == curr.val) {
				prev.next = null;
				return true;
			}

			prev = temp;
			temp = temp.next;

		}

		return false;
	}
}
