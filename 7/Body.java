/* 
Assignment number : 	7.2
File Name : 			Body.java
Name (First Last) :		Itamar Chuvali
Student ID : 			200048734
Email : 				itamar.chuvali@post.idc.ac.il 
*/

public class Body {
	
	final static double G = 6.67 * Math.pow(10,-11); 
	Vector location;	 // location vector of the body
	Vector velocity; 	 // velocity of the body
	double mass; 		 // mass of the body
	String pic;			 // filename of the body's image
	
	/**
	 * Standard Constructor for Body
	 * 
	 * @param loc the location vector of the body.
	 * @param v  the velocity vector of the body.
	 * @param mass  the mass of the body.
	 * @param pic  a filename for an image file containing an image of the body.
	 */
	public Body (Vector loc, Vector v, double mass, String pic){
		this.location = loc;
		this.velocity = v;
		this.mass = mass;
		this.pic = pic;
	}
	
	/**
	 * Calculates the distance between this body and another body.
	 * Calculation is done according to the Pythagorean theorem.
	 * 
	 * @param other - the body from which the distance is calculated
	 * @return The distance from this planet to other.
	 */
	public double distance (Body other){
		double xDistance = 
				this.location.getXcomponent() 
				- other.location.getXcomponent();
		double yDistance = 
				this.location.getYcomponent() 
				- other.location.getYcomponent();
		double distance = 
				Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
		
		return distance;
	}
	
	/**
	 * Calculates the gravitational force exerted by another body on this body.
	 * It then changes the current velocity vector according to the gravitational force
	 * With respect to a given time step.
	 * 
	 * It is assumed that the location of the other body is different than the location 
	 * of this body.
	 * 
	 * Calculation is done in several steps:
	 * - Calculate the distance between the bodies.
	 * - Calculate the gravitational force according to Newton's law of universal gravitation.
	 * - Calculate the partial accelerations in the x axis and the y axis.
	 * - Update the velocity vector of this body according to Newton's laws of motion.
	 * 
	 * @param other - the body who exerts a gravitational pull on this body.
	 * @param dt(delta t) - the time step.
	 */
	public void GravitaionalPull(Body other, double dt) {
		
		double dist = distance(other);
		double gravForce = (this.mass * other.mass * G) / 
						   (Math.pow(dist, 2)) ;
		double forceX = (gravForce * (other.location.getXcomponent() 
				- this.location.getXcomponent()) / dist);
		double forceY = (gravForce * (other.location.getYcomponent() 
				- this.location.getYcomponent()) / dist);
		double accelX = forceX / this.mass;
		double accelY = forceY / this.mass;
		Vector newVel = new Vector
						(this.velocity.getXcomponent() + 
						(dt * accelX), 
						this.velocity.getYcomponent() + 
						(dt * accelY));
		this.velocity = newVel;
	}
	

	/**
	 * Updates the current location of the body according to the current velocity vector.
	 * Calculation is done according to Newton's law of motion with a given time step.
	 * 
	 * @param dt(delta t) - the time step
	 */
	public void move(double dt) {
		Vector newLoc = new Vector(this.location.getXcomponent() + 
				(dt * this.velocity.getXcomponent()), 
				this.location.getYcomponent() + 
				(dt * this.velocity.getYcomponent()));
		this.location = newLoc;
	}
	
	/**
	 * Draws the picture (Using StdDraw.picture) associated to the 
	 * body at the body's location.
	 * 
	 * In case the image file containing the image does not exist, 
	 * this function will instead draw a filled yellow circle of radius 25000000000.0
	 * at the body's location.
	 * 
	 * Use StdDraw.setPenColor(StdDraw.Yellow) to change the pen's color to yellow.
	 * And StdDraw.filledCircle to draw a circle.
	 * 
	 * Hint: StdDraw.picture throws an IllegalArgumentException if the image file does not exist.
	 * 
	 */
	public void draw() {
		try{
		StdDraw.picture(this.location.getXcomponent(), 
				this.location.getYcomponent(), this.pic);
		}
		catch (IllegalArgumentException e) {
			StdDraw.setPenColor(StdDraw.YELLOW);
			StdDraw.filledCircle(this.location.getXcomponent(), 
				this.location.getYcomponent(), 25000000000.0);
		}
	}
	
	/**
	 * Returns a string representation of the body.
	 * A string representing a body needs to be in the exact same format 
	 * as the line representing the body in the input files.
	 * 
	 */
	public String toString(){
		return "(" + location + ", " + velocity 
				+ ", " + mass + ", " + pic + ")";
	} 
}
