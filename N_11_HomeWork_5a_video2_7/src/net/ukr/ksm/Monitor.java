package net.ukr.ksm;

import java.lang.InterruptedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.io.*;

public class Monitor {
	
	private String path;
	private int timeout;
	private LinkedList<String> prev = new LinkedList<String>();
	private LinkedList<Long> pdate = new LinkedList<Long>();
	private LinkedList<String> curr = new LinkedList<String>();
	private LinkedList<Long> cdate = new LinkedList<Long>();
	private IFileEvents events;

	public Monitor(String path) {
		this.path = path;
		createArray(prev, pdate);
	}

	public void start() {
		while (true) {
			createArray(curr, cdate);
			compareArrays(prev, pdate, curr, cdate);
			//prev.clear();
			//prev.addAll(curr);
			
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

	private void doFileAdded(String path) {
		if (events != null)
			events.onFileAdded(path);
	}

	private void doFileDeleted(String path) {
		if (events != null)
			events.onFileDeleted(path);
	}

	private void doFileModified(String path) {
		if (events != null)
			events.onFileModified(path);		
	}
	
	private void compareArrays(LinkedList<String> m1, LinkedList<Long> d1, LinkedList<String> m2, LinkedList<Long> d2) {
		Iterator<String> it = m1.iterator();
		String path;
		
		while (it.hasNext()) {
			path = it.next();

			if (!m2.contains(path)) {
				doFileDeleted(path);
				d1.remove(m1.indexOf(path));
				m1.remove(path);
				it = m1.iterator();

			} else if (!d1.get(m1.indexOf(path)).equals(d2.get(m2.indexOf(path)))) {
				doFileModified(path);
				d1.set(m1.indexOf(path), d2.get(m2.indexOf(path)));
			}
			
		}

		it = m2.iterator();
		
		while (it.hasNext()) {
			path = it.next();

			if ( ! m1.contains(path)) {
				doFileAdded(path);
				m1.add(path);
				d1.add(d2.get(m2.indexOf(path)));
			}
		}
	}

	private void createArray(LinkedList<String> output, LinkedList<Long> outdate) {
		try {
			File file = new File(path);
			File[] list = file.listFiles();

			output.clear();
			outdate.clear();
			
            for (File f : list) {
				output.add(f.getCanonicalPath());
				outdate.add(f.lastModified());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
