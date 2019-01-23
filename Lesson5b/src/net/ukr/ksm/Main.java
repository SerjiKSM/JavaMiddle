package net.ukr.ksm;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		ByteArrayOutputStream b = new ByteArrayOutputStream();
		byte[] buf = { 'a' };
		try {
			b.write(buf);
			b.write('b');
			String str = "HELLO";
			b.write(str.getBytes());
		} catch (IOException e) {
			System.out.println("Error");
		}
		byte[] c = b.toByteArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print((char) c[i]);
		}

	}

}
