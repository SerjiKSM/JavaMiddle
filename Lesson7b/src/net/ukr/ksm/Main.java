package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		Factorial fact = new Factorial();
		Primer2 a = new Primer2(fact);
		Primer2 b = new Primer2(fact);
		Primer2 c = new Primer2(fact);
		try {
			a.t.join();
			b.t.join();
			c.t.join();
		} catch (InterruptedException e) {
			System.out.println("ERROR");
		}
		
	}

}
