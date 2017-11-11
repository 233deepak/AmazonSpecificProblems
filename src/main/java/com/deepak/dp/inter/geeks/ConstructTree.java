package com.deepak.dp.inter.geeks;

import java.io.IOError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.deepak.dp.inter.TreeNode;

public class ConstructTree {

	public TreeNode construct(ArrayList<Character> inorder,
			ArrayList<Character> preOrder) {

		return buildTree(inorder, preOrder);

	}

	private TreeNode buildTree(ArrayList<Character> inorder,
			ArrayList<Character> preOrder) {
		if (preOrder.isEmpty() || inorder.isEmpty())
			return null;

		TreeNode root = new TreeNode(preOrder.get(0));
		int indexOfRoot = inorder.indexOf(preOrder.get(0));

		ArrayList<Character> left = findSubSet(inorder, 0, indexOfRoot - 1);
		preOrder.remove(0);
		TreeNode leftNode = buildTree(left, preOrder);

		ArrayList<Character> right = findSubSet(inorder, indexOfRoot + 1,
				inorder.size() - 1);
		TreeNode rightNode = buildTree(right, preOrder);

		root.left = leftNode;
		root.right = rightNode;
		return root;
	}

	private ArrayList<Character> findSubSet(ArrayList<Character> inorder,
			int start, int end) {
		ArrayList<Character> characters = new ArrayList<Character>();
		for (int i = start; i <= end; i++) {
			characters.add(inorder.get(i));
		}
		return characters;
	}

}
