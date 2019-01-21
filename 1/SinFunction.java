/* 
Assignment number : 	1.2
File Name : 					SinFunction.java
Name (First Last) :			Itamar Chuvali
Student ID : 					200048734
Email : 							itamar.chuvali@post.idc.ac.il 
*/

public class SinFunction {
	
	public static void main (String[] args){
		double pi = Math.PI;
		System.out.println ( "sin(0) 		= " + (Math.sin(0)));
		System.out.println ( "sin(1/4 PI) 	= " + Math.sin(0.25 * pi));
		System.out.println ( "sin(1/2 PI) 	= " + Math.sin(0.50 * pi));
		System.out.println ( "sin(3/4 PI) 	= " + Math.sin(0.75 * pi));
		System.out.println ( "sin(PI)		= " + Math.sin(1.00 * pi));
		System.out.println ( "sin(5/4 PI) 	= " + Math.sin(1.25 * pi));
		System.out.println ( "sin(3/2 PI) 	= " + Math.sin(0.50 * pi));
		System.out.println ( "sin(7/4 PI) 	= " + Math.sin(1.75 * pi));
		System.out.println ( "sin(2 PI) 	= " + Math.sin(2.00 * pi));
	}
}