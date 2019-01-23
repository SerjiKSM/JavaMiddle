package net.ukr.ksm;

public class Square extends Shape {

	private Point a;
	private Point b;
	private Point c;
	private Point d;

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
	 * @return the c
	 */
	public Point getC() {
		return c;
	}

	
	/**
	 * @param c
	 *            the c to set
	 */
	public void setC(Point c) {
		this.c = c;
	}

	
	/**
	 * @return the d
	 */
	public Point getD() {
		return d;
	}

	
	/**
	 * @param d
	 *            the d to set
	 */
	public void setD(Point d) {
		this.d = d;
	}

	
	/**
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	public Square(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	double Perimetr() {
		double cd = Math.sqrt(Math.pow(c.x-d.x, 2)+Math.pow(c.y-d.y, 2));
        double p = (cd*4);
        
        System.out.println("Perimeter = " + p);
        return p;
	}

	@Override
	double Area() {
		double ab = Math.sqrt(Math.pow(b.x-a.x, 2)+Math.pow(b.y-a.y, 2));
        double s = Math.pow(ab, 2);
        System.out.print("Square with ");
        System.out.println("area = " + s);
        return s;
	}

}
