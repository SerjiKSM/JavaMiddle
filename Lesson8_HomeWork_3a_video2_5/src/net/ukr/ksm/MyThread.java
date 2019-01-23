package net.ukr.ksm;

import java.text.DateFormat;
import java.util.Date;

public class MyThread extends Thread {

	@Override
	public void run() {

		System.out.println(getId() + " started");

		while (!isInterrupted()) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(getId() + " interrupted");
				return;
			}
		}
	}
}
