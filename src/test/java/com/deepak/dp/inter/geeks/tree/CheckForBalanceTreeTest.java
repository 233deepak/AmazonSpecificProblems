package com.deepak.dp.inter.geeks.tree;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class CheckForBalanceTreeTest {

	@Test
	public void _balanced_tree() throws Exception {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		node1.left = node2;
		node1.right = node3;

		node2.left = node4;
		node2.right = node5;

		node3.left = node6;

		BalanceTree tree = new BalanceTree();
		assertEquals(true, tree.isBalanced(node1));

	}
	
	@Test
	public void _un_balanced_tree() throws Exception {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		node1.left = node2;
		node1.right = node4;

		node2.right = node3;

		node3.right = node5;
		
		node5.right = node6;

		BalanceTree tree = new BalanceTree();
		assertEquals(false, tree.isBalanced(node1));

	}

}
