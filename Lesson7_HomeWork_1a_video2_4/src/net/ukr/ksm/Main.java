/*
 * Modifichurovat project "FindFiles" tak, chtobu programma iskala v kataloge vse faylu  
 * s rasshureniem iz spiska
 */

package net.ukr.ksm;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		 String[] exts = {"docx", ".txt", ".xlsx", ".zip"}; 
		
		try {
			findFiles("d:\\Test", exts, list);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String s : list)
			System.out.println(s);
	}

	private static void findFiles(String srcPath, String [] exts, ArrayList<String> list) throws IOException {
		File dir = new File(srcPath);
		File[] files = dir.listFiles(new MyFileFilter(exts));

		for (int i = 0; i < files.length; i++) {
			list.add(files[i].getCanonicalPath());
		}

	}

}
