package com.deepak.dp.inter.tree;

import java.util.ArrayList;
import java.util.Stack;

import com.deepak.dp.inter.TreeNode;

public class PostOrderTraversal {

	public ArrayList<Integer> postorderTraversal(TreeNode a) {

		ArrayList<Integer> integers = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();

		TreeNode current = a;
		while (!stack.isEmpty() || current != null) {
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
