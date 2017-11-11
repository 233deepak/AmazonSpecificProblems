package com.deepak.dp;

public class PathFinder {

	public boolean findSequence(Graph graph, String requiredPath,
			int vertexIndex) {

		return findSequence(graph, requiredPath, "", vertexIndex);
	}

	private boolean findSequence(Graph graph, String requiredPath,
			String currentPath, int vertexIndex) {
		if (hasPath(requiredPath, currentPath))
			return true;
		for (Edge edge : graph.getAllEdges(vertexIndex)) {
			currentPath += edge.getWeight();
				return findSequence(graph, requiredPath, currentPath,
						edge.getDest().label);
		}

		return false;
	}

	private boolean hasPath(String requiredPath, String currentPath) {
		return requiredPath.equalsIgnoreCase(currentPath);
	}

}
