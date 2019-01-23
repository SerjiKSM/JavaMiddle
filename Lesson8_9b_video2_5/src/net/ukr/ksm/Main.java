// Cinhronization threads

package net.ukr.ksm;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Conteiner c = new Conteiner();

		TestThread t;

		for (int i = 0; i < 10; i++) {
			t = new TestThread(c);
			t.start();
		}

		Thread.sleep(5000);
		System.out.println(c.x + " , " + c.y);

	}

	public static class Conteiner {

		public int x = 0;
		public int y = 0;

		public synchronized void inc(){
			x++;
			y++;
		}
	}

	public static class TestThread extends Thread {
		private Conteiner c;

		public TestThread(Conteiner c) {
			this.c = c;
		}

		public void run() {
			try {
				Thread.sleep(System.currentTimeMillis() % 100);

			} catch (InterruptedException e) {

			}
			
			c.inc();

		}
	}

}
