package com.deepak.dp.inter.tree;

import java.util.ArrayList;
import java.util.Stack;

import com.deepak.dp.inter.TreeNode;

public class InOrderTraversal {

	public ArrayList<Integer> inorderTraversal(TreeNode a) {

		ArrayList<Integer> integers = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (a != null) {
			stack.push(a);
			a = a.left;
		}

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			integers.add(node.val);
			if (node.right != null) {
				TreeNode temp = node.right;
				while (temp != null) {
					stack.push(temp);
					temp = temp.left;
				}
			}
		}

		return integers;

	}
}
