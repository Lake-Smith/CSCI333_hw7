
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
		String ret = "Name: " + name + "/nParent: " + parent + "/ndTime: " + dTime + "/nfTime: " + fTime + "/ndist: " + dist + "/nIt is " + color ;
		return ret;
		
	}
	
	public int getName() {
		return name;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getdTime() {
		return dTime;
	}

	public void setdTime(int dTime) {
		this.dTime = dTime;
	}

	public int getfTime() {
		return fTime;
	}

	public void setfTime(int fTime) {
		this.fTime = fTime;
	}

	public int getDist() {
		return dist;
	}

	public void setDist(int dist) {
		this.dist = dist;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
}
