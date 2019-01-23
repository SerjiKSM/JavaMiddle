package net.ukr.ksm;

import java.io.File;
import java.io.IOException;

import javax.print.attribute.standard.Fidelity;

public class Main {

	public static void test() throws IOException {

		File f = File.createTempFile("ABC", "DEF");
		System.out.println(f.getCanonicalPath());

	}

	public static void main(String[] args) {

		try {
			test();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
