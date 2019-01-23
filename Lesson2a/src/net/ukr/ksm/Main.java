package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		
		Vector2D vector2D = new Vector2D(14, 3);
		Vector3D vector3D = new Vector3D(1, 2, 3);
		
		
		System.out.println(vector2D.getPlane_x());
		
		vector2D = vector3D;
		
		System.out.println(vector2D.getPlane_x());

	}

}
