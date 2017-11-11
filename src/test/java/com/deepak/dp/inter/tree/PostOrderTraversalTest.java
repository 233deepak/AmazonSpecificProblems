package com.deepak.dp.inter.tree;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class PostOrderTraversalTest {

	@Test
	public void _5_nodes() throws Exception {
		PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
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
		
		
		ArrayList<Integer> integers = postOrderTraversal.postorderTraversal(node1);
		assertEquals(4, integers.get(0).intValue());
		assertEquals(5, integers.get(1).intValue());
		assertEquals(2, integers.get(2).intValue());
		assertEquals(6, integers.get(3).intValue());
		assertEquals(7, integers.get(4).intValue());
		assertEquals(3, integers.get(5).intValue());
		assertEquals(1, integers.get(6).intValue());
	}

}
