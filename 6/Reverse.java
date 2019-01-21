/* 
Assignment number : 	6.2
File Name : 			Reverse.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Reverse {

	public static void main(String args[]) {
		String word = args[0];
		reverse(word);
	}
	
	/**
	 * Receives a string and reverses the character order with recursion
	 * 
	 * @param s - String to be reversed
	 */
	public static void reverse(String s) {
		if (s.length() == 0) {
			return;
		} else {
			reverse(s.substring(1));
			StdOut.print(s.substring(0, 1));
		}
	}
}
