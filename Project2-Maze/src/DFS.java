import java.util.List;

public class DFS {

	public void DFS(List<Vertex> vList) {
		
		for (Vertex v : vList) {
			if(!v.isVisited()) {
				v.setVisited(true);
				dfs(v);
			}
		}
	}
	
	private void dfs(Vertex v) {
		System.out.println(v + " ");
		
		for (Vertex v1 : v.getNeigbor()) {
			if(!v1.isVisited()) {
				v1.setVisited(true);
				dfs(v1);
			}
		}
	}

}
