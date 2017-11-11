package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class KthSmallestNumberTest {

	@Test
	public void _3_smallest() throws Exception {

		TreeNode node20 = new TreeNode(20);
		TreeNode node8 = new TreeNode(8);
		TreeNode node4 = new TreeNode(4);
		TreeNode node12 = new TreeNode(12);
		TreeNode node10 = new TreeNode(10);
		TreeNode node14 = new TreeNode(14);
		TreeNode node22 = new TreeNode(22);

		node20.left = node8;
		node20.right = node22;

		node8.left = node4;
		node8.right = node12;

		node12.left = node10;
		node12.right = node14;

		KthSmallest smallest = new KthSmallest();
		int _3rdSmallest = smallest.findKth(node20,3);

		assertEquals(10, _3rdSmallest);

	}

}
