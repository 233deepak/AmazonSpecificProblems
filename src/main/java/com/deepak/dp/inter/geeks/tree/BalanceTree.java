package com.deepak.dp.inter.geeks.tree;

import com.deepak.dp.inter.TreeNode;

public class BalanceTree {

	class Height {
		int height;
	}

	public boolean isBalanced(TreeNode root) {
		Height height = new Height();

		return isBalanced(root, height);
	}

	private boolean isBalanced(TreeNode root, Height height) {

		if (root == null)
			return true;
		Height lh = new Height();
		Height rh = new Height();
		boolean l = isBalanced(root.left, lh);
		boolean r = isBalanced(root.right, rh);

		height.height = ((lh.height > rh.height) ? lh.height : rh.height) + 1;
		if (l && r && (Math.abs(lh.height - rh.height)) < 2)
			return true;
		return false;
	}

}
