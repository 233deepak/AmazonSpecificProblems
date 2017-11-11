package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class LevelOrderTraversalTest {

	@Test
	public void level_order() throws Exception {
		TreeNode node3 = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
		TreeNode node20 = new TreeNode(20);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);

		node3.left = node9;
		node3.right = node20;

		node20.left = node15;
		node20.right = node7;
		
		TreeTraversal traversal = new TreeTraversal();
		List<Integer> interegs =traversal.levelOrder(node3); 
		assertEquals(3, interegs.get(0).intValue());
		assertEquals(9, interegs.get(1).intValue());
		assertEquals(20, interegs.get(2).intValue());
		assertEquals(15, interegs.get(3).intValue());
		assertEquals(7, interegs.get(4).intValue());
		
		

	}
	
	@Test
	public void spiral_order() throws Exception {
		TreeNode node3 = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
		TreeNode node20 = new TreeNode(20);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);

		node3.left = node9;
		node3.right = node20;

		node20.left = node15;
		node20.right = node7;
		
		TreeTraversal traversal = new TreeTraversal();
		List<Integer> interegs =traversal.levelOrder(node3); 
		assertEquals(3, interegs.get(0).intValue());
		assertEquals(9, interegs.get(1).intValue());
		assertEquals(20, interegs.get(2).intValue());
		assertEquals(15, interegs.get(3).intValue());
		assertEquals(7, interegs.get(4).intValue());
		
		

	}
}
