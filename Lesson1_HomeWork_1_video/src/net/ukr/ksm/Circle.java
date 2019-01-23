package net.ukr.ksm;

/**
 * @author Serhio
 *
 */
public class Circle {
	
	public static final String NAME = "Circle";
	
	private double radius;

	/**
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 *  Method Calculate the area
	 */
	public double square(){
		return Math.PI * Math.pow(radius, 2);
	}

}
