/* 
Assignment number : 	2.5b
File Name : 			SheshBeshStats.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class SheshBeshStats {
	public static void main(String[] args) {
		
		int T = Integer.parseInt(args[0]);
		int count = 0;
		int i = 0;
		double sum = 0;
		
		// The amount of SheshBesh's rolled
		for (int tries = 0; tries < T; tries++) {
		
			// Rolling to find SheshBesh
			while (i >= 0) {
				i++;
				int dice1 = (int)(Math.random() * 6 + 1);
				int dice2 = (int)(Math.random() * 6 + 1);
				
				if (dice1 + dice2 == 11) {
					break;
				}
				count++;
			}
		sum = tries + count;
		}
		System.out.println (sum / T);
	}
}