package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueBinaryTreeTest {
	
	@Test
	public void _3() throws Exception {
		
		UniqueBinaryTree tree = new UniqueBinaryTree();
		int noOfTree = tree.numTrees(3);
		assertEquals(5, noOfTree);
	}

	
}
