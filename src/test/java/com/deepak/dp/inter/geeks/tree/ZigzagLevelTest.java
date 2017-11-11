package com.deepak.dp.inter.geeks.tree;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class ZigzagLevelTest {

	@Test
	public void _tree_7_nodes() throws Exception {
		TreeNode node1 = new TreeNode(1);

		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);

		node1.right = node3;
		node1.left = node2;

		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);

		node2.left = node7;
		node2.right = node6;

		node3.left = node5;
		node3.right = node4;

		ZigzagTraversal zigZagtraversal = new ZigzagTraversal();
		List<Integer> integers = zigZagtraversal.traverse(node1);
		
		assertEquals(1, integers.get(0).intValue());
		assertEquals(2, integers.get(1).intValue());
		assertEquals(3, integers.get(2).intValue());
		assertEquals(4, integers.get(3).intValue());
		assertEquals(5, integers.get(4).intValue());

	}

}
