package net.ukr.ksm;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		String str = "Hello wordl ";
		byte[] mas = str.getBytes();
		ByteArrayInputStream b = new ByteArrayInputStream(mas);
		int c;
		for (;;) {
			c = b.read();
			System.out.println((char) c + "   " + c);
			if (c == -1)
				break;
		}

	}

}
