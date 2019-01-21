/* 
Assignment number : 	6.4
File Name : 			Sierpinski.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Sierpinski {
	public static void main (String args[]){
		int n = Integer.parseInt(args[0]);
		sierpinski(n);
	}
	
	public static void sierpinski(int n) {
		doIt(n, 0, 0, 1);
	}
	
	/**
	 * Executes the recursive drawing of triangles
	 * 
	 * @param n - the depth of recursion
	 * @param x - the x coordinate
	 * @param y - the y coordinate
	 * @param size - the variable that decreases the size in each step
	 */
	public static void doIt(int n, double x, double y, double size) {
		if (n == 0) {
			return;
		}
		
		// Draws the triangle
		StdDraw.line(x, y, x + size, y);
		StdDraw.line(x + size, y, 
					 x + (size / 2), y + size * (Math.sqrt(3.0 / 4)));
		StdDraw.line(x + (size / 2), y + size * (Math.sqrt(3.0 / 4)), x, y);
		
		size = size / 2;
		
		// Creates defines the starting points for the next 3 triangles
		doIt(n-1, x, y, size);
		doIt(n-1, x + size, y, size);
		doIt(n-1, x + (size / 2), y + (Math.sqrt(3.0 / 4) * size), size);
	}
}