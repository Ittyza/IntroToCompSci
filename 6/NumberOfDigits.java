/* 
Assignment number : 	6.1
File Name : 			NumberOfDigits.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class NumberOfDigits {

	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		StdOut.print(numberOfDigits(number));
	}
	
	/**
	 * Checks the number of digits in a given integer using recursion.
	 * 
	 * @param n - a given integer 
	 * @return returns the number of digits in that integer
	 */
	public static int numberOfDigits(int n) {
		if (n /10 == 0) {
			return 1;
		} else {
			return (1 + numberOfDigits(n / 10));	
		}
	}	
}
