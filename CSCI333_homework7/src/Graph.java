import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 * @author Lake Smith
 * takes the inputed matrix then create an array of nodes then traverses them
 *	
 */
public class Graph {
	
	private int n;
	private int time;
	private boolean[][] edges;
	Node[] nodes;
	
	/**
	 * Constructor for the class
	 * takes in a 2d matrix node then create a 1d array of type nodes
	 * @param edge
	 */
	public Graph(boolean[][] edge) {
		this.edges = edge;
		this.n = edge.length;
		this.nodes = new Node[this.n];
		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = new Node(i);
		}
	}
	
	/**
	 * traverses through all the nodes in the graph once to initialize the data
	 * then traverses again calling instances of dsfVisit in order to find the 
	 * best path
	 */
	public void depthFirstSearch() {
		Node u = null;
		for (int i = 0; i < nodes.length; i ++) {
			u = nodes[i];
			u.setColor(0);
			u.setParent(-1);
		}
		this.time = 0;
		for (int i = 0; i < nodes.length; i ++) {
			u = nodes[i];
			if(u.getColor() == 0) {
				dfsVisit(u);
			}
		}
	}
	
	/**
	 * Recursively traverses through the data, and mark the times
	 * dTime is the time the method changed the vertex to grey
	 * fTime is the time the method changed the vertex to black
	 * @param u is the vertex being passed in
	 */
	private void dfsVisit(Node u) {
		this.time++;
		u.setdTime(time);
		u.setColor(1);
		for(int i = 0; i < nodes.length; i++) {
			if(edges[u.getName()][i] == true) {
				Node v = nodes[i];
				if(v.getColor() == 0) {
					v.setParent(u.getName());
					dfsVisit(v);
				}
			}
		}
		u.setColor(2);
		this.time++;
		u.setfTime(this.time);
	}
	
	/**
	 * loops through the data to find the best path from any given point
	 * to the source
	 * @param s is the source
	 */
	public void breathFirstSearch(int s) {
		Node u = null;
		Node S = nodes[s];
		for(int i = S.getName() + 1; i < nodes.length; i++) {
			u = nodes[i];
			u.setColor(0);
			u.setDist((int)Double.POSITIVE_INFINITY);
			u.setParent(-1);
		}
		S.setColor(1);
		S.setDist(0);
		S.setParent(-1);
		
		Queue<Node> Q = new LinkedList();
		Q.add(S);
		while(Q.size() != 0) {
			u = Q.peek();
			Q.remove();
			u.setColor(2);
			for(int i = 0; i < nodes.length; i++) {
				if(edges[u.getName()][i] == true) {
					Node v = nodes[i];
							if(v.getColor() == 0) {
								v.setColor(1);
								int num = u.getDist();
								v.setDist(num+1);
								v.setParent(u.getName());
								Q.add(v);
							}
				}
					
			}
		}
	}
	
	/**
	 * sets a string equal to the adjacency matrix and the data for each node
	 * then returns the String
	 */
	public String toString() {
		String ret = "";
		for(int i = 0; i < edges.length; i++) {
			for(int j = 0; j < edges.length; j++) {
				if(edges[i][j] == true) {
					ret = ret + " 1,";
				}else {
					ret = ret + " 0,";
				}
			}
			ret = ret + "\n";
		}
		ret = ret + "\n";
		for(int i = 0; i < nodes.length; i++) {
			Node u = nodes[i];
			ret = ret + u.toString() + "\n";
		}
		
		return ret;
	}
	
	
	

}











