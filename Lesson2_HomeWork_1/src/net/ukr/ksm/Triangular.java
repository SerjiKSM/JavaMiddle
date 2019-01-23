/**
 * 
 */
package net.ukr.ksm;

/**
 * @author Serhio
 *
 */
public class Triangular extends Shape {

	private Point a;
	private Point b;
	private Point c;
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public Triangular(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
		
	/**
	 * @return the a
	 */
	public Point getA() {
		return a;
	}

	/**
	 * @param a the a to set
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
	 * @param b the b to set
	 */
	public void setB(Point b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	public Point getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(Point c) {
		this.c = c;
	}

	@Override
	double Perimetr() {
		double ab = Math.sqrt(Math.pow(b.x - a.x, 2)+Math.pow(b.y - a.y, 2));
        double ac = Math.sqrt(Math.pow(c.x - a.x, 2)+Math.pow(c.y - a.y, 2));
        double bc = Math.sqrt(Math.pow(c.x - b.x, 2)+Math.pow(c.y - b.y, 2));
        double p = (ab + ac + bc);
        
        System.out.println("Perimeter = " + p);
		return p;
	}

	@Override
	double Area() {
		double s = ((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y)) / 2;
        System.out.print("Triangle with ");
        System.out.println("area = " + s);
		return s;
	}
	
}
