/* 
Assignment number : 	2.5a
File Name : 			SheshBesh.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class SheshBesh {
	public static void main(String[] args) {

		int i = 0;
		
		// Rolls the dice until SB is rolled
		while (i >= 0) {
			i++;
			int dice1 = (int)(Math.random() * 6 + 1);
			int dice2 = (int)(Math.random() * 6 + 1);
			
			if (dice1 + dice2 == 11) {
				System.out.println("Shesh-Besh appears..." +
				" it took " + i + " tries.");
				break;
			}
		}
	}
}