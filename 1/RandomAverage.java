/* 
Assignment number : 	1.3
File Name : 					RandomAverage.java
Name (First Last) :			Itamar Chuvali
Student ID : 					200048734
Email : 							itamar.chuvali@post.idc.ac.il 
*/

public class RandomAverage {
	public static void main(String[] args) {
		
		// This names the two arguments
		
		int a = Integer.parseInt (args[0]);
		int b = Integer.parseInt (args[1]) + 1;
		
		// This generates two random numbers within the two arguments and also finds the average
		
		int ranA = (int) (Math.random() * (b-a)) + a;
		int ranB = (int) (Math.random() * (b-a)) + a;
		double average = (ranA + ranB) / 2.00;

		System.out.println ();
		System.out.println ("Generated: " + ranA + "  "+ ranB);
		System.out.println ("Average is " + average);
	}

}
