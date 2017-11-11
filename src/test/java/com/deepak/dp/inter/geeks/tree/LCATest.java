package com.deepak.dp.inter.geeks.tree;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;
import com.deepak.dp.inter.geeks.LCAFinder;

public class LCATest {

	@Test
	public void _7_node() throws Exception {

		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);

		node1.right = node3;
		node1.left = node2;

		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node2.left = node4;
		node2.right = node5;

		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);

		node3.left = node6;
		node3.right = node7;

		LCAOfTree  lcaOfTree = new LCAOfTree();
		TreeNode lca =  lcaOfTree.findLCA(node1,4,5);
		assertEquals(2, lca.val);
	}
	
	@Test
	public void _7_node_efficient() throws Exception {

		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);

		node1.right = node3;
		node1.left = node2;

		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node2.left = node4;
		node2.right = node5;

		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);

		node3.left = node6;
		node3.right = node7;

		LCAOfTree  lcaOfTree = new LCAOfTree();
		TreeNode lca =  lcaOfTree.efficient(node1, 4, 5);
		assertEquals(2, lca.val);
	}
}
