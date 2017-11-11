package com.deepak.dp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

	private List<Vertex> vertexs;
	private List<List<Edge>> graph;

	public Graph(int[] vertices, String[][] adjencencyMatrix) {
		graph = new ArrayList<List<Edge>>();
        vertexs =new ArrayList<Vertex>();
		for (int x : vertices) {
			this.vertexs.add(new Vertex(x));
			List<Edge> edges = new LinkedList<Edge>();
			graph.add(edges);
		}

		for (int index = 0; index < adjencencyMatrix.length; index++) {
			List<Edge> edges = graph.get(index);
			for (int colIndx = 0; colIndx < adjencencyMatrix[index].length; colIndx++) {
				if (!adjencencyMatrix[index][colIndx].equals("")) {
					Edge edge = new Edge(this.vertexs.get(index),
							this.vertexs.get(colIndx),
							adjencencyMatrix[index][colIndx]);
					edges.add(edge);
				}
			}
		}

	}

	public List<Edge> getEdgesForVertex(Vertex vertex) {
		return this.graph.get(vertex.label);
	}

	public List<Vertex> getVertexs() {
		return vertexs;
	}

	public List<List<Edge>> getAllEdges() {
		return graph;
	}

	public List<Edge> getAllEdges(int vertexIndex) {
		return this.graph.get(vertexIndex);
	}

}
