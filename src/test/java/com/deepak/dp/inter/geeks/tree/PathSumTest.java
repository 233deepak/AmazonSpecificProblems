package com.deepak.dp.inter.geeks.tree;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class PathSumTest {

	@Test
	public void sum_21() throws Exception {

		TreeNode node10 = new TreeNode(10);
		TreeNode node8 = new TreeNode(8);
		TreeNode node3 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2);
		TreeNode node22 = new TreeNode(2);

		node10.left = node8;
		node8.left = node3;
		node8.right = node5;

		node10.right = node2;
		node2.left = node22;

		PathSumFinder pathSum = new PathSumFinder();
		assertEquals(true, pathSum.findSum(node10, 21));

	}
	
	@Test
	public void sum_27() throws Exception {

		TreeNode node10 = new TreeNode(10);
		TreeNode node8 = new TreeNode(8);
		TreeNode node3 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2);
		TreeNode node22 = new TreeNode(2);

		node10.left = node8;
		node8.left = node3;
		node8.right = node5;

		node10.right = node2;
		node2.left = node22;

		PathSumFinder pathSum = new PathSumFinder();
		assertEquals(false, pathSum.findSum(node10, 27));

	}


}
