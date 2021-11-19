/**
 * 
 * @author Lake Smith
 * A nodes class to handle all of the data for eacch instance of node in the graph
 *
 */
public class Node {
	
	private int parent;
	private int dTime;
	private int fTime;
	private int dist;
	private int color;
	private int name;
	
	public Node(int name) {
		super();
		this.name = name;
		this.parent = -1;
		this.dTime = 0;
		this.fTime = 0;
		this.dist = Integer.MIN_VALUE;
		this.color = 0;
	}
	
	/**
	 * sets a string eqaul to a printable version of all the nodes data
	 * then returns the string
	 * 
	 */
	public String toString() {
		String color = "";
		if(this.color != 2) {
			if(this.color < 1) {
				color = "white";
			}else {
				color = "grey";
			}
		}else {
			color = "black";
		}
		String ret = "Name: " + (name + 1) + " Parent: " + (parent + 1) + " dTime: " + dTime + " fTime: " + fTime + " dist: " + dist + " It is " + color ;
		return ret;
		
	}
	/**
	 * getter for int name
	 * @return name
	 */
	public int getName() {
		return name;
	}
	
	
	/**
	 * getter for parent 
	 * @return parent
	 */
	public int getParent() {
		return parent;
	}
	/**
	 * changes the value of parent
	 * @param parent is what parens is changed to
	 */
	public void setParent(int parent) {
		this.parent = parent;
	}
	
	
	/**
	 * getter for dTime
	 * @return dTime
	 */
	public int getdTime() {
		return dTime;
	}
	/**
	 * sets the dTime variable to new value
	 * @param dTime that this.dTime is changed to
	 */
	public void setdTime(int dTime) {
		this.dTime = dTime;
	}
	
	
	/**
	 * getter for fTime
	 * @return fTime
	 */
	public int getfTime() {
		return fTime;
	}
	/**
	 * sets the fTime variable to new value
	 * @param fTime that this.fTime is changed to
	 */
	public void setfTime(int fTime) {
		this.fTime = fTime;
	}
	
	
	/**
	 * getter for Dist
	 * @return Dist
	 */
	public int getDist() {
		return dist;
	}
	/**
	 * sets the dist variable to new value
	 * @param dist that this.dist is changed to
	 */
	public void setDist(int dist) {
		this.dist = dist;
	}

	
	/**
	 * getter for the color variable
	 * @return color
	 */
	public int getColor() {
		return color;
	}
	/**
	 * sets the color variable to new value
	 * @param color that this.color is changed to
	 */
	public void setColor(int color) {
		this.color = color;
	}
	
}
