package com.deepak.dp.inter.geeks.tree;

import com.deepak.dp.inter.TreeNode;

public class JoinNext {

	public void join(TreeNode root) {
		if (root == null)
			return;

		if (root.left != null && root.right != null)
			root.left.next = root.right;
		else if (root.left != null)
			root.left.next = findNext(root.next);
		 if (root.right != null)
			root.right.next = findNext(root.next);

		join(root.next);
		join(root.left);

	}

	private TreeNode findNext(TreeNode root) {
		if (root == null)
			return null;
		if (root.left != null)
			return root.left;
		if (root.right != null)
			return root.right;
		return findNext(root.next);
	}
}
