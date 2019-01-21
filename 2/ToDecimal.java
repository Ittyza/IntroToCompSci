/* 
Assignment number : 	2.4
File Name : 			ToDecimal.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class ToDecimal {
	public static void main(String[] args) {
		
		// Ensuring there is an argument
		if (args.length == 1) {
			
		String str = (args[0]);
		int total = str.length();
		int sum = 0;
		int i = 1;
		
			//Ensuring the string is more than 0 characters
			if (total > 0){
				while (i < total + 1){
					
					// Adding the values and checking for valid input
					if (str.charAt(i-1) == '1'){
						sum = sum + (int) Math.pow(2, total-(i));
					} else if (str.charAt(i-1) == '0'){
					} else {
						System.out.println("illegal input");
						System.exit (0);
					}
					i++;
				}
			} else {
				System.out.println("illegal input");
				System.exit (0);
			}
			
			// Prints the sum
			System.out.println(sum);
			
		} else {
			System.out.println("illegal input");
			System.exit (0);
		}
		
	}
}