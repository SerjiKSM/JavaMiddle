package net.ukr.ksm;

import java.util.concurrent.atomic.AtomicInteger;

public class TestThread extends Thread {

	private AtomicInteger c;

	public TestThread(AtomicInteger c) {
		this.c = c;
	}

	public void run() {
		int x = c.getAndIncrement();
		System.out.println(Thread.currentThread().getName() + " 	 " + x);
	}

}
