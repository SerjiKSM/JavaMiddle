package net.ukr.ksm;

public class Circle extends Figure{
	
	protected double radius;
		
	/**
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String getName () {
		return super.getName() + "Circle";
	}	
	
	@Override
	public double getSquare() {
		
		return (Math.pow(radius, 2) * Math.PI);
	}

	

}
