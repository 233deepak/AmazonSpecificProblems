package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class ValidBTreeTest {

	@Test
	public void _6_nodeTree() throws Exception {
		ValidBTree btree = new ValidBTree();
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		
		node4.left = node2;
		node4.right =node5;
		
		node2.left = node1;
		node2.right =node3;
		
		assertEquals(true, btree.isValid(node4));

	}
	
	@Test
	public void _6_nodeTree_Invalid() throws Exception {
		ValidBTree btree = new ValidBTree();
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		node1.right = node5;
		node1.left = node2;
		node2.left = node3;
		node2.right = node4;
		node5.right = node6;
		
		assertEquals(false, btree.isValid(node1));

	}
	
	

}
