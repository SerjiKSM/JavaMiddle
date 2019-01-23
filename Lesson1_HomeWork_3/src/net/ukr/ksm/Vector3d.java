package net.ukr.ksm;

/**
 * @author Serhio
 *
 */
public class Vector3d {
	
	private double x;
	private double y;
	private double z;
	
	/**
	 * @param x
	 * @param y
	 * @param z
	 */
	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the z
	 */
	public double getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(double z) {
		this.z = z;
	}
	

	public Vector3d summa(Vector3d v2) {
		double newx = this.getX() + v2.getX();
		double newy = this.getY() + v2.getY();
		double newz = this.getZ() + v2.getZ();
		
		Vector3d v3 = new Vector3d(newx, newy, newz);
		return v3;
	}

	public double skal(Vector3d v2) {
		double sk = this.getX() * v2.getX() + this.getY() * v2.getY()
				+ this.getZ() * v2.getZ();

		return sk;

	}

	public Vector3d vect(Vector3d v2) {
		double newx = this.getY() * v2.getZ() - this.getZ() * v2.getY();
		double newy = this.getZ() * v2.getX() - this.getX() * v2.getZ();
		double newz = this.getX() * v2.getY() - this.getY() * v2.getX();
		
		Vector3d v3 = new Vector3d(newx, newy, newz);
		return v3;

	}

	public void print() {
		System.out.println("(" + this.getX() + ", " + this.getY() + ", "
				+ this.getZ() + ")");
	}
	
}
