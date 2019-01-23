package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		
		Vector3d v1 = new Vector3d(2, 3, 4);
		Vector3d v2 = new Vector3d(1, 2, 3);
		Vector3d v3 = new Vector3d(0, 0, 0);
		v3 = v1.summa(v2);
		v3.print();
		System.out.println(v1.skal(v2));
		v3 = v1.vect(v2);
		v3.print();

	}

}
