package com.deepak.dp.inter;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.deepak.dp.inter.BinaryTreeGenerator.TreeNode;

public class GenerateBinaryTreesTest {

	@Test
	public void _3() throws Exception {

		BinaryTreeGenerator generator = new BinaryTreeGenerator();
		ArrayList<TreeNode> nodes = generator.generateTrees(3);
		assertEquals(5, nodes.size());
		for (TreeNode node : nodes) {
			postOrder(node);
			System.out.println();
		}

	}

	@Test
	public void _2() throws Exception {

		BinaryTreeGenerator generator = new BinaryTreeGenerator();
		ArrayList<TreeNode> nodes = generator.generateTrees(2);
		assertEquals(2, nodes.size());

		for (TreeNode node : nodes) {
			postOrder(node);
		}

	}

	private void postOrder(TreeNode node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.val + " ,");

	}

}
