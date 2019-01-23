package net.ukr.ksm;

import java.io.File;
import java.io.IOException;

public class Monitor {

	String[] file;
	String dir;
	IFileEvent event;

	public Monitor(String[] file, String dir, IFileEvent event) {
		this.file = file;
		this.dir = dir;
		this.event = event;
	}

	public void start() {

		int counter;

		while (true) {

			counter = file.length;

			try {
				subfolderWatch(dir, file);
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			for (String s : file) {
				if (s == null)
					counter--;
			}

			if (counter == 0)
				break;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			System.out.println("Waiting...");
		}
	}

	public void subfolderWatch(String path, String[] searchFilesList)
			throws IOException {

		File dir = new File(path);
		File[] dirContents = dir.listFiles();

		for (File f : dirContents) {
			if (f.isFile()) {
				for (int i = 0; i < searchFilesList.length; i++) {
					if (f.getName().equals(searchFilesList[i]) && event != null) {
						searchFilesList[i] = null;
						event.onFileAdded(f.getCanonicalPath());
					}
				}
			} else if (f.isDirectory()) {
				subfolderWatch(f.getCanonicalPath(), searchFilesList);
			}
		}
	}

}
