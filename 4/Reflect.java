/* 
Assignment number : 	4.1
File Name : 			Reflect.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Reflect {
	public static void main(String[] args) {
		
		int n = StdIn.readInt();
		int[][] array = new int[n][n];
		
		// Creating the array with the input added into each location
		for (int i = 0; i < n; i++) {
		
			for (int j = 0; j < n; j++) {
				array[i][j] = StdIn.readInt();
			}		
		}
		
		// Printing the array backwards
		for (int i = n - 1; i >= 0; i--) {
			
			for (int j = 0; j < n; j++) {
				StdOut.print(array[i][j] + " ");
			}
			StdOut.println();
		}
	}
}