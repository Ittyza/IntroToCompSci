/* 
Assignment number : 	7.1
File Name : 			Nbody.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Nbody {

	public static void main(String args[]) {
		
		// No. of times the sim will run
		int times = Integer.parseInt(args[0]); 
		
		// Each step's seconds
		double duration = Double.parseDouble(args[1]); 
		
		// The text-file with information
		String filename = args[2]; 
		
		StdIn.setInput(filename);
		
		int N = StdIn.readInt();
		double R = StdIn.readDouble();
		Body[] allBods = new Body[N];
		
		
		// Creates planets and sun and places their info into an array
		for (int i = 0; i < N; i++) {
			Vector loc = new Vector (StdIn.readDouble(), StdIn.readDouble());
			Vector vel = new Vector (StdIn.readDouble(), StdIn.readDouble());
			double mass = StdIn.readDouble();
			String pic = StdIn.readString();
		
			allBods[i] = new Body(loc, vel, mass, pic);
		}	
		
		// Draws the background and executes the animation of the bodies
		for (int k = 0; k <= times; k++) {
			StdDraw.show(5);
			StdDraw.setScale(-R, R);
			StdDraw.picture(0, 0, "starfield.jpg");	
			
			for (int i = 0; i < N; i++) {
				allBods[i].move(duration);
				allBods[i].draw();
				
				for (int j = 0; j < allBods.length; j++) {
					if (j != i){
						allBods[i].GravitaionalPull(allBods[j], duration);		
					}
				}	
			}
		}
		for (int i = 0; i < allBods.length; i++) {
			StdOut.println(allBods[i]);
		}
	}
}
