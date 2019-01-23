package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		// Пример полиморфизма в переопределенных методах
		
		
		/*
		 * Multiplay ml = new Multiplay(); 
		 * System.out.println(ml.mul(1.2, 2.4, 3.5));
		 * System.out.println(ml.mul(1, 2, 3));
		 * System.out.println(ml.mul("ab", "cd", "ef"));
		 */

		Multiplay ml = new Multiplay();
		Multiplay2 ml2 = new Multiplay2();
	
		System.out.println((ml instanceof Multiplay2));
		
		System.out.println(ml.mul(2.0, 3.0, 4.0));
		System.out.println(ml2.mul(2.0, 3.0, 4.0));
		ml = new Multiplay2();
		System.out.println(ml.mul(2.0, 3.0, 4.0));
		
		System.out.println((ml instanceof Multiplay2));
	}

}
