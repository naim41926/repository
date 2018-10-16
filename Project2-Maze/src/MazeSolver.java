//Naim Hopkins
//10/13
//Algorithmic Thinking
//Purpose: the process for solving the maze
//Q: How to put initial array adjacent to array of coordinate value

public class MazeSolver {
	private int[][] maze;
	private boolean[][] visited;
	private int startR, startC;


	public MazeSolver(int[][] maze,  int startR, int startC) {
		this.maze = maze;
		this.visited = new boolean[maze.length][maze.length];
		this.startR = startR;
		this.startC = startC;
	}

	public void out() {
		try {
			dfs(startR,startC);
			System.out.println("No way out");
		} catch (RuntimeException e) {

			System.out.println("Map Traversal Completed");
		}
	}

	private void dfs(int row, int col) {
		int endrow= this.maze.length-1;
		int endcol =this.maze[col].length-1;
		int lastAcceptableR = row;
		int lastAcceptableC = col;
		//This line indicates where the algorithm's next check is
		System.out.print("Visiting (" +(row)+","+(col)+") = "+ maze[row][col]
				//+" visited yet? "+ visited[row][col] +""
				+ " \n");

		//if the row and column of the array match the destination indicator then throw exception
		if(this.maze[row][col] == 3){
			System.out.println("Destination (" +(row)+","+(col)+") has been reached");
			for (int i = 0; i < maze.length; i++) 
			{
				for (int j = 0; j < maze[col].length; j++) 
				{
					//System.out.print("[" + maze[i][j] +"] " + i+j +" "+ row + ","+ col /* = || (" + (i+1) +","+ (j+1) + ") "*/);
					if ( i == row && j == col ) {
						System.out.print("(X) "/* + "Currently positioned at ("+ row + ","+ col + ") -> " /* = || (" + (i+1) +","+ (j+1) + ") "*/);
					} else {
						System.out.print("[" + maze[i][j] +"] " /*+ i +","+ j +" "+ row + ","+ col /* = || (" + (i+1) +","+ (j+1) + ") "*/);
					} 


					//	System.out.print("[" + maze[i][j] +"]  " /*+ i +","+ j +" "+ row + ","+ col /* = || (" + (i+1) +","+ (j+1) + ") "*/);

				}
				System.out.print("\n");// this creates the new line
			}
			throw new RuntimeException();

		}


		else if(visited[row][col]) {
			System.out.println("(this move is unacceptable \"checked already\"\r\n" + 
					"			: " + row + col );
			return;
		} 

		else if (this.maze[row][col] == 0) {
			System.out.println("(blocked by wall)" +(row)+","+(col)+"\n" );

		//	System.out.println("@" + lastAcceptableR + "," + lastAcceptableC+ "->\n");
			return;
		}  

		//--------------------
		else if (row < 0 || row > 8) {
			System.out.println("(boundaries have been exceeded) " +(row)+","+(col) );
			// the current state of the algorithm
		//	System.out.println("@" + lastAcceptableR + "," + lastAcceptableC+ "\n");

			return;
		} 
		//----------------------------

		else if (row == 8) {
			System.out.println("(boundaries have been reached, but acceptable )" +(row)+","+(col)+ "\n" );
			//
			//System.out.println("@" + lastAcceptableR + "," + lastAcceptableC);

			for (int i = 0; i < maze.length; i++) 
			{
				for (int j = 0; j < maze[col].length; j++) 
				{
					//System.out.print("[" + maze[i][j] +"] " + i+j +" "+ row + ","+ col /* = || (" + (i+1) +","+ (j+1) + ") "*/);
					if ( i == row && j == col ) {
						System.out.print("(X) "/* + "Currently positioned at ("+ row + ","+ col + ") -> " /* = || (" + (i+1) +","+ (j+1) + ") "*/);
					} else {
						System.out.print("[" + maze[i][j] +"] " /*+ i +","+ j +" "+ row + ","+ col /* = || (" + (i+1) +","+ (j+1) + ") "*/);
					} 


					//	System.out.print("[" + maze[i][j] +"]  " /*+ i +","+ j +" "+ row + ","+ col /* = || (" + (i+1) +","+ (j+1) + ") "*/);

				}
				System.out.print("\n");// this creates the new line
			}

			System.out.println("@" + lastAcceptableR + "," + lastAcceptableC);

			return;
		} 
		else if (col < 0 || col >= 5) {
			System.out.println("(boundaries have been exceeded) " +(row)+","+(col) );
			// the current state of the algorithm
			//System.out.println("@" + lastAcceptableR + "," + lastAcceptableC+ "\n");

			return;
		}
		else {
			System.out.println("Acceptable choice found, changing position to " +(row)+","+(col)+ "\n" );


			this.visited[row][col] = true;

			for (int i = 0; i < maze.length; i++) 
			{
				for (int j = 0; j < maze[col].length; j++) 
				{
					//System.out.print("[" + maze[i][j] +"] " + i+j +" "+ row + ","+ col /* = || (" + (i+1) +","+ (j+1) + ") "*/);
					if ( i == row && j == col ) {
						System.out.print("(X) "/* + "Currently positioned at ("+ row + ","+ col + ") -> " /* = || (" + (i+1) +","+ (j+1) + ") "*/);
					} else {
						System.out.print("[" + maze[i][j] +"] " /*+ i +","+ j +" "+ row + ","+ col /* = || (" + (i+1) +","+ (j+1) + ") "*/);
					} 


					//	System.out.print("[" + maze[i][j] +"]  " /*+ i +","+ j +" "+ row + ","+ col /* = || (" + (i+1) +","+ (j+1) + ") "*/);

				}
				System.out.print("\n");// this creates the new line
			}
			//System.out.println("-----------------------");
			System.out.println("\nYes" + lastAcceptableR + "," + lastAcceptableC);
			//			System.out.println("\nAcceptable choice found, changing position to " + row + col );
			//			
		} 

		dfs(row+1,col);
		dfs(row+1,col-1);
		dfs(row+1,col+1);
		dfs(row,col-1);
		dfs(row,col+1);	
	}
}
