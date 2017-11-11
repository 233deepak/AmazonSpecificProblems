package com.deepak.dp.inter.geeks.tree;

import com.deepak.dp.inter.TreeNode;

public class IdentiticalTree {

	public boolean isDentitical(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;

		return (root1.val == root2.val && isDentitical(root1.left, root2.left) && isDentitical(
				root1.right, root2.right));
	}

}
