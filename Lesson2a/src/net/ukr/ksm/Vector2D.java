// Создадим суперкласс описывающий вектор на плоскости


package net.ukr.ksm;

public class Vector2D {
	
	public Vector2D(){
		
	}
	
	public Vector2D(double plane_x, double plane_y){
		setSize(plane_x, plane_y);
	}

	double plane_x;
	double plane_y;
	
	public void setSize(double plane_x, double plane_y){
		this.plane_x = plane_x;
		this.plane_y = plane_y;
	}

	/**
	 * @return the plane_x
	 */
	public double getPlane_x() {
		return plane_x;
	}

	/**
	 * @return the plane_y
	 */
	public double getPlane_y() {
		return plane_y;
	}
	
	
	//private double getLenght() {
	public double getLength() {
		return Math.sqrt(plane_x * plane_x + plane_y * plane_y);

	}

	/*
	public double getLength() {
		// TODO Auto-generated method stub
		return 0;
	}
	*/

}
