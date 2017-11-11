package com.deepak.dp.inter.geeks.tree;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class JoinNextRightTest {

	@Test
	public void _10_nodes() throws Exception {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(10);
		TreeNode node11 = new TreeNode(11);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;

		node3.left = node6;
		node3.right = node7;

		node4.left = node8;
		node4.right = node9;

		node7.left = node10;
		node7.right = node11;

		JoinNext joinNext = new JoinNext();
		joinNext.join(node1);

		assertEquals(null, node1.next);
		assertEquals(node3, node2.next);
		assertEquals(node9, node8.next);
		assertEquals(node10, node9.next);

	}

}
