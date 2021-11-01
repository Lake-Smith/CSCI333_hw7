
public class Graph {
	
	private int n;
	private int time;
	private boolean[][] edges;
	Node[] nodes;
	
	public Graph(boolean[][] edge) {
		this.edges = edge;
		this.n = edge.length;
		
	}
	
	public void depthFirstSearch() {
		Node u = null;
		for (int i = 0; i < nodes.length; i ++) {
			u = nodes[i];
			u.setColor(0);
			u.setParent(0);
		}
		this.time = 0;
		for (int i = 0; i < nodes.length; i ++) {
			u = nodes[i];
			if(u.getColor() == 0) {
				dfsVisit(u);
			}
		}
	}

	private void dfsVisit(Node u) {
		this.time++;
		u.setParent(u.getName());
		u.setColor(1);
		for(int i )
	}

}
