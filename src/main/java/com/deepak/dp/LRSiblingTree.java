package com.deepak.dp;

public class LRSiblingTree {

	Node root;

	public LRSiblingTree(Node root) {
		super();
		this.root = root;
	}

	public void traverse(Node root) {
		if (root == null)
			return;
		System.out.println(root.name);
		traverse(root.rightSibling);
		traverse(root.left);
	}

}
