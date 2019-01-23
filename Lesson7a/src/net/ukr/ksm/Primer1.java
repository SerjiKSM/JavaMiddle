package net.ukr.ksm;

public class Primer1 implements Runnable {

	Factorial fact;
	Thread t;
	
	/**
	 * 
	 */
	public Primer1(Factorial fact) {
		t = new Thread(this);
		t.start();
		this.fact = fact;
	}

	@Override
	public void run() {
		fact.facCalculate();
	}
	
}
