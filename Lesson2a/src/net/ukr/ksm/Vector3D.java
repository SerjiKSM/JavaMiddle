package net.ukr.ksm;

public class Vector3D extends Vector2D {

	public Vector3D(double plane_x, double plane_y, double plane_z){
		
		super(plane_x, plane_y);   // Использование констректора суперкласса
		
		setSize(plane_x, plane_y, plane_z);
	}
	
	/**
	 * @return the plane_z
	 */
	public double getPlane_z() {
		return plane_z;
	}

	double plane_z;
	
	public void setSize(double plane_x, double plane_y, double plane_z){
		this.plane_x = plane_x;
		this.plane_y = plane_y;
		this.plane_z = plane_z;
	}
	
	/*
	 * @Override  -   Аннотация  Переопределенный метод
	 */
	
	@Override
	public double getLength(){
		return Math.sqrt(plane_x * plane_x + plane_y * plane_y + plane_z * plane_z); 
	}
		
}
