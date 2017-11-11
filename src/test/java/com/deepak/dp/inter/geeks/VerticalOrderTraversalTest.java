package com.deepak.dp.inter.geeks;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.deepak.dp.inter.TreeNode;
import com.deepak.dp.inter.geeks.tree.VerticalTraversal;

public class VerticalOrderTraversalTest {

	@Test
	public void _7_node_tree() throws Exception {

		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);

		node1.right = node3;
		node1.left = node2;

		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node2.left = node4;
		node2.right = node5;

		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);

		node3.left = node6;
		node3.right = node7;

		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);

		node6.right = node8;
		node7.right = node9;
		
		VerticalTraversal  traversal =new VerticalTraversal();
		List<List<TreeNode>> nodes = traversal.traverse(node1);
		
		assertEquals(4, nodes.get(0).get(0).val);
		assertEquals( 2,nodes.get(1).get(0).val);
		/*assertEquals(nodes.get(2).get(0), 1);
		assertEquals(nodes.get(2).get(1), 5);
		assertEquals(nodes.get(2).get(2), 6);*/

	}

}
