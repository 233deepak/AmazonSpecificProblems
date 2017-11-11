package com.deepak.dp.inter.geeks;

import java.util.Stack;

import com.deepak.dp.inter.TreeNode;

public class BSTIterator {

	private Stack<TreeNode> nodes;

	public BSTIterator(TreeNode root) {
		nodes = new Stack<TreeNode>();
		init(root);

	}

	private void init(TreeNode root) {
		if (root == null)
			return;
		nodes.push(root);
		init(root.left);

	}

	public int next() {
		TreeNode node = nodes.pop();
		if (node.right != null)
			nodes.push(node.right);
		return node.val;
	}

}
