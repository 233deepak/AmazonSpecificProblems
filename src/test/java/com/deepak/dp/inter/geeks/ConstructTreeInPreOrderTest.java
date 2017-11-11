package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;

public class ConstructTreeInPreOrderTest {
	
	@Test
	public void treewith_6element() throws Exception {
		
		ConstructTree constructTree =new ConstructTree();
		TreeNode treeNode =constructTree.construct(new ArrayList<Character>(Arrays.asList('D','B','E','A','F','C')), new ArrayList<Character>(Arrays.asList('A','B','D','E','C','F')));
		assertEquals('A', treeNode.character);
		assertEquals('B', treeNode.left.character);
	}

}
