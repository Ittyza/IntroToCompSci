/* 
Assignment number : 	1.4
File Name : 					MaxDistance.java
Name (First Last) :			Itamar Chuvali
Student ID : 					200048734
Email : 							itamar.chuvali@post.idc.ac.il 
*/

public class MaxDistance {

	public static void main(String[] args){
	
		// This names each x and y value of each coordinate
		
		double x1 = Double.parseDouble (args[0]);
		double x2 = Double.parseDouble (args[1]);
		double x3 = Double.parseDouble (args[2]);
		double y1 = Double.parseDouble (args[3]);
		double y2 = Double.parseDouble (args[4]);
		double y3 = Double.parseDouble (args[5]);
		
		// This is essentially the length of the side of the triangle
		
		double ab = Math.sqrt(Math.pow(x1 - x2, 2) + (Math.pow(y1 - y2, 2)));
		double bc = Math.sqrt(Math.pow(x2 - x3, 2) + (Math.pow(y2 - y3, 2)));
		double ca = Math.sqrt(Math.pow(x3 - x1, 2) + (Math.pow(y3 - y1, 2)));
		
		// This isolates the longest distance and prints it out 
		
		double max = Math.max(ab, (Math.max(bc, ca)));
		System.out.println (max);
		
	}
}
