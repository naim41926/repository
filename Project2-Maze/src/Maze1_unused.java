//import java.util.ArrayList;
//
//public class Maze1 {
//
//
//	public Maze1() {
//		// TODO Auto-generated constructor stub
//	}
//
//
//	public static void main(String[]args) {
//		int start = 2,finish = 3,rowindex=9, colindex=6;
//		int[][] MazeArray = new int[rowindex][colindex];
//
//		for (int i = 0; i < rowindex; i++) {
//			//			System.out.println("i:" + (i));
//			//System.out.print("------------------------------\n");
//			for (int j = 0; j < colindex; j++) {
//				//	int a = (Integer) null;
//				//				System.out.println(MazeArray[i][j]);
//				//				System.out.println(i +","+ j );
//				//				System.out.println("\n");
//				MazeArray[i][j] = 0;
//				//	int[i].MazeArray = 0;
//				//	int[j].j= 0;
//				//	System.out.print((i+1) +","+ (j+1) + " = " + MazeArray[i][j] +" \t");
//				System.out.print("[" + MazeArray[i][j] +"]" /* = || (" + (i+1) +","+ (j+1) + ") "*/ );
//			}
//			System.out.print("\n");
//
////			for (int j = 0; j < colindex; j++) {
////				System.out.print("(" + (i+1) +","+ (j+1) + ")");}
//
//			//			if (i = 0) 
//			//			{
//			//				if (j = 5) {
//			//					MazeArray[i][j] = 1;
//			//				}
//			//			}
//		}
//		for (int i = 0; i < rowindex; i++) {
//		for (int j = 0; j < colindex; j++) {
//			System.out.print("(" + (i+1) +","+ (j+1) + ")");}
//		System.out.println("");
//		}
//		MazeArray[0][4] = 1;
//		MazeArray[1][4] = 1;
//		MazeArray[1][3] = 1;
//		MazeArray[2][2] = 1;
//
//		MazeArray[3][2] = 1;
//		MazeArray[4][2] = 1;
//		MazeArray[4][1] = 1;
//		MazeArray[5][1] = 1;
//
//		MazeArray[6][2] = 1;
//		MazeArray[6][3] = 1;
//		MazeArray[7][4] = 1;
//		MazeArray[8][4] = 1;
//		MazeArray[8][5] = 1;
//
//		MazeArray[0][4] = start;
//		MazeArray[8][5] = finish;
//
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < 6; j++) {
//				//	int a = (Integer) null;
//				//				System.out.println(MazeArray[i][j]);
//				//				System.out.println("j:"+(j+1));
//				//				System.out.println("\n");
//				//				MazeArray[i][j] = 0;
//				//	int[i].MazeArray = 0;
//				//	int[j].j= 0;
//				System.out.print(/*"[" + (i+1) +","+ (j+1) + "] = */"[" + MazeArray[i][j] +"]");
//				//				findRoot();
//			} 
//			System.out.println("");
//
//			//			if (i = 0) 
//			//			{
//			//				if (j = 5) {
//			//					MazeArray[i][j] = 1;
//			//				}
//			//			}
//
//		}
//
//		System.out.println("------------------------------\n"+MazeArray[1][1]);
//
//		//		(1,5) -> (2,5) -> (2,4) -> (3,3) -> (4,3) -> (5,3) -> (5,2) -> (6,2) 
//		//		 
//		//		(7,3) -> (7,4) -> (8,5) -> (9,5) -> (9,6)
//
//		//		multiple parameter array
//
//		//		(converter)
//
//
//
//
//		MazeSolver m = new MazeSolver(MazeArray,start,finish);
//		m.out();
//	}
//
//	//	private static void findRoot() {
//	//		// TODO Auto-generated method stub
//	//		for (int i = 0; i < 9; i++) {
//	//			for (int j = 0; j < 6; j++) {
//	//				if (MazeArray[i][j] = 2) {
//	//
//	//				}
//	//			}
//	//		}
//	//	}}
//
//
//}