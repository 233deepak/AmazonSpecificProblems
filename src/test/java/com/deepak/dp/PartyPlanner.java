package com.deepak.dp;

import java.util.ArrayList;
import java.util.List;

public class PartyPlanner {

	public int planParty(Node root) {
		if(root ==null)
			return 0;
		int leftSum = includeCurrent(root);
		int rightSum = planParty(root.left);
		return max(leftSum, rightSum);
	}

	private int max(int leftSum, int rightSum) {
		return (leftSum>rightSum)?leftSum:rightSum;
	}

	private int includeCurrent(Node root) {
		List<Node> rightSiblings = getRightSiblings(root);
		int rightSiblingSum = 0;
		for (Node node : rightSiblings)
			rightSiblingSum += node.rating;
		List<Node> grandChilds = getGrandChilds(root);
		int tempsum = 0;
		for (Node child : grandChilds) {
			tempsum += planParty(child);
		}

		return rightSiblingSum + tempsum;
	}

	private List<Node> getGrandChilds(Node root) {
		List<Node> nodes = new ArrayList<Node>();
		List<Node> childs = getRightSiblings(root.left);
		for (Node node : childs) {
			if (node.left != null)
				nodes.add(node.left);
		}
		return nodes;
	}

	private List<Node> getRightSiblings(Node root) {
		List<Node> nodes = new ArrayList<Node>();
		while (root != null) {
			nodes.add(root);
			root = root.rightSibling;
		}
		return nodes;
	}

}
