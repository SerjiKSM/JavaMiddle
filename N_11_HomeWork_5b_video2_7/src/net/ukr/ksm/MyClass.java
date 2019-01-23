package net.ukr.ksm;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyClass {

	private static class MyEvents implements IFileEvents {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		public void onFileChanged(String path) {

			System.out.println("File was changed "
					+ sdf.format(new Date(Long.parseLong(path))));
		}

		public void onFileAdded(String path) {

			System.out.println("File was added "
					+ sdf.format(new Date(Long.parseLong(path))));
		}
	}

	public static void main(String[] args) {
		Monitor m = new Monitor("d:\\test");
		m.setTimeout(5000);
		m.setEvents(new MyEvents());
		m.start();
	}
}