package com.deepak.dp.inter.geeks.tree;

import com.deepak.dp.inter.TreeNode;

public class BSTConvertor {

	public TreeNode create(int[] array) {

		return create(array, 0, array.length - 1);
	}

	private TreeNode create(int[] array, int start, int end) {
		if (start > end)
			return null;
		if (end == start)
			return new TreeNode(array[start]);

		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(array[mid]);
		TreeNode left = create(array, start, mid - 1);
		TreeNode right = create(array, mid + 1, end);

		root.left = left;
		root.right = right;

		return root;
	}

}
