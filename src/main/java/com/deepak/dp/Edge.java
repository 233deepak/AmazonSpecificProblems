package com.deepak.dp;

public class Edge {

	private Vertex source;
	private Vertex dest;
	private String weight;

	public Edge(Vertex source, Vertex destination, String weight) {
		this.source = source;
		this.dest = destination;
		this.weight = weight;

	}

	public Vertex getSource() {
		return source;
	}

	public void setSource(Vertex source) {
		this.source = source;
	}

	public Vertex getDest() {
		return dest;
	}

	public void setDest(Vertex dest) {
		this.dest = dest;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	

}
