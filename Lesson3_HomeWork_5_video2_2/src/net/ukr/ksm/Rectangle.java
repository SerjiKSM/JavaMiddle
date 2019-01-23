package net.ukr.ksm;

public class Rectangle extends Figures {

	private double a;
	private double b;
	/**
	 * @param a
	 * @param b
	 */
	public Rectangle(String name, double a, double b) {
		super();
		this.a = a;
		this.b = b;
		this.name = name;
	}
	/**
	 * @return the a
	 */
	public double getSideA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setSideA(double a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public double getSideB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setSideB(double b) {
		this.b = b;
	}
	
	@Override
	public double getSquare() {
		
		return  a * b;
	}
	
	
		
}
