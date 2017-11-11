package com.deepak.dp.inter.geeks.tree;

import com.deepak.dp.inter.TreeNode;

public class LCAOfTree {

	public TreeNode findLCA(TreeNode root, int n1, int n2) {
		Result result = new Result();
		findLca(root, n1, n2, result);
		return result.lca;
	}

	private void findLca(TreeNode root, int n1, int n2, Result result) {

		if (root == null)
			return;
		if (canreach(n1, root) && canreach(n2, root)) {
			result.lca = root;
		}

		findLca(root.left, n1, n2, result);
		findLca(root.right, n1, n2, result);

	}

	private boolean canreach(int n1, TreeNode root) {
		if (root == null)
			return false;

		if (root.val == n1)
			return true;

		return canreach(n1, root.left) || canreach(n1, root.right);

	}

	class Result {
		TreeNode lca;
	}

	public TreeNode efficient(TreeNode root, int n1, int n2) {
		if (root == null)
			return null;

		if (root.val == n1 || root.val == n2)
			return root;

		TreeNode leftLca = efficient(root.left, n1, n2);
		TreeNode rightLca = efficient(root.right, n1, n2);

		if (leftLca != null && rightLca != null)
			return root;

		return (leftLca != null) ? leftLca : rightLca;

	}

}
