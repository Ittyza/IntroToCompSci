/* 
Assignment number : 	3.2
File Name : 			Sequences.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Sequences {
	public static void main(String[] args) {

		int[] array = new int[args.length];
		int count = (args.length);
		int a = 0;
		int b = 0;
		int c = 0;
		
		// Creating integers within the array
		for (int i = 0; i < count; i++) {
			array[i] = Integer.parseInt(args[i]);
		}
		
		// This checks the first number for a possible sequence and advances it
		int i = -1;
		while (i < count - 2) {
			i++;
			
			// This checks for all possible sequences from an incrementing base
			for(int j = 1; i + (2 * j) < count; j++) {
				int posA = i;
				int posB = i + j;
				int posC = i + 2 * j;
				a = array[posA];
				b = array[posB];
				c = array[posC];

				if (b - a == c - b) {
					System.out.println("The numbers " + a + ", " + b + ", " + c 
					+ ", located at indices " + posA + ", " + posB + ", " + posC
					+ ", form an arithmetic sequence.");
					System.exit(0);
				}
			}
		}
		System.out.println("There is no arithmetic sequence of length 3.");	
	}
}
		