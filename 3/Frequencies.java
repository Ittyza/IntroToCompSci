/* 
Assignment number : 	3.4
File Name : 			Frequencies.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Frequencies {
	public static void main(String[] args) {
		
		String text = args[0];
		int charNum = text.length();
		char[] letters = text.toCharArray();
		char star = 42; // Asterix
		
		// Index for the letters
		for (int i = 0; i < 26; i++) {
			char key1 = (char)(97 + i); // Small a
			char key2 = (char)(65 + i); // Capital A
			
			// Prints the letter and sets counter to 0
			System.out.print(key1 + ":");
			int counter = 0;
			
			// Checks all the characters of the text and increments counter
			for (int k = 0; k < charNum; k++) {
			
				if (letters[k] == 'a' + i || letters[k] == 'A' + i){
				
					counter++;
					System.out.print(star);
				}
			}
			System.out.println();
		}
	}
}