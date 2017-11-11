package com.deepak.dp.inter.geeks.tree;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class MinDepthTest {

	@Test
	public void _6_Node_tree() throws Exception {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right =node5;
		
		MinDepthTree minDepthTree = new MinDepthTree();
		int minDepth = minDepthTree.findMinDepth(node1);
		assertEquals(2, minDepth);
		
	}
	
	@Test
	public void _6_Node_tree_Efficient() throws Exception {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right =node5;
		
		MinDepthTree minDepthTree = new MinDepthTree();
		int minDepth = minDepthTree.findMinDepthEfficient(node1);
		assertEquals(2, minDepth);
		
	}

}
