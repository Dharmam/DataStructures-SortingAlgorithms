package dharmam.Assignment4_Graphs;

public class GraphsDFS {

	static int adjancy_matrix[][];
	final static int number_of_vertices = 12;
	static vertexstate vertex_state[];
	private static void dfs() {
		vertex_state = new vertexstate[number_of_vertices];
		for(int i = 0 ; i< number_of_vertices; i++)
		{
			vertex_state[i] = vertexstate.not_visited;
		}
		System.out.print("DFS Result");
		for(int i = 0 ; i <number_of_vertices ; i++)
		{
			rundfs(i);
		}
	}
	private static void rundfs( int i )
	{
		if(	vertex_state[i] == vertexstate.not_visited)
		{
			vertex_state[i] = vertexstate.visiting;

			for(int j = 0 ; j< number_of_vertices ; j++)
			{
				if(vertex_state[j] == vertexstate.not_visited && isedge(i, j))
				{
					rundfs(j);
				}
			}
			System.out.print(" - "+ i);
			vertex_state[i] = vertexstate.visited;
		}
	}
	private static boolean isedge(int i, int j) {
		if(adjancy_matrix[i][j] == 1) return true;
		else return false;
	}
	public static void adjancymatrix( int Vertex_Nos) {

		int Vertex_No = Vertex_Nos;
		adjancy_matrix = new int[Vertex_No+1][Vertex_No+1];
	}
	private static void setedge(int from, int to) {
		adjancy_matrix[from][to] = 1;
}
	private static void representgraphmatrix() {
		System.out.println("Adjacency Matrix Of The Graph Used.");
		for (int i = 0; i < number_of_vertices; i++) 
		{
			if(i<10)System.out.print(i+ "  ");
			else System.out.print(i+ " ");
			for (int j = 0; j < number_of_vertices; j++)
			{ 
				System.out.print(adjancy_matrix[i][j]);
			} 
			System.out.println();
		}
	}
	public static void main(String[] args) {
		adjancymatrix(number_of_vertices);
		System.out.println("We would be using the ADJACENCY MATRIX representation.");
		System.out.println();
		System.out.println("REASONS -");
		System.out.println("1. - Here in our problem we just want to add elements and traverse them, which will need only setedge and hasedge methods.");
		System.out.println("     In this representation, the operations setedge, removeedge and hasedge just involve setting or reading the matrix entry a[i][j].");
		System.out.println("     Thus, O(n) for these operations case will be O(1).");
		System.out.println("2. - It has a simple implementation.");
		System.out.println("3. - For dense graphs the high memory utilization of n^2 is exceptable, here we have 12 vertex and 36 edges.");
		System.out.println();
		
		setedge(0,1);	setedge(0,4);	
		setedge(1,2);	setedge(1,6);	setedge(1,5);	setedge(1,0);
		setedge(2,3);	setedge(2,6);	setedge(2,1);
		setedge(3,7);	setedge(3,2);
		setedge(4,5);	setedge(4,8);	setedge(4,0);
		setedge(5,2);	setedge(5,6);	setedge(5,9);	setedge(5,4);	setedge(5,1);
		setedge(6,7);	setedge(6,10);  setedge(6,5);	setedge(6,2);
		setedge(7,11);	setedge(7,10);	setedge(7,6);
		setedge(8,9);	setedge(8,4);
		setedge(9,10);  setedge(9,8);   setedge(9,5);
		setedge(10,11); setedge(10,9);  setedge(10,6);
		setedge(11,10);	setedge(11,7);
		
		representgraphmatrix();
		System.out.println();
		dfs();

	}

}


