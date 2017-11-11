package com.deepak.dp.inter.geeks.tree;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class SymmetricTreeTest {

	@Test
	public void _symetricTree() throws Exception {

		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node22 = new TreeNode(2);
		TreeNode node33 = new TreeNode(3);
		TreeNode node44 = new TreeNode(4);

		node1.left = node2;
		node1.right = node22;

		node2.left = node3;
		node2.right = node4;

		node22.left = node44;
		node22.right = node33;

		SymmetricTree symmetricTree = new SymmetricTree();
		assertEquals(true, symmetricTree.isSymmetric(node1));
		

	}

}
