import java.util.ArrayList;

public class Maze {

	public static void main(String[]args) {
		int start = 2,finish = 3,rowindex=9, colindex=6;
		int startR = 0, startC = 0;
		int[][] MazeArray = new int[rowindex][colindex];

		for (int i = 0; i < rowindex; i++) 
		{
			for (int j = 0; j < colindex; j++) 
			{
				MazeArray[i][j] = 0;
				System.out.print("[" + MazeArray[i][j] +"]" /* = || (" + (i+1) +","+ (j+1) + ") "*/ );
			}
			System.out.print("\n");// this creates the new line
		}
		System.out.println("-----------------------");

		for (int i = 0; i < rowindex; i++) 
		{
			for (int j = 0; j < colindex; j++) 
			{
				System.out.print("|(" + (i) +","+ (j) + ")");
			}
			System.out.println("");
		}
		System.out.println("-----------------------");


		MazeArray[0][4] = 1;
		MazeArray[1][4] = 1;
		MazeArray[1][3] = 1;
		MazeArray[2][2] = 1;
		MazeArray[3][2] = 1;
		MazeArray[4][2] = 1;
		MazeArray[4][1] = 1;
		MazeArray[5][1] = 1;
		MazeArray[6][2] = 1;
		MazeArray[6][3] = 1;
		MazeArray[7][4] = 1;
		MazeArray[8][4] = 1;
		MazeArray[8][5] = 1;

		MazeArray[0][4] = start;
		MazeArray[8][5] = finish;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("[" + MazeArray[i][j] +"] ");
				if(MazeArray[i][j] == 2) {
					startR = i;
					startC = j;
				}
			} 
			System.out.println("");
		}

		System.out.println("------------------------------\n");

		//		(0,4) -> (1,4) -> (1,3) -> 
		// 		(2,2) -> (3,2) -> (4,2) -> (4,1) -> (5,1) 
		//		(6,2) -> (6,3) -> (7,4) -> (8,4) -> (8,5)

		//		multiple parameter array

		//		(converter)

		MazeSolver m = new MazeSolver(MazeArray,startR,startC);
		m.out();
		System.out.println("Finish");
	}
}