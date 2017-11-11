package com.deepak.dp.inter.geeks.tree;

import com.deepak.dp.inter.TreeNode;

public class PathSumFinder {

	public boolean findSum(TreeNode root, int sum) {
		if (sum != 0 && root == null)
			return false;
		if (sum == 0 && root == null)
			return true;

		return findSum(root.left, sum - root.val)
				|| findSum(root.right, sum - root.val);
	}

}
