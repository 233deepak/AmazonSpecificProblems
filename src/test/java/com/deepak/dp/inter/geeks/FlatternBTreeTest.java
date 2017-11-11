package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class FlatternBTreeTest {

	@Test
	public void _6_node_tree() throws Exception {

		FlatternBTree flatternBTree = new FlatternBTree();
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		node1.right = node5;
		node1.left = node2;
		node2.left = node3;
		node2.right = node4;
		node5.right = node6;

		TreeNode root = flatternBTree.flatterendTree(node1);

		assertEquals(1, root.val);
		assertEquals(2, root.right.val);
		assertEquals(3, root.right.right.val);

	}

}
