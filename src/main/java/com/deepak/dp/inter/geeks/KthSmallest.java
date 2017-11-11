package com.deepak.dp.inter.geeks;

import com.deepak.dp.inter.TreeNode;

public class KthSmallest {

	public int findKth(TreeNode root, int k) {
		updateHeight(root);
		return find(root, k);
	}

	private int find(TreeNode root, int k) {

		int r = ((root.left == null) ? 0 : root.left.size) + 1;
		if (r == k)
			return root.val;

		if (k > r)
			return find(root.right, k - r);
		else if (k < r)
			return find(root.left, k);
		return 0;
	}

	private int updateHeight(TreeNode root) {
		if (root == null)
			return 0;
		int left = updateHeight(root.left);
		int right = updateHeight(root.right);

		root.size = left + right + 1;
		return root.size;

	}

}
