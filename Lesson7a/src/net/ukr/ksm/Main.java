package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		/*
		Factorial factorial = new Factorial();
		factorial.facCalculate();
		*/
		
		Factorial fact = new Factorial();
		Primer1 a = new Primer1(fact);
		Primer1 b = new Primer1(fact);
		Primer1 c = new Primer1(fact);
		try {
			a.t.join();
			b.t.join();
			c.t.join();
		} catch (InterruptedException e) {
			System.out.println("ERROR");
		}
		
	}

}
