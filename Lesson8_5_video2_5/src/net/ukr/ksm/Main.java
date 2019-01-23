
package net.ukr.ksm;

public class Main {
	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() { // anonimnuy class
					public void run() {
						int x = 0;
						while (x < 1000)
							System.out.println(x++);
					}
				});

		t.start();
	}
}
