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

	@Override
	public int compareTo(Object another) {
		
		Circle h = (Circle) another; // Object another приводим к типу (Circle) another

		if (getSquare() < h.getSquare())
			return -1;
		else if (getSquare() == h.getSquare())
			return 0;
		else if (getSquare() > h.getSquare())
			return 1;
		else
			return 0;
	
	}
	
	

}
