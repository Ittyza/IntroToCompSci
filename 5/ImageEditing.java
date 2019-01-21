/* 
Assignment number : 	5.1
File Name : 			ImageEditing.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class ImageEditing {

	/**
	 * Creates edge outlines from a greyscale image
	 * 
	 * @param image - the image that will be outlined
	 * @return edgePic - the outlined image
	 */
	public static int[][][] edges (int[][][] image) {
		int[][][] greyPic =	greyScale(image);
		int[][] greyCal = calculateGradient(greyPic);
		normalize(greyCal);
		
		int rows = greyCal.length;
		int columns = greyCal[0].length;
		
		int[][][] edgePic = new int[rows][columns][3];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				for (int k = 0; k < 3; k++){
					edgePic[i][j][k] = greyCal[i][j];
				}
			}
		}
		return edgePic;
	}
	
	/**
	 * Arranges greyscale values within the range [0, 255]
	 * 
	 * @param gradient - the gradiented image	 
	 */
	public static void normalize (int[][] gradient) {
		int rows = gradient.length;
		int columns = gradient[0].length;
		int min = 0;
		int max = 255;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (min > gradient[i][j]) {
					min = gradient[i][j];
				}
				if (max < gradient[i][j]) {
					max = gradient[i][j];
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (j == 0 || j == columns - 1) {
					gradient[i][j] = 0;
				} else {
					gradient[i][j] =(gradient[i][j] - min) * 255 / (max - min);
				}
			}
		}
	}
	
	/**
	 * Calculates the gradient from the pixels to the left and right of a point
	 * 
	 * @param image - the image that will be calculated
	 * @return gradCal - the calculated gradient
	 */
	public static int[][] calculateGradient (int[][][] image) {
		int rows = image.length;
		int columns = image[0].length;
		int[][] gradCal = new int[rows][columns];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (j == 0 || j == columns - 1) {
					gradCal[i][j] = 0;
				} else {
				gradCal[i][j] = image[i][j + 1][0] - image[i][j - 1][0];
				}
			}
		}
		return gradCal;
	}
	
	/**
	 * Creates the blurred effect on an image
	 * 
	 * @param source - the image that will be blurred
	 * @return blurredPic - the blurred image
	 */
	public static int[][][] blur(int[][][] source) {
		int rows = source.length;
		int columns = source[0].length;
		int[][][] blurredPic = source;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				
				int count = 0;
				int sumRed = 0;
				int sumGreen = 0;
				int sumBlue = 0;
				
				for (int k = i - 1; k <= (i + 1); k++) {
					for (int m = j - 1; m <= (j + 1); m++) {
						if (k >= 0 && k < rows && m >= 0 && m < columns) {
							count++;
							int red = source[k][m][0];
							int green = source[k][m][1];
							int blue = source[k][m][2];
							sumRed += red;
							sumGreen += green;
							sumBlue += blue;	
						} else {
							continue;
						}
					}
				}
				sumRed = sumRed / count;
				sumGreen = sumGreen / count;
				sumBlue = sumBlue / count;
				int[] pixel = {sumRed, sumGreen, sumBlue};
				blurredPic[i][j] = pixel;
			}
		}
	return blurredPic;	
	}
	
	/**
	 * Greyscales an image using the luminance function
	 * 
	 * @param source - the image that will be grescaled
	 * @return greyPic - the greyscale image
	 */
	public static int[][][] greyScale(int[][][] source) {
		int rows = source.length;
		int columns = source[0].length;
		int[][][] greyPic = new int[rows][columns][3];
		
		for (int rowCount = 0; rowCount < rows; rowCount++) {
			for (int colCount = 0; colCount < columns; colCount++) {
				greyPic[rowCount][colCount] = 
				luminance(source[rowCount][colCount]);
			}
		}
		return greyPic;
	}
	
	/**
	 * Greyscales a pixel
	 * 
	 * @param source - the pixel that will be greyscaled
	 * @return greyPix - a greyscaled pixel
	 */
	public static int[] luminance(int[] source) {
		int[] greyPix = new int[3];
		int lum = (int)((0.299 * source[0]) + (0.587 * source[1]) + 
		(0.114 * source[2]));
		
		for (int i = 0; i < 3; i++) {
			greyPix[i] = lum;
		}
		return greyPix;
	}
	
	/**
	 * Flips an image vertically
	 * 
	 * @param source - the image that will be flipped vertically
	 * @return picFlipV - the flipped image
	 */
	public static int[][][] flipVertically(int[][][] source) {
		int rows = source.length;
		int columns = source[0].length;
		int[][][] picFlipV = new int[rows][columns][3];
		
		for (int rowCount = 0; rowCount < rows; rowCount++) {
			for (int colCount = 0; colCount < columns; colCount++) {
				for (int RGB = 0; RGB < 3; RGB++) {
					picFlipV[rowCount][colCount][RGB] = 
					source[rows - rowCount - 1][colCount][RGB];
				}
			}
		}
		return picFlipV;
	}
	
	/** 
	 * Flips an image horizontally
	 * 
	 * @param source - the image that will be flipped horizontally
	 * @return - picFlipH - the flipped image
	 */
	public static int[][][] flipHorizontally(int[][][] source) {
		int rows = source.length;
		int columns = source[0].length;
		int[][][] picFlipH = new int[rows][columns][3];
		
		for (int rowCount = 0; rowCount < rows; rowCount++) {
			for (int colCount = 0; colCount < columns; colCount++) {
				for (int RGB = 0; RGB < 3; RGB ++) {
					picFlipH[rowCount][colCount][RGB] = 
					source[rowCount][columns - 1 - colCount][RGB];
				}	
			}
		}
		return picFlipH;
	}
	
	/**
	 * Displays the RGB values of a 3 dimensional array in console
	 * 
	 * @param source - the file to view
	 */
	public static void display(int[][][] source) {
		int rows = source.length;
		int columns = source[0].length;
	
		for (int rowCount = 0; rowCount < rows; rowCount++) {
			StdOut.println();
			for (int colCount = 0; colCount < columns; colCount++) {
				StdOut.printf("%4s", " ");
				for (int RGB = 0; RGB < 3; RGB ++) {
					StdOut.printf("%4d", source[rowCount][colCount][RGB]);
				}	
			}
		}
	}

	/**
	 * Reads the image and configures it's information
	 * 
	 * @param filename - the file to read
	 * @return pic - the read file
	 */
	public static int[][][] read(String filename) {
		StdIn.setInput(filename);
		StdIn.readLine();
		int columns = StdIn.readInt();
		int rows = StdIn.readInt();
		StdIn.readInt();
		int[][][] pic = new int[rows][columns][3];
	
		for (int rowCount = 0; rowCount < rows; rowCount++) {
			for (int colCount = 0; colCount < columns; colCount++) {
				for (int RGB = 0; RGB < 3; RGB ++) {
					pic[rowCount][colCount][RGB] = StdIn.readInt();
				}	
			}
		}
		return pic;
	}
	
	/**
	 * Renders an image using StdDraw. 
	 * The input array is assumed to contain integers in the range [0,255].
	 * With the third dimension being of size 3.
	 *
	 * @param pic - the image to show.
	 */
	public static void show(int[][][] pic){
		StdDraw.setCanvasSize(pic[0].length, pic.length);
		int height = pic.length;
		int width = pic[0].length;
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
		StdDraw.show(30);
		for (int i = 0; i < height; i++){
		    for (int j = 0; j < width; j++){
				StdDraw.setPenColor(pic[i][j][0], pic[i][j][1], pic[i][j][2] );
				StdDraw.filledRectangle(j + 0.5, height - i - 0.5, 0.5, 0.5);
		    }
		}
		StdDraw.show();
	}
}
