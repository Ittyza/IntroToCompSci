 /* 
Assignment number : 	2.2
File Name : 			Quadratic.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Quadratic {

	public static void main(String[] args) {
	
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double rad = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
		double x1 = ((-b + rad) / (2 * a));
		double x2 = ((-b - rad) / (2 * a));
		
		// Testing to find values for ax^2 + bx + c
		if (rad == 0) {
			System.out.println(x1);
		} else if (rad > 0) {
			System.out.println(x1);
			System.out.println(x2);
		} else {
			System.out.println("There are no solutions.");
		}
	}
}

