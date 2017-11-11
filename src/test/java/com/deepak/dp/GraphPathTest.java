package com.deepak.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphPathTest {

	@Test
	public void graphHavingSingleVertices() throws Exception {
		int[] vertices = { 0 };
		String[][] adjencencyMatrix = { {} };
		Graph graph = new Graph(vertices, adjencencyMatrix);
		PathFinder pathfinder = new PathFinder();
		boolean pathExist = pathfinder.findSequence(graph, "s1s2", 0);
		assertEquals(false, pathExist);
	}

	@Test
	public void graphHavingSingleEdge_wrong_path() throws Exception {
		int[] vertices = { 0, 1 };
		String[][] adjencencyMatrix = { { "", "s3" }, { "", "" } };
		Graph graph = new Graph(vertices, adjencencyMatrix);
		PathFinder pathfinder = new PathFinder();
		boolean pathExist = pathfinder.findSequence(graph, "s1", 0);
		assertEquals(false, pathExist);
	}

	@Test
	public void graphHavingSingleEdge_correct_path() throws Exception {
		int[] vertices = { 0, 1 };
		String[][] adjencencyMatrix = { { "", "s3" }, { "", "" } };
		Graph graph = new Graph(vertices, adjencencyMatrix);
		PathFinder pathfinder = new PathFinder();
		boolean pathExist = pathfinder.findSequence(graph, "s3", 0);
		assertEquals(true, pathExist);
	}

	@Test
	public void graphHavingSingleEdge_correct_path_with_4() throws Exception {
		int[] vertices = { 0, 1, 2, 3 };
		String[][] adjencencyMatrix = { { "", "s1", "", "" },
				{ "", "", "s3", "s2" }, { "", "", "", "s4" },
				{ "", "", "", "" } };
		Graph graph = new Graph(vertices, adjencencyMatrix);
		PathFinder pathfinder = new PathFinder();
		boolean pathExist = pathfinder.findSequence(graph, "s1s3s4", 0);
		assertEquals(true, pathExist);
	}

}
