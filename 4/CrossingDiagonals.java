/* 
Assignment number : 	4.2
File Name : 			CrossingDiagonals.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class CrossingDiagonals {
	public static void main(String[] args) {
		
		int n = StdIn.readInt();
		int[][] array = new int[n][n];
		
		// Creating the array with the input added into each location
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				array[i][j] = StdIn.readInt();
			}		
		}
		int endNum = 0;
		int i = 0;
		int j = 0;
		int z = 1;
		
		// This is the beginning of a list of demands the movement of the code
		// needs to check. The code checks from the left border, down and right,
		// and then from the right border, down and left. At the end, if the 
		// diagonals cross, it prints true.
		
		for (i = 0; i < n - 1; i++) {
			int startNum = array[i][0];
			
			for (j = 0, z = 0; (i + z) < n; j++, z++) {
				
				if (startNum == array[i + z][j]) {
					
					if ((i + z) == n - 1) {
						endNum = j;
					
						for (i = 0; i < n - 1; i++) {
							int secNum = array[i][n - 1];
							
							for (j = n - 1, z = 0; (i + z) < n; j--, z++) {
								
								if (secNum == array[i + z][j]) {
									
									if ((i + z) == n - 1) {
									
										if (endNum >= j){
											StdOut.println("true");
											System.exit(0);
										}
									}
								}
							}
						}
					}								
				} else {
					break;
				}	
			}
		}
		StdOut.println("false");
	}
}