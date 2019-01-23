/* Sozdat 100 potokov, kazduy iz kotoruh vuvedet na ekran svoy nomer i dozdyetsa poka ego prervyt
 * 
 */

package net.ukr.ksm;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<MyThread> list = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			MyThread thr = new MyThread();
			thr.start();
			list.add(thr);
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (MyThread myThread : list) {
			myThread.interrupt();
		}
	}

}
