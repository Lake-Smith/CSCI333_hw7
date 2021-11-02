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
	 * 
	 * @param u
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
	 * 
	 * @param s
	 */
	
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











