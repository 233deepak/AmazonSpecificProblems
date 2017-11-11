package com.deepak.dp.inter.geeks.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.deepak.dp.inter.TreeNode;

public class InordertTraversal {

	public List<Integer> traverse(TreeNode root) {

		List<Integer> integers = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode temp = root;
		while (temp != null) {
			stack.push(temp);
			temp = temp.left;
		}

		while (!stack.isEmpty()) {
			TreeNode top = stack.pop();
			integers.add(top.val);
			TreeNode right = top.right;
			while (right != null) {
				stack.push(right);
				right = right.left;
			}

		}
		return integers;
	}

}
