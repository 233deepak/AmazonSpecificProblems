package com.deepak.dp.inter.geeks;

import com.deepak.dp.inter.TreeNode;

public class ValidBTree {

	public boolean isValid(TreeNode root) {

		if (root == null)
			return true;

		boolean currentLeft = (root.left != null) ? root.left.val < root.val
				: true;
		boolean currentRight = (root.right != null) ? root.right.val > root.val
				: true;
		return (isValid(root.left) && currentLeft)
				&& (isValid(root.right) && currentRight);
	}

}
