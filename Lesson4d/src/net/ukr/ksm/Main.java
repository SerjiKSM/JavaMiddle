package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(4,5);
		Rectangle b = new Rectangle(4,5);
		Rectangle c = a.clone();
		
		a.a = 3;

		System.out.println(a.a);
		System.out.println(c.a);
	}

}
