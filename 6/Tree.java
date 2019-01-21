/* 
Assignment number : 	6.5
File Name : 			Tree.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Tree {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		tree(n);
	}	
	public static void tree(int n) {
	
		double[] xLeft = {0.45, 0.55, 0.55, 0.45};
		double[] yLeft = {0, 0, 0.1, 0.1};
		
		double[] xTemp = {0.45, 0.55, 0.55, 0.45};
		double[] yTemp = {0, 0, 0.1, 0.1};
		
		makeTree(n, xLeft, yLeft, xTemp, yTemp);
	
	}
	
	public static void makeTree(int n, double[] xLeft, double[] yLeft, 
									   double[] xTemp, double[] yTemp) {
		if (n == 0) {
			return;
		}
		
		double[] xRight = new double[4];
		double[] yRight = new double[4];
		
		double[] xTemp2 = new double[4];
		double[] yTemp2 = new double[4];
		
		StdDraw.filledPolygon(xLeft, yLeft);
		
		xLeft[0] = xTemp[3];
		xLeft[1] = (3 * xTemp[3] + 3 * xTemp[2] - xTemp[0] - xTemp[1]) / 4;
		xLeft[2] = 2 * xTemp[3] - xTemp[0];
		xLeft[3] = (3 * xTemp[3] - xTemp[1]) / 2;
		
		yLeft[0] = yTemp[3];
		yLeft[1] = (3 * yTemp[3] + 3 * yTemp[2] - yTemp[0] - yTemp[1]) / 4;
		yLeft[2] = 2 * yTemp[3] - yTemp[0];
		yLeft[3] = (3 * yTemp[3] - yTemp[1]) / 2;

		
		xRight[0] = xLeft[1];
		xRight[1] = xTemp[2];
		xRight[2] = 2 * xLeft[1] - xLeft[3];
		xRight[3] = 2 * xTemp[2] - xTemp[1];
		
		yRight[0] = yLeft[1];
		yRight[1] = yTemp[2];
		yRight[2] = 2 * yLeft[1] - yLeft[3];
		yRight[3] = 2 * yTemp[2] - yTemp[1];
	
		xTemp[0] = xLeft[0];
		xTemp[1] = xLeft[1];
		xTemp[2] = xLeft[2];
		xTemp[3] = xLeft[3];
		
		yTemp[0] = yLeft[0];
		yTemp[1] = yLeft[1];
		yTemp[2] = yLeft[2];
		yTemp[3] = yLeft[3];
		
		xTemp2[0] = xRight[0];
		xTemp2[1] = xRight[1];
		xTemp2[2] = xRight[2];
		xTemp2[3] = xRight[3];
		
		yTemp2[0] = yRight[0];
		yTemp2[1] = yRight[1];
		yTemp2[2] = yRight[2];
		yTemp2[3] = yRight[3];
		
/*		for (int i = 0; i < 4; i++) {
			xTemp[i] = xLeft[i];
			yTemp[i] = yLeft[i];
			copyX2[i] = xRight[i];
			copyY2[i] = yRight[i];
		}*/
		
		makeTree(n - 1, xLeft, yLeft, xTemp, yTemp);
		makeTree(n - 1, xRight, yRight, xTemp2, yTemp2);
		
	}
}
