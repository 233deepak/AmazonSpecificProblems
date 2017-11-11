package com.deepak.dp.inter.geeks;

import com.deepak.dp.inter.TreeNode;

public class PathSum {

	public boolean exist(TreeNode root, int sum) {
		if (sum == 0 && root == null)
			return true;
		if (root == null)
			return false;

		return exist(root.left, sum - root.val)
				|| exist(root.right, sum - root.val);
	}

}
