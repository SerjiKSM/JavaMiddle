package net.ukr.ksm;

import java.text.DateFormat;
import java.util.Date;

public class TestThread extends Thread {

	@Override
	public void run() {

		while (!isInterrupted()) {

			DateFormat df = DateFormat.getDateInstance();
			System.out.println(getId() + " : " + df.format(new Date()));
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				return;
			}
		}
	}
}
