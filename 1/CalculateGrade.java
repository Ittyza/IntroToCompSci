/* 
Assignment number : 	1.1
File Name : 					CalculateGrade.java
Name (First Last) :			Itamar Chuvali
Student ID : 					200048734
Email : 							itamar.chuvali@post.idc.ac.il 
*/

public class CalculateGrade {

	public static void main(String[] args) {

		String name = args[0];
		String idNum = args[1] ;
		double finScore = (Integer.parseInt(args[2]) * 0.25);	
		System.out.println (name + ", " + idNum + ", has a final score of " +  finScore);
	}
}
