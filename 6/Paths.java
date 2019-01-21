/* 
Assignment number : 	6.3
File Name : 			Paths.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Paths {

	public static void main (String args[]) {
		int n = Integer.parseInt(args[0]);
		StdOut.print(efficientPaths(n));
	}
	
	public static long efficientPaths(int n) {
	    if (n == 1) {
	        return 0;
	    }
	    return paths(n, 0, 0, new long[n+1][n+1]);
	}
	
	/**
	 * Creates paths using recursion and outputs the total number of paths
	 * 
	 * @param n - dimensions of the square
	 * @param row - row indicator
	 * @param column - column indicator
	 * @param memory - array for storing info
	 * @return - returns a result per cell
	 */
	public static long paths(int n, int row, int column, long[][] memory) {
		long result = memory[row][column];
		if (result == 0) {
			if (row < column && column < n) {
				result = paths(n, row + 1, column, memory) + 
						paths(n, row, column + 1, memory);
			} else if (row < column) {
				result = paths(n, row + 1, column, memory);
			} else if (column < n) {
				result = paths(n, row, column + 1, memory);
			} else {
				result = 1;
			memory[row][column] = result;
			}
		}
		return result;
	}
}
