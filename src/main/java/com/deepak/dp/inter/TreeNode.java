package com.deepak.dp.inter;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public char character;
	public int size;
	
	public TreeNode next;
	

	public TreeNode(int x) {
		val = x;
	}

	public TreeNode(char character) {
		super();
		this.character = character;
	}

	@Override
	public String toString() {
		return "TreeNode [val=" + val + ", left=" + left + ", right=" + right
				+ ", character=" + character + ", noElementBelow="
				+ size + "]";
	}

	

	

}
