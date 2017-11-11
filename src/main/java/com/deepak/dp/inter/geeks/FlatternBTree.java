package com.deepak.dp.inter.geeks;

import com.deepak.dp.inter.TreeNode;

public class FlatternBTree {

	public TreeNode flatterendTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode left = flatterendTree(root.left);
		if (left == null)
			return root;
		TreeNode temp = root.right;
		TreeNode rightMost = rightMost(left);
		rightMost.right = temp;
		
		root.right = left;
		root.left = null;
		return root;

	}

	private TreeNode rightMost(TreeNode root) {
		if(root.right == null)
			return root;
		return rightMost(root.right);
	}

}
