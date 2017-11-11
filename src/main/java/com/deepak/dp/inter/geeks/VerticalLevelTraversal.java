package com.deepak.dp.inter.geeks;

import com.deepak.dp.inter.TreeNode;

public class VerticalLevelTraversal {

	class CurrentDist {
		int dist;
	}

	public void traverse(TreeNode root) {

		int minDis = findMinDist(root);
		int maxDis = findMaxDist(root);

		CurrentDist currentDist = new CurrentDist();
		for (int i = minDis; i <= maxDis; i++) {
			currentDist = new CurrentDist();
			traverse(root, i,currentDist);
		}

	}

	private void traverse(TreeNode root, int i, CurrentDist currentDist) {
        
		//if(i==currentDist)
			
		
	}

	private int findMaxDist(TreeNode root) {
		if (root == null)
			return 0;
		int rightMax = findMinDist(root.right);
		return rightMax + 1;
	}

	private int findMinDist(TreeNode root) {
		if (root == null)
			return 0;
		int leftMin = findMinDist(root.left);
		return leftMin - 1;
	}

}
