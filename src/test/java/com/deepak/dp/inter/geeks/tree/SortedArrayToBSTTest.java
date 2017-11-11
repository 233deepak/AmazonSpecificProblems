package com.deepak.dp.inter.geeks.tree;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class SortedArrayToBSTTest {

	@Test
	public void _9Elements() throws Exception {
		BSTConvertor convertor =new BSTConvertor();
		TreeNode root = convertor.create(new int[]{1,2,3,4,5,6,7,8});
		BalanceTree balanceTree =new BalanceTree();
		assertEquals(true, balanceTree.isBalanced(root));
		
	}
	
	@Test
	public void _4Elements() throws Exception {
		BSTConvertor convertor =new BSTConvertor();
		TreeNode root = convertor.create(new int[]{1,2,3,4});
		BalanceTree balanceTree =new BalanceTree();
		assertEquals(true, balanceTree.isBalanced(root));
		
	}
	
}
