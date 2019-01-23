// Cinhronization threads

package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		Conteiner c = new Conteiner();

		TestThread t;

		for (int i = 0; i < 10; i++) {
			t = new TestThread(c);
			t.start();
		}

	}

	public static class Conteiner {

		public volatile int x = 0; // dlya primitivnux i ssulochnux tipov

	}

	public static class TestThread extends Thread {
		private Conteiner c;

		public TestThread(Conteiner c) {
			this.c = c;
		}

		public void run() {
			c.x = (int) getId();
		}

	}
}