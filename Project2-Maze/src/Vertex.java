import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private List<Vertex> neighborlist;

	public Vertex(String name) {
		this.name = name;
		this.neighborlist = neighborlist;
	}

	public Boolean isVisited() {
		return visited;
	}
	
	public void setVisited(Boolean b) {
		visited = b;
	}
	
	public void addNeighbor(Vertex v) {
		this.neighborlist.add(v); 
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setNeighbor(List<Vertex> vertexs) {
		neighborlist = vertexs;
	}
	
	
	public List<Vertex> getNeigbor() {
		return neighborlist;
	}
}
