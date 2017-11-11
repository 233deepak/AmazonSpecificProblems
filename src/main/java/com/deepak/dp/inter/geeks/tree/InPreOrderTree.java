package com.deepak.dp.inter.geeks.tree;

import java.util.ArrayList;

import com.deepak.dp.inter.TreeNode;

public class InPreOrderTree {

	public TreeNode construct(ArrayList<Character> inOrder,
			ArrayList<Character> preOrder) {

		if (preOrder.isEmpty() || inOrder.isEmpty())
			return null;

		Character character = preOrder.get(0);
		TreeNode root = new TreeNode(character);
		int index = inOrder.indexOf(character);
		ArrayList<Character> left = subList(inOrder, 0, index - 1);
		ArrayList<Character> right = subList(inOrder, index + 1, inOrder.size()-1);
		preOrder.remove(0);
		TreeNode leftSubTree = construct(left, preOrder);
		TreeNode rightSubTree = construct(right, preOrder);
		root.left = leftSubTree;
		root.right = rightSubTree;

		return root;
	}

	private ArrayList<Character> subList(ArrayList<Character> inOrder,
			int first, int last) {
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = first; i <= last; i++) {
			list.add(inOrder.get(i));
		}
		return list;
	}

}
