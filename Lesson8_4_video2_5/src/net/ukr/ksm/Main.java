// start many threads 

package net.ukr.ksm;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		try {
			Counter c = new Counter();
			c.start();
			//c.join(); // zdyom zavershenia potoca
			System.out.println("Thread finished");
		} catch (Exception e) {
			;
		}

	}

	public static class Counter extends Thread {

		public void run() {
			int x = 1;
			while (x < 1000) {
				System.out.println(x++);
			}
		}

	}

}
