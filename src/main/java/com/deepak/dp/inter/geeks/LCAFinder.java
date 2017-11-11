package com.deepak.dp.inter.geeks;

import javax.naming.spi.DirStateFactory.Result;

import com.deepak.dp.Node;
import com.deepak.dp.inter.TreeNode;

public class LCAFinder {

	class Result {
		TreeNode lca;
	}
	public TreeNode LCA(TreeNode root, int n1, int n2) {

		Result result =new Result();
		findLca(root, n1, n2, result);
		return result.lca;

	}

	private void findLca(TreeNode root, int n1, int n2, Result result) {
		if (root == null)
			return;
		if (canReach(root, n1) && canReach(root, n2)) {
			result.lca = root;
		}
		findLca(root.left, n1, n2, result);
		findLca(root.right, n1, n2, result);

	}

	private boolean canReach(TreeNode root, int n1) {
		if (root == null)
			return false;
		if (root.val == n1)
			return true;

		return canReach(root.left, n1) || canReach(root.right, n1);

	}

}
