package com.deepak.dp.inter;

public class MaxPathSumBtree {

	public int maxPathSum(TreeNode a) {

		Res res = new Res();
		res.max =Integer.MIN_VALUE;
		findMax(a, res);
		return res.max;

	}

	private int findMax(TreeNode root, Res res) {

		if (root == null) {
			return 0;
		}

		int node = root.val;
		int left = findMax(root.left, res);
		int right = findMax(root.right, res);
		int single_max = Math.max(node, Math.max(left + node, right + node));
		int max_top = Math.max(single_max, left + right + node);
		res.max = Math.max(max_top, res.max);
		return single_max;
	}

	class Res {
		int max;
	}

}
