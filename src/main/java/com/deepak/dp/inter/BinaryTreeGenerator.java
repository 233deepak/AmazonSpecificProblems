package com.deepak.dp.inter;

import java.util.ArrayList;

public class BinaryTreeGenerator {

	public ArrayList<TreeNode> generateTrees(int a) {

		return generateTree(1, a);

	}

	private ArrayList<TreeNode> generateTree(int i, int a) {

		ArrayList<TreeNode> arrayList =new ArrayList<BinaryTreeGenerator.TreeNode>();
		if (i > a)
			return arrayList;
		if (i == a){
			arrayList.add(new TreeNode(a));
			return arrayList ;
		}

		TreeNode root = null;
		for (int j = i; j <= a; j++) {
			
			ArrayList<TreeNode> left = generateTree(i, j - 1);
			ArrayList<TreeNode> right = generateTree(j + 1, a);
			if(left.size()>0 && right.size()>0){
				
				for(TreeNode leftnode :left){
					for(TreeNode righNode:right){
						root = new TreeNode(j);
						root.left = leftnode;
						root.right =righNode;
						arrayList.add(root);
					}
				}
			}
			if(left.size()!=0 && right.isEmpty()){
				for(TreeNode leftnode :left){
					root = new TreeNode(j);
					root.left = leftnode;
					root.right =null;
					arrayList.add(root);
				}
			}
			
			if(right.size() !=0 && left.isEmpty()){
				for(TreeNode rightNode :right){
					root = new TreeNode(j);
					root.left =null ;
					root.right =rightNode;
					arrayList.add(root);
				}
			}
			
		}

		return arrayList;
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			return "TreeNode [val=" + val + ", left=" + left + ", right="
					+ right + "]";
		}

	}

}
