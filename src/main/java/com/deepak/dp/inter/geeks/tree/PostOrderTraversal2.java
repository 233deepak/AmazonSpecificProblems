package com.deepak.dp.inter.geeks.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.deepak.dp.inter.TreeNode;

public class PostOrderTraversal2 {

	public List<Integer> traverse(TreeNode root) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<Integer> integers = new ArrayList<Integer>();
		TreeNode current = root;

		while (current != null || !stack.isEmpty()) {

			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {

				TreeNode temp = stack.peek().right;
				if (temp == null) {
					temp = stack.pop();
					integers.add(temp.val);
					while (!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						integers.add(temp.val);
					}
				} else {
					current = temp;
				}

			}

		}

		return integers;
	}

}
