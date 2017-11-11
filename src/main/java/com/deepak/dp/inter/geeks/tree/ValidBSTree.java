package com.deepak.dp.inter.geeks.tree;

import com.deepak.dp.inter.TreeNode;

public class ValidBSTree {

	public boolean isvalid(TreeNode root) {

		return isValid(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	private boolean isValid(TreeNode root, int maxValue, int minValue) {
		if (root == null)
			return true;
		if (root.val <= maxValue && root.val >= minValue) {
			return isValid(root.left, root.val, minValue)
					&& isValid(root, maxValue, root.val);
		}
		return false;
	}
}
