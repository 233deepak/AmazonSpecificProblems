package com.deepak.dp.inter.geeks.tree;

import com.deepak.dp.inter.TreeNode;

public class FlatTree {

	public TreeNode flatterendTree(TreeNode root) {
		if (root == null)
			return null;

		if (root.left != null) {
			TreeNode temp = root.right;
			TreeNode rightMostInLeft = findRightMost(root.left);
			root.right = root.left;
			rightMostInLeft.right = temp;

		}

		flatterendTree(root.right);
		return root;
	}

	private TreeNode findRightMost(TreeNode root) {
		if (root.right == null)
			return root;
		return findRightMost(root.right);
	}

}
