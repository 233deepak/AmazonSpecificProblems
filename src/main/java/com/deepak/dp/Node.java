package com.deepak.dp;

public class Node {

	String name;
	int rating;
	Node parent;
	Node left;
	Node rightSibling;

	public Node(String name, int rating) {
		super();
		this.name = name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Node [name=" + name + ", rating=" + rating + "]";
	}

}
