package com.deepak.dp.inter.geeks.tree;

import java.util.ArrayList;
import java.util.List;

import com.deepak.dp.inter.TreeNode;

public class ZigzagTraversal {

	public List<Integer> traverse(TreeNode root) {

		List<Integer> integers = new ArrayList<Integer>();
		boolean flag = true;
		int height = findHeight(root);
		for (int i = 1; i <= height; i++) {
			traverse(root, i, integers, flag);
			flag=!flag;
		}

		return integers;
	}

	private void traverse(TreeNode root, int i, List<Integer> integers,
			boolean flag) {
		if (root == null)
			return;
		if (i == 1) {
			integers.add(root.val);
			return;
		}
		if (flag) {
			traverse(root.right, i - 1, integers, flag);
			traverse(root.left, i - 1, integers, flag);
		} else {
			traverse(root.left, i - 1, integers, flag);
			traverse(root.right, i - 1, integers, flag);
		}

	}

	private int findHeight(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(1 + findHeight(root.left), 1 + findHeight(root.left));
	}

}
