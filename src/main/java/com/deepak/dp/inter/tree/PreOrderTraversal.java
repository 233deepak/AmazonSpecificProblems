package com.deepak.dp.inter.tree;

import java.util.ArrayList;
import java.util.Stack;

import com.deepak.dp.inter.TreeNode;

public class PreOrderTraversal {

	public ArrayList<Integer> preorderTraversal(TreeNode a) {

		ArrayList<Integer> integers = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(a);

		while (!stack.isEmpty()) {
			TreeNode top = stack.pop();
			integers.add(top.val);
			if (top.right != null)
				stack.push(top.right);
			if (top.left != null)
				stack.push(top.left);
			
		}
		return integers;

	}

}
