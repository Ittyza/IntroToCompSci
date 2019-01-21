/* 
Assignment number : 	4.3
File Name : 			Knights.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Knights {
	public static void main(String[] args) {
	
		int n = StdIn.readInt();
		int[][] board = new int[n + 4][n + 4];
		
		// Creating the board
		for (int i = 2; i < n + 2; i++) {		
			for (int j = 2; j < n + 2; j++) {
				board[i][j] = StdIn.readInt();
				StdOut.print(board[i][j] + " ");
			}
			StdOut.println();	
		}
		int i = 0;
		int j = 0;
		
		// This index positions the knight at each coordinate
		for (i = 2; i < n + 2; i++) {
			for (j = 2; j < n + 2; j++) { 
				
				// A placeholder for the potential "surrounding digit"
				int temp = 0;

				// These are the positions on which the knight may land
				int pos1 = board[i - 2][j - 1];
				int pos2 = board[i - 2][j + 1];
				int pos3 = board[i - 1][j + 2];
				int pos4 = board[i + 1][j + 2];
				int pos5 = board[i + 2][j + 1];
				int pos6 = board[i + 2][j - 1];
				int pos7 = board[i + 1][j - 2];
				int pos8 = board[i - 1][j - 2];
				
				// Ensuring all the valid positions match
				if (pos1 > 0 && temp == 0) {
					temp = pos1;
				}
				if (pos2 > 0 && pos2 != temp && temp > 0) {
					continue;
				} else if (pos2 > 0 && temp == 0) {
						temp = pos2;
				}
				if (pos3 > 0 && pos3 != temp && temp > 0) {
					continue;
				} else if (pos3 > 0 && temp == 0) {
						temp = pos3;
				}
				if (pos4 > 0 && pos4 != temp && temp > 0) {
					continue;
				} else if (pos4 > 0 && temp == 0) {
						temp = pos4;
				}
				if (pos5 > 0 && pos5 != temp && temp > 0) {
					continue;
				} else if (pos5 > 0 && temp == 0) {
						temp = pos5;
				}
				if (pos6 > 0 && pos6 != temp && temp > 0) {
					continue;
				} else if (pos6 > 0 && temp == 0) {
						temp = pos6;
				}
				if (pos7 > 0 && pos7 != temp && temp > 0) {
					continue;
				} else if (pos7 > 0 && temp == 0) {
						temp = pos7;
				}
				if (pos8 > 0 && pos8 != temp && temp > 0) {
					continue;
				} else if (pos8 > 0 && temp == 0) {
						temp = pos8;
				}
				
				// Prints out the surrounding number whilst ensuring its not 0
				if (Math.max(pos1, Math.max(pos3, Math.max(pos5, pos7))) == 0) {
					continue;
				} else {
				StdOut.println("A Knight at location (" + (i - 2) + "," + 
				(j - 2) + ") is surrounded by the number " + 
				Math.max(pos1, Math.max(pos3, Math.max(pos5, pos7))));	
				System.exit(0);
				}
			}	
		}
		StdOut.println("No location found");
	}
}