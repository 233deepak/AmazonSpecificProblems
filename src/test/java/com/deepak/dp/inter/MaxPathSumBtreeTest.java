package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxPathSumBtreeTest {

	@Test
	public void tree_3_element() throws Exception {
		MaxPathSumBtree bTree = new MaxPathSumBtree();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		int maxPath = bTree.maxPathSum(root);
		assertEquals(6, maxPath);

	}

	@Test
	public void tree_3_element_with_negative() throws Exception {
		MaxPathSumBtree bTree = new MaxPathSumBtree();
		TreeNode root = new TreeNode(-1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		int maxPath = bTree.maxPathSum(root);
		assertEquals(4, maxPath);
	}

	@Test
	public void tree_element_with_negative() throws Exception {
		MaxPathSumBtree bTree = new MaxPathSumBtree();
		TreeNode root = new TreeNode(-25);
		root.left = new TreeNode(3);
		root.right = new TreeNode(4);
		int maxPath = bTree.maxPathSum(root);
		assertEquals(4, maxPath);
	}

	@Test
	public void tree_element_5_with_negative() throws Exception {
		MaxPathSumBtree bTree = new MaxPathSumBtree();
		TreeNode root = new TreeNode(10);

		TreeNode node2 = new TreeNode(2);
		TreeNode node10 = new TreeNode(10);
		root.left = node2;
		root.right = node10;

		TreeNode node20 = new TreeNode(20);
		TreeNode node1 = new TreeNode(1);
		node2.left = node20;
		node2.right = node1;

		TreeNode node25 = new TreeNode(-25);
		node10.right = node25;

		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		node25.left = node3;
		node25.right = node4;

		int maxPath = bTree.maxPathSum(root);
		assertEquals(42, maxPath);
	}
	
	@Test
	public void tree_element_3_with_negative() throws Exception {
		MaxPathSumBtree bTree = new MaxPathSumBtree();
		TreeNode root = new TreeNode(-100);

		TreeNode node2 = new TreeNode(-200);
		root.left = node2;

		TreeNode node20 = new TreeNode(-300);
		TreeNode node1 = new TreeNode(-400);
		node2.left = node20;
		node2.right = node1;


		int maxPath = bTree.maxPathSum(root);
		assertEquals(-100, maxPath);
	}

}
