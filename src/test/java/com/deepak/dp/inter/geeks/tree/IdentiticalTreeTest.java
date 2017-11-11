package com.deepak.dp.inter.geeks.tree;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class IdentiticalTreeTest {

	@Test
	public void _identical_tree() throws Exception {

		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;

		TreeNode node11 = new TreeNode(1);
		TreeNode node22 = new TreeNode(2);
		TreeNode node33 = new TreeNode(3);
		TreeNode node44 = new TreeNode(4);
		TreeNode node55 = new TreeNode(5);

		node11.left = node22;
		node11.right = node33;
		node22.left = node44;
		node22.right = node55;

		IdentiticalTree identiticalTree = new IdentiticalTree();
		assertEquals(true, identiticalTree.isDentitical(node1, node11));

	}

}
