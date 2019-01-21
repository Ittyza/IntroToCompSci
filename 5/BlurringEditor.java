/* 
Assignment number : 	5.3
File Name : 			BlurToNoEdges.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class BlurringEditor {
	
	/**
	 * Blurs an image given as a command line argument
	 * 
	 * @param args - the image and execution count variable
	 */
	public static void main(String[] args) {
		
		String filename = (args[0]);
		int T = Integer.parseInt(args[1]);
		int[][][] source = ImageEditing.read(filename);
		int[][][] blurredPic = source;
		for (int i = 0; i <= T; i++) {
			ImageEditing.blur(blurredPic);
			ImageEditing.show(blurredPic);
		}
	}
}
