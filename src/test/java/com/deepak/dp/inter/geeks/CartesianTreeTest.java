package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;
import com.deepak.dp.inter.tree.CartesianTree;

public class CartesianTreeTest {

	@Test
	public void build_tree() throws Exception {
		CartesianTree cartesianTree = new CartesianTree();

		TreeNode node = cartesianTree.buildTree(new ArrayList<Integer>(Arrays
				.asList(1, 2, 3)));
		assertEquals(3, node.val);

	}

}
