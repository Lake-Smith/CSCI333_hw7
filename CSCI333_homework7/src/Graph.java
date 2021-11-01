import java.util.LinkedList;
import java.util.Queue;

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
		for(int i = u.getName(); i < nodes.length; i++) {
			Node v = nodes[i];
			if(v.getColor() == 0) {
				v.setParent(u.getName());
				dfsVisit(v);
			}
		}
		u.setColor(2);
		this.time++;
		u.setfTime(this.time);
	}
	
	public void breathFirstSearch(Node s) {
		Node u = null;
		for(int i = s.getName() + 1; i < nodes.length; i++) {
			u = nodes[i];
			u.setColor(0);
			u.setDist((int)Double.POSITIVE_INFINITY);
			u.setParent(-1);
		}
		s.setColor(1);
		s.setDist(0);
		s.setParent(-1);
		
		Queue<Node> Q = new LinkedList();
		Q.add(s);
		while(Q.size() != 0) {
			Q.remove(u);
			u.setColor(2);
			for() {
				if(v.getColor == 0) {
					v.setColor(1);
					v.setDist(u.getDist + 1);
					v.setParent(u.getName());
					Q.add(v);
				}
			}
		}
	}
	
	
	
	

}











