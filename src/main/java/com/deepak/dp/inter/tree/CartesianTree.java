package com.deepak.dp.inter.tree;

import java.util.ArrayList;

import com.deepak.dp.inter.TreeNode;

public class CartesianTree {

	public TreeNode buildTree(ArrayList<Integer> a) {

		TreeNode root = null;
		for (int index = 0; index < a.size(); index++) {
			TreeNode node = new TreeNode(a.get(index));
			if (root == null) {
				root = node;
				continue;
			}

			TreeNode temp = root;
			root = node;
			root.left = temp;

			if (satisfyProperty(root)) {
				continue;
			} else {
				root = temp;
				root.right = node;
			}

		}
		return root;
	}

	private boolean satisfyProperty(TreeNode root) {

		if (root == null)
			return true;
		if (root.left == null && root.right == null)
			return true;
		if (root.left != null && root.left.val > root.val)
			return false;
		if (root.right != null && root.right.val < root.val)
			return false;
		return satisfyProperty(root.left) && satisfyProperty(root.right);
	}
}
