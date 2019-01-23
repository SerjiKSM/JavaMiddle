package net.ukr.ksm;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) {

		AtomicInteger c = new AtomicInteger();
		TestThread t;
		for (int i = 0; i < 10; i++) {
			t = new TestThread(c);
			t.start();
		}

	}

}
