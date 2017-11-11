package com.deepak.dp.inter.geeks;

import com.deepak.dp.inter.TreeNode;

public class IdenticalTree {

	public boolean isIdentical(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;

		if (root1.val != root2.val)
			return false;

		return isIdentical(root1.left, root2.left)
				&& isIdentical(root1.right, root2.right);
	}

}
