package net.ukr.ksm;

import java.io.*;

public class Main {

	public static void main(String[] args) {
			
		String str = "HELLO WORD";
		FileOutputStream f = null;
		byte[] b = str.getBytes();
		try {
			f = new FileOutputStream("a.txt");
			f.write(b);
		} catch (IOException e) {
			System.out.println("I/O Error");
		}

		finally {
			try {
				f.close();
			} catch (IOException e) {
				System.out.println("Error close file");
			}
		}
		
	}

}
