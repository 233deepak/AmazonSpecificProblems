package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class IdentitcalTreetest {

	@Test
	public void tree_3_nodes() throws Exception {
		IdenticalTree identicalTree = new IdenticalTree();

		TreeNode node10 = new TreeNode(10);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		node10.left = node5;
		node10.right = node6;
		
		TreeNode node110 = new TreeNode(10);
		TreeNode node15 = new TreeNode(5);

		node110.left = node5;
		
		assertEquals(false, identicalTree.isIdentical(node10,node110));

	}


	@Test
	public void tree_3_nodes_valid() throws Exception {
		IdenticalTree identicalTree = new IdenticalTree();

		TreeNode node10 = new TreeNode(10);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		node10.left = node5;
		node10.right = node6;
		
		TreeNode node110 = new TreeNode(10);
		TreeNode node15 = new TreeNode(5);
		TreeNode node16 = new TreeNode(6);
		
		node110.left = node5;
		node110.right = node16;
		
		assertEquals(true, identicalTree.isIdentical(node10,node110));

	}
}
