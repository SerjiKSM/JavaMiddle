package net.ukr.ksm;

public class Rectangle implements Cloneable {
	double a;
	double b;
	/**
	 * @param a
	 * @param b
	 */
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public Rectangle clone() {
		try {
			return (Rectangle) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
