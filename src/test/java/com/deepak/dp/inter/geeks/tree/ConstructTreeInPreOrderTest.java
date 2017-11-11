package com.deepak.dp.inter.geeks.tree;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;
import com.deepak.dp.inter.geeks.ConstructTree;

public class ConstructTreeInPreOrderTest {

	@Test
	public void treewith_6element() throws Exception {

		InPreOrderTree inPreOrderTree = new InPreOrderTree();
		TreeNode treeNode = inPreOrderTree.construct(
				new ArrayList<Character>(Arrays.asList('D', 'B', 'E', 'A', 'F',
						'C')),
				new ArrayList<Character>(Arrays.asList('A', 'B', 'D', 'E', 'C',
						'F')));
		assertEquals('A', treeNode.character);
		assertEquals('B', treeNode.left.character);
	}

}
