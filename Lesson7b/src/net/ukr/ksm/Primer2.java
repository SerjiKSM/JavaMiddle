package net.ukr.ksm;

public class Primer2 implements Runnable {

	Primer2(Factorial fact) {
		t = new Thread(this);
		t.start();
		this.fact = fact;
	}

	Factorial fact;
	Thread t;

	@Override
	public void run() {

		synchronized (fact) {
			fact.facCalculate();
		}

	}

}
