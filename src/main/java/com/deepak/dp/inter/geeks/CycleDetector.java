package com.deepak.dp.inter.geeks;

public class CycleDetector {

	public void removeCycle(Node head) {

		Node slow = head;
		Node fast = slow.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow)
				break;
		}

		int count = 1;
		Node temp = fast.next;

		while (temp != fast) {
			count++;
			temp = temp.next;
		}

		Node lastPointer = head;
		for (int i = 1; i <= count; i++) {
			lastPointer = lastPointer.next;
		}

		Node headPointer = head;
		while (headPointer != lastPointer) {
			headPointer = headPointer.next;
			lastPointer = lastPointer.next;
		}

		while (headPointer.next != lastPointer) {
			headPointer = headPointer.next;
		}

		headPointer.next = null;

	}

}
