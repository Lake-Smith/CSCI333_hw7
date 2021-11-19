
public class Main {
	
	/**
	 * runs different instances of graphs with different matrixes 
	 * then runs depth first search on each then prints for the results
	 * and then runs breath first search on 3 more and prints the results
	 * @param args
	 */
	public static void main(String[] args) {
		
	//======================================< BFS >=======================================\\
	    	//                    1      2       3      4      5      6
/* 1 */		boolean bfs1[][] = {{false, true,  false, false, true,  false},
/* 2 */						    {true,  false, true,  true,  false, true},
/* 3 */						    {false, true,  false, false, true,  false},
/* 4 */						    {false, true,  false, false, true,  false},
/* 5 */						    {true,  false, true,  true,  false, true},
/* 6 */						    {false, true,  false, false, true,  false}};
		Graph BFS1 = new Graph(bfs1);
		BFS1.breathFirstSearch(0);
		System.out.println("BFS1:\n");
		System.out.println(BFS1.toString());
		
    		//                    1      2       3      4      5      6
/* 1 */		boolean bfs2[][] = {{false, true,  false, false, false, false},
/* 2 */						    {true, false,  true,  true,  false, false},
/* 3 */						    {false, true,  false, false, true,  false},
/* 4 */						    {false, true,  false, false, true,  false},
/* 5 */						    {false, false, true,  true,  false, true},
/* 6 */						    {false, false, false, false, true,  false}};
		Graph BFS2 = new Graph(bfs2);
		BFS2.breathFirstSearch(0);
		System.out.println("BFS2:\n");
		System.out.println(BFS2.toString());
		
		
    		//                    1      2       3      4      5      6
/* 1 */		boolean bfs3[][] = {{false, true,  false, false, false, true},
/* 2 */						    {true,  false, true,  true,  false, false},
/* 3 */						    {false, true,  false, false, true,  false},
/* 4 */						    {false, true,  false, false, true,  false},
/* 5 */						    {false, false, true,  true,  false, true},
/* 6 */						    {true,  false, false, false, true,  false}};
		Graph BFS3 = new Graph(bfs3);
		BFS3.breathFirstSearch(0);
		System.out.println("BFS3:\n");
		System.out.println(BFS3.toString());
		
		/*
		boolean bfs4[][] = {{false, true, true, false, true, false, false, false},
							{true, false, false, true, true, false, true, false},
							{true, false, false, false, false, false, false, true},
							{false, true, false, false, false, false, true, false},
							{true, true, false, false, false, true, false, false},
							{false, false, false, false, true, false, false, false},
							{false, true, false, true, false, false, false, false},
							{false, false, true, false, false, false, false, false}};
		Graph BFS4 = new Graph(bfs4);
		BFS4.depthFirstSearch();
		System.out.println("BFS4:\n");
		System.out.println(BFS4.toString());
		*/
		//===================================< DFS >========================================\\
		
		boolean dfs1[][] = {{false, true, true, false, false, false},
			    			{true, false, false, true, false, false},
			    			{true, false, false, false, true, false},
			    			{false, true, false, false, false, true},
			    			{false, false, true, false, false, true},
			    			{false, false, false, true, true, false}};
		Graph DFS1 = new Graph(dfs1);
		DFS1.depthFirstSearch();
		System.out.println("DFS1:\n");
		System.out.println(DFS1.toString());
		
		
		boolean dfs2[][] = {{false, true, true, false, false, false},
							{true, false, true, true, false, false},
							{true, true, false, false, true, false},
							{false, true, false, false, true, true},
							{false, false, true, true, false, true},
							{false, false, false, true, true, false}};
		Graph DFS2 = new Graph(dfs2);
		DFS2.depthFirstSearch();
		System.out.println("DFS2:\n");
		System.out.println(DFS2.toString());
	
		
		boolean dfs3[][] = {{false, true, true, false, false, false},
							{true, false, false, true, true, false},
							{true, false, false, true, true, false},
							{false, true, true, false, false, true},
							{false, true, true, false, false, true},
							{false, false, false, true, true, false}};
		Graph DFS3 = new Graph(dfs3);
		DFS3.depthFirstSearch();
		System.out.println("DFS3:\n");
		System.out.println(DFS3.toString());
		
		
	}

}
