package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class TwoSumTest {

	@Test
	public void _sum_33() throws Exception {
		TreeNode node15 = new TreeNode(15);
		TreeNode node10 = new TreeNode(10);
		TreeNode node8 = new TreeNode(8);
		TreeNode node12 = new TreeNode(12);
		TreeNode node20 = new TreeNode(20);
		TreeNode node16 = new TreeNode(16);
		TreeNode node25 = new TreeNode(25);

		node15.left = node10;
		node15.right = node20;

		node10.left = node8;
		node10.right = node12;

		node20.left = node16;
		node20.right = node25;

		TwoSumFinder finder = new TwoSumFinder();
		assertEquals(true, finder.isSumExist(node15,33));
	}
	
	@Test
	public void _sum_2() throws Exception {
		TreeNode node15 = new TreeNode(15);
		TreeNode node10 = new TreeNode(10);
		TreeNode node8 = new TreeNode(8);
		TreeNode node12 = new TreeNode(12);
		TreeNode node20 = new TreeNode(20);
		TreeNode node16 = new TreeNode(16);
		TreeNode node25 = new TreeNode(25);

		node15.left = node10;
		node15.right = node20;

		node10.left = node8;
		node10.right = node12;

		node20.left = node16;
		node20.right = node25;

		TwoSumFinder finder = new TwoSumFinder();
		assertEquals(false, finder.isSumExist(node15,2));
	}

}
