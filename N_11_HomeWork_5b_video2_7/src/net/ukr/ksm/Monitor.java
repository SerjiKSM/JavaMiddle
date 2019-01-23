package net.ukr.ksm;

import java.lang.InterruptedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.io.*;

public class Monitor {

	private String path;
	private int timeout;
	private LinkedList<Long> prev = new LinkedList<Long>();
	private LinkedList<Long> curr = new LinkedList<Long>();
	private IFileEvents events;

	public Monitor(String path) {
		this.path = path;
		createArray(prev);
	}

	public void start() {
		while (true) {
			createArray(curr);
			compareArrays(prev, curr);
			prev.clear();
			prev.addAll(curr);

			System.out.println("Waiting...");
			try {
				Thread.sleep(timeout);
			} catch (InterruptedException ex) {
				return;
			}
		}
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int value) {
		timeout = value;
	}

	public IFileEvents getEvents() {
		return events;
	}

	public void setEvents(IFileEvents value) {
		events = value;
	}

	private void doFileChanged(String path) {
		if (events != null)
			events.onFileChanged(path);
	}

	private void doFileAdded(String path) {
		if (events != null)
			events.onFileAdded(path);
	}

	private void compareArrays(LinkedList<Long> m1, LinkedList<Long> m2) {
		File file = new File(path);
		File[] list = file.listFiles();

		Iterator<Long> it = m1.iterator();
		Long date;

		while (it.hasNext()) {
			date = it.next();
			if (!m2.contains(date)) {
				doFileChanged(date.toString());
				return;
			}
		}

		it = m2.iterator();
		while (it.hasNext()) {
			date = it.next();
			if (!m1.contains(date)) {
				doFileAdded(date.toString());
			}
		}
	}

	private void createArray(LinkedList<Long> output) {
		File file = new File(path);
		File[] list = file.listFiles();

		output.clear();
		for (File f : list) {
			output.add(f.lastModified());
		}
	}
}
