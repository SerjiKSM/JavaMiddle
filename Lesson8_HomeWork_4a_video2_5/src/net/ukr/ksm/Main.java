/* Sozdat potok, kotoruy sozdast 50 potokov kazduy iz kotorux vuvedet na ekran svoy nomer
 * i dozdetsa poka yogo prirvyt. Preruvanie dochernix potokow dolzno vupolnyatsa iz 
 * potoka ix porozdayyshchego
 */

package net.ukr.ksm;

import java.util.ArrayList;

public class Main {

	// odun iz 50-ti potokov
	private static class SecondThread extends Thread {
		private int n;

		public SecondThread(int n) {
			this.n = n;
		}

		public void run() {
			// vuvodim svoy nomer
			System.out.println(n);

			while (!isInterrupted()) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					break;
				}
			}

			System.out.println(n + " thread interrupted!");
		}
	}

	// potok kotoruy porodit 50 dochernix potokov
	private static class FirstThread extends Thread {

		// spisok porozdennux potokov
		ArrayList<SecondThread> list = new ArrayList<SecondThread>();

		public void run() {
			SecondThread st;

			// sozdaem 50 potokov i skladuvaem ssulki na nix v spisok
			for (int i = 0; i < 50; i++) {
				st = new SecondThread(i);
				list.add(st);

				st.start();
			}

			while (!isInterrupted()) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					break;
				}
			}

			// preruvaem nashi 50 dochernix potoka
			for (SecondThread s : list)
				s.interrupt();
		}
	}

	public static void main(String[] args) {
		FirstThread ft = new FirstThread();
		ft.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}

		ft.interrupt();
	}

}
