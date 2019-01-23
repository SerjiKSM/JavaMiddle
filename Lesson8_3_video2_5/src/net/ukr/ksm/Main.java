// start many threads 

package net.ukr.ksm;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		try {
			ThreadGroup tg = new ThreadGroup("my");

			for (int i = 0; i < 10; i++) {
				Counter c = new Counter(tg, "Thread - " + i);
				c.start();
			}

			tg.interrupt();

		} catch (Exception e) {
			;
		}

	}

	public static class Counter extends Thread {
		public Counter(ThreadGroup tg, String string) {
			// TODO Auto-generated constructor stub
		}

		public void run() {
			int x = 1;
			while (!isInterrupted()) { // yslovie zavershenia potoka ¹ 1
				System.out.println(getId() + ": " + x++);
				try {
					Thread.sleep(1000);
					// Thread.yield(); // ili tak
				} catch (InterruptedException e) {
					return; // yslovie zavershenia potoka ¹ 2
				}
			}
		}

	}

}
