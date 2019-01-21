/* 
Assignment number : 	5.2
File Name : 			BasicEditor.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class BasicEditor {
	
	/**
	 * A class that executes one of three different functions
	 * 
	 * @param args - the image and function
	 */
	public static void main (String[] args){

		String filename = (args[0]);
		String mode = (args[1]);
		int[][][] source = ImageEditing.read(filename);
		int[][][] newPic = new int[0][0][0];
		
		if (mode.equals("fh")) {
			newPic = ImageEditing.flipHorizontally(source);
		}
		else if (mode.equals("fv")) {
			newPic = ImageEditing.flipVertically(source);
		}
		else if (mode.equals("gr")) {
			newPic = ImageEditing.greyScale(source);
		}
		else {
			StdOut.println("Unrecognised mode, please retry");
			System.exit(0);
		}
		ImageEditing.show(newPic);
		ImageEditing.display(newPic);
		System.exit(0);
	}
}