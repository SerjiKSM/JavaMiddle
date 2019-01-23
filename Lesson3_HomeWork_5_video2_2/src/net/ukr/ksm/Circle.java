package net.ukr.ksm;

public class Circle extends Figures {
	
	double radius;

	/**
	 * @param radius
	 */
	public Circle(String name, double radius) {
		super();
		this.radius = radius;
		this.name = name;
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

	@Override
	public double getSquare() {
		
		return Math.PI * (Math.pow(radius, 2));
	}
	
	

}
