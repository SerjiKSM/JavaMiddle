package net.ukr.ksm;

import java.util.concurrent.atomic.AtomicInteger;

public class TestThread extends Thread {
	private AtomicInteger c;
	
	/**
	 * @param c
	 */
	public TestThread(AtomicInteger c) {
		this.c = c;
	}

	public void run(){
		int x = c.getAndIncrement();
		System.out.println(x);
	}

	public static void main(String[] args) {

		AtomicInteger c = new AtomicInteger();
		TestThread t;
		for (int i = 0; i < 10; i++) {
			t = new TestThread(c);
			t.start();	
		}

	}

}
