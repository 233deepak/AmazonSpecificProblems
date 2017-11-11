package com.deepak.dp.inter.geeks.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.deepak.dp.inter.TreeNode;

public class MinDepthTree {

	public int findMinDepth(TreeNode root) {
		if (root == null)
			return 0;

		int min = Math.min(findMinDepth(root.left), findMinDepth(root.right));
		return min + 1;
	}

	public int findMinDepthEfficient(TreeNode root) {

		Queue<QElement> queue = new LinkedList<MinDepthTree.QElement>();
		QElement rootElement = new QElement(root, 1);
		queue.add(rootElement);
		while (!queue.isEmpty()) {
			QElement element = queue.poll();
			if (element.node.left == null && element.node.right == null)
				return element.depth;

			if (element.node.left != null) {
				queue.add(new QElement(element.node.left, element.depth + 1));
			}

			if (element.node.right != null) {
				queue.add(new QElement(element.node.right, element.depth + 1));
			}

		}

		return 0;
	}

	class QElement {
		TreeNode node;
		int depth;

		public QElement(TreeNode node, int depth) {
			super();
			this.node = node;
			this.depth = depth;
		}

		@Override
		public String toString() {
			return "QElement [node=" + node + ", depth=" + depth + "]";
		}
		

	}

}
