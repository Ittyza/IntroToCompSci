/* 
Assignment number : 	5.4
File Name : 			BlurToNoEdges.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class BlurToNoEdges {
	
	/**
	 * Greyscales, outlines and blurs an image
	 * 
	 * @param args - the image and execution count variable
	 */
	public static void main(String[] args) {
		
		String filename = (args[0]);
		int n = Integer.parseInt(args[1]);
		int[][][] source = ImageEditing.read(filename);

		for (int i = 0; i <= n; i++) {
			ImageEditing.show(ImageEditing.edges(source));
			  source = ImageEditing.blur(source);
					
		}
	} 
}