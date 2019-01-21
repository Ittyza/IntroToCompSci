/* 
Assignment number : 	3.3
File Name : 			Sumset.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Sumset {
	public static void main(String[] args) {
		
		int N = Integer.parseInt(args[0]);
		int[] array = new int[N];
		int m = Integer.parseInt(args[1]);
		int i = 0;
		
		System.out.print("Data: ");
		
		// Adding N amount of random numbers from 1 to m into an array.
		while (i < N) {
			int ranNum = (int) (Math.random() * m + 1);
			System.out.print(ranNum + " ");
			array[i] = ranNum;
			i++;
		}
		System.out.println();
		
		// Searching all possible combinations of numbers for a sumset.
		// Needed to ensure I wasn't considering the same number twice in the 
		// same execution.
		for (int j = 0; j < N - 2; j++) {
			
			for (int k = j + 1; k < N - 1; k++) {
			
				for (int l = k + 1; l < N; l++) {
					int a = array[j];
					int b = array[k];
					int c = array[l];
					
					// Printing the sumset in the correct order.
					if (a + b == c || a + c == b || c + b == a) {
						int d = Math.min(a, Math.min(b, c));
						int e = Math.max(a, Math.max(b, c));
						System.out.println(d + " + " + (e - d) + " = " + e);
						System.exit(0);
					}
				}
			}
		}
		System.out.println ("No sumes were found.");
	}
}