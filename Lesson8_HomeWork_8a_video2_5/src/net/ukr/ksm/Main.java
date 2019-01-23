// RECURCIA

/* Napisat rekursivnyy function dlya vuvoda na ekran vsex faylov i katalogov imya kotorux dlineye 5 simvolov 
 * i vtoraya bykva ravno "A"
 */

package net.ukr.ksm;

import java.io.File;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		final String path = "D:\\test";
		ArrayList<String> res = new ArrayList<String>();

		try {
			listAll(path, res);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (String s : res)
			System.out.println(s);
	}

	private static void listAll(String path, ArrayList<String> res)
			throws Exception {
		File dir = new File(path);
		File[] list = dir.listFiles();

		for (File f : list) {
			try {
				char a = f.getName().charAt(1);

				if (f.getName().length() > 5 && a == 'a') { 
					if (f.isFile()) {
						res.add("F: " + f.getCanonicalPath());
					} else {
						res.add("D: " + f.getCanonicalPath());
						listAll(f.getCanonicalPath(), res);
					}
				}
			} catch (NullPointerException | IndexOutOfBoundsException e) {
				continue;
			}
		}
	}

}
