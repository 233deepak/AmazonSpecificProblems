package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class PathSumTest {
	
	@Test
	public void _sum_30() throws Exception {
		TreeNode node3 = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
		TreeNode node20 = new TreeNode(20);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);

		node3.left = node9;
		node3.right = node20;

		node20.left = node15;
		node20.right = node7;
		
		PathSum pathSum = new PathSum();
		assertEquals(true, pathSum.exist(node3,30));
		
		
	}
	
	
	@Test
	public void _sum_23() throws Exception {
		TreeNode node3 = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
		TreeNode node20 = new TreeNode(20);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);
		
		node3.left = node9;
		node3.right = node20;

		node20.left = node15;
		node20.right = node7;
		
		PathSum pathSum = new PathSum();
		assertEquals(false, pathSum.exist(node3,23));
		
		
	}
	

}
