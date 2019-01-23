package net.ukr.ksm;

import java.io.RandomAccessFile;

//import javax.xml.crypto.Data;

public class Preparator extends Thread{
	Data data;
	String file;
	/**
	
 * @param data
	 * @param file
	 */
	public Preparator(Data data, String file) {
		this.data = data;
		this.file = file;
	}
	
	public void run(){
		byte[] buf;
		
		System.out.println("Date is being prepared.... ");
		
		try {
			RandomAccessFile fs = new RandomAccessFile(file, "r");
		
			try {
				buf = new byte[(int)fs.length()];
				fs.read(buf);
			} finally {
				fs.close();
			}
		
		} catch (Exception e) {
			buf = null;
		}
		
		synchronized (data) {
			data.setData(buf);
			data.notifyAll();
		}
	}
	
	
	
}
