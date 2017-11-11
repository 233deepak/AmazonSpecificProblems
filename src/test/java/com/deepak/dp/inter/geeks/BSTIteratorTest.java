package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class BSTIteratorTest {

	@Test
	public void tree_5_nodes() throws Exception {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		node4.left = node2;
		node4.right = node5;

		node2.left = node1;
		node2.right = node3;

		BSTIterator bstIterator = new BSTIterator(node4);

		assertEquals(1, bstIterator.next());
		assertEquals(2, bstIterator.next());
		assertEquals(3, bstIterator.next());
		assertEquals(4, bstIterator.next());
		assertEquals(5, bstIterator.next());

	}
}
