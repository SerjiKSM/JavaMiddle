package net.ukr.ksm;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		try (FileInputStream f = new FileInputStream("a.txt")) {
			System.out.println("aviable byte = " + f.available());
			byte[] b = new byte[f.available()];
			f.read(b);
			for (byte a : b) {
				System.out.print((char) a);
			}
		} catch (IOException e) {
			System.out.println("FILE READ ERROR");
		}

	}

}
