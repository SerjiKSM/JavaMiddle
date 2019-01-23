// Thread 

package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		try {
			Counter c = new Counter();
			c.start(); // start thread
			Thread.sleep(5000); // wait 5 sec
			c.interrupt(); // preruvanie potoka
		} catch (Exception e) {
			;
		}

	}

	public static class Counter extends Thread {
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
