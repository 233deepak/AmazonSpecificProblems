package com.deepak.dp.inter.geeks;

import com.deepak.dp.inter.TreeNode;

public class MinDepth {

	public int findMinDepth(TreeNode root) {
		if (root == null)
			return 0;
		return Math.min(1 + findMinDepth(root.left),
				1 + findMinDepth(root.right));
	}

}
