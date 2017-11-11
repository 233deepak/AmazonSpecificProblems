package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class MinDepthTest {

	
	@Test
	public void _5_node() throws Exception {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);

		node1.right = node3;
		node1.left = node2;

		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node2.left = node4;
		node2.right = node5;
		
		MinDepth depth = new MinDepth();
		int minDepth = depth.findMinDepth(node1);
		assertEquals(2, minDepth);
		
	}
	
	@Test
	public void _4_node() throws Exception {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);

		//node1.right = node3;
		node1.left = node2;

		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node2.left = node4;
		node2.right = node5;
		
		MinDepth depth = new MinDepth();
		int minDepth = depth.findMinDepth(node1);
		assertEquals(1, minDepth);
		
	}

}
