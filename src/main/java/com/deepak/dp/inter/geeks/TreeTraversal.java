package com.deepak.dp.inter.geeks;

import java.util.ArrayList;
import java.util.List;

import com.deepak.dp.inter.TreeNode;

public class TreeTraversal {

	public List<Integer> levelOrder(TreeNode root) {
		List<Integer> integers = new ArrayList<Integer>();
		int height = height(root);
		for (int d = 1; d <= height; d++) {
			levelOrder(root, d, integers);
		}

		return integers;
	}

	private void levelOrder(TreeNode root, int d, List<Integer> integers) {
		if(root ==null)
			return;
		if (d == 1) {
			integers.add(root.val);
			return;
		}

		levelOrder(root.left, d - 1, integers);
		levelOrder(root.right, d - 1, integers);

	}

	private int height(TreeNode root) {

		if (root == null)
			return 0;

		int left = height(root.left);
		int right = height(root.right);

		if (left > right)
			return left + 1;

		return right + 1;
	}

}
