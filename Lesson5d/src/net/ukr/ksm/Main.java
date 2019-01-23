package net.ukr.ksm;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		File ff = new File(".");

		try {
			if (!ff.exists()) {
				ff.createNewFile(); // add new file
			}
		} catch (IOException e) {
			System.out.println("ERROR!");
		}

		File f1 = new File(ff.getAbsolutePath());
		if (f1.isDirectory()) {
			String[] S = f1.list();
			for (int i = 0; i < S.length; i++) {
				System.out.println(S[i]);
			}
		}

	}

}
