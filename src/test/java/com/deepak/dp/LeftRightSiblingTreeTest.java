package com.deepak.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeftRightSiblingTreeTest {

	@Test
	public void printTree() throws Exception {
		LRSiblingTree lRSiblingTree = setupTree();
		lRSiblingTree.traverse(lRSiblingTree.root);
	}
	
	@Test
	public void partyPlanning() throws Exception {
		LRSiblingTree lRSiblingTree = setupTree();
		PartyPlanner planner = new PartyPlanner();
		int maxSum = planner.planParty(lRSiblingTree.root);
		assertEquals(28, maxSum);
	}

	private LRSiblingTree setupTree() {
		Node root = new Node("Boss", 5);
		Node node4 = new Node("X", 4);
		Node node7 = new Node("z", 7);
		Node node3 = new Node("U", 3);
		Node node20 = new Node("V", 20);
		Node node3T = new Node("T", 3);
		Node node2 = new Node("B", 2);
		Node node1 = new Node("D", 1);
		Node node2c = new Node("C", 2);

		root.left = node4;
		node4.parent = root;

		node4.rightSibling = node7;
		node7.parent = root;

		node7.rightSibling = node3;
		node3.parent = root;

		node4.left = node1;
		node1.parent = node4;

		node1.rightSibling = node2;
		node2.parent = node4;

		node3.left = node20;
		node20.parent = node3;

		node20.left = node3T;
		node3T.parent = node20;

		node2c.parent = node3;
		node3T.rightSibling = node2c;

		LRSiblingTree lRSiblingTree = new LRSiblingTree(root);
		return lRSiblingTree;
	}

}
