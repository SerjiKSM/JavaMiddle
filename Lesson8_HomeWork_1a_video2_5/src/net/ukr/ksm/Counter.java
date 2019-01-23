package net.ukr.ksm;

public class Counter extends Thread {

	private int x = 0;
	private int y = 0;

	public Counter(int beg, int end) {
		x = beg;
		y = end;
	}

	@Override
	public void run() {
		while (!isInterrupted()) {
			for (int i = x; i < y; i++) {
				System.out.println("Now i is: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					return;
				}
			}
		}
	}
}
