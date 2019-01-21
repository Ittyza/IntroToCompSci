/* 
Assignment number : 	2.3
File Name : 			Amicable.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Amicable {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int sum1 = 1;
		int sum2 = 1;
		String s1 = "";
		String s2 = "";

		// Finding the sum of the first number's dividers
		for (int i = 2; i < n1; i++) {			
			
			if (n1 % i == 0) {				
				sum1 += i;
				s1 = s1 + "+" + i;
			}
		}
		
		// Finding the sum of the second number's dividers
		for (int i = 2; i < n2; i++) {			
		
			if (n2 % i == 0) {
				sum2 += i;
				s2 = s2 + "+" + i;
			}
		}
		
		if (sum1 == n2 && sum2 == n1) {
			System.out.println (n1 + " and " + n2 + 
			" are amicable numbers since");
			System.out.println (n1 + "=1" + s2);
			System.out.println (n2 + "=1" + s1);
		} else {
			System.out.println(n1 + " and " + n2 + " are not amicable numbers");
		}
	}
}
