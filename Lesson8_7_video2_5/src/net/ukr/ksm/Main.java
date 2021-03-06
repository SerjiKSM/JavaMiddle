package net.ukr.ksm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	private static void listAll(String path, ArrayList<String> res)	throws IOException {
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		if(list == null) return;

		for (File f : list) {
			if (f.isFile()) {
				res.add("F: " + f.getCanonicalPath());
			} else {
				res.add("D: " + f.getCanonicalPath());
				listAll(f.getCanonicalPath(), res);
			}
		}
	}

	public static void main(String[] args) {

		final String path = "d:\\test3";
		ArrayList<String> res = new ArrayList<String>();

		try {
			listAll(path, res);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String s : res)
			System.out.println(s);
	}

}
