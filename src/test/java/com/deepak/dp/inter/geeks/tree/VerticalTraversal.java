package com.deepak.dp.inter.geeks.tree;

import java.util.ArrayList;
import java.util.List;

import com.deepak.dp.inter.TreeNode;

public class VerticalTraversal {

	public List<List<TreeNode>> traverse(TreeNode node1) {
		List<List<TreeNode>> nodes = new ArrayList<List<TreeNode>>();

		int minDis = findMinDis(node1);
		int maxDis = findMaxDis(node1);

		for (int i = minDis; i <= maxDis; i++) {
			List<TreeNode> nodesAtDist = new ArrayList<TreeNode>();
			traverseLevel(node1, i, 0, nodesAtDist);
			nodes.add(nodesAtDist);
		}

		return nodes;
	}

	private void traverseLevel(TreeNode root, int i, int currentDist,
			List<TreeNode> nodesAtDist) {
		if (root == null)
			return;
		if (currentDist == i)
			nodesAtDist.add(root);
		traverseLevel(root.left, i, currentDist - 1, nodesAtDist);
		traverseLevel(root.right, i, currentDist + 1, nodesAtDist);

	}

	private int findMinDis(TreeNode root) {
		if (root.left == null)
			return 0;
		return -1 + findMinDis(root.left);
	}

	private int findMaxDis(TreeNode root) {
		if (root.right == null)
			return 0;
		return 1 + findMaxDis(root.right);
	}

}
