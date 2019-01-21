 /* 
Assignment number : 	2.1
File Name : 			Triangle.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Triangle {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		
		// A triangle's sides are all less than the sum of the two others
		boolean isTriangle = ((x + y) > z && (x + z) > y && (y + z) > x);
		
		System.out.println (isTriangle);
	}
}