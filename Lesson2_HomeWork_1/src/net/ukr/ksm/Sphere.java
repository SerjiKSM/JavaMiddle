package net.ukr.ksm;

public class Sphere extends Shape {

	private Point a;
	private Point b;

	/**
	 * @return the a
	 */
	public Point getA() {
		return a;
	}

	/**
	 * @param a
	 *            the a to set
	 */
	public void setA(Point a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public Point getB() {
		return b;
	}

	/**
	 * @param b
	 *            the b to set
	 */
	public void setB(Point b) {
		this.b = b;
	}

	/**
	 * @param a
	 * @param b
	 */
	public Sphere(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	double Perimetr() {
		double r = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
		double d = Math.PI * 2 * r;

		System.out.println("Circuit = " + d);
		return d;
	}

	@Override
	double Area() {
		double r = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
		double s = Math.PI * Math.pow(r, 2);
		System.out.print("Circle with ");
		System.out.println("area = " + s);
		return s;
	}

}
