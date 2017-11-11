package com.deepak.dp.inter.geeks;

import com.deepak.dp.inter.TreeNode;

public class TwoSumFinder {

	public boolean isSumExist(TreeNode root, int sum) {

		return isSumExist(root, root, sum);
	}

	private boolean isSumExist(TreeNode current, TreeNode root, int sum) {

		if (current == null)
			return false;

		if (findNodeWithVal(root, sum - current.val))
			return true;

		return isSumExist(current.left, root, sum)
				|| isSumExist(current.right, root, sum);
	}

	private boolean findNodeWithVal(TreeNode root, int val) {
		if (root == null)
			return false;
		if (root.val == val)
			return true;
		if (val < root.val)
			return findNodeWithVal(root.left, val);
		else
			return findNodeWithVal(root.right, val);
	}

}
