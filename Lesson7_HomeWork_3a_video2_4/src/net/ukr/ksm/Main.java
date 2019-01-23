/*  № 3 - Write program for copy all files from one directory to other directory
 * 
 *  № 5 - Razobratsya s java.io.BufferedInputStream, java.io.BufferedOutputStream. Podumat kak ylytcshut zadanie № 3   
 */

package net.ukr.ksm;

import java.io.*;

public class Main {

	public static void copy(File source, File dest) throws IOException {// без (without)
																		// BufferedInputStream
																		// &
																		// BufferedOutputStream
		FileInputStream is = new FileInputStream(source);
		try {
			FileOutputStream os = new FileOutputStream(dest);
			try {
				byte[] buffer = new byte[4096];
				int length;
				while ((length = is.read(buffer)) > 0) {
					os.write(buffer, 0, length);
				}
			} finally {
				os.close();
			}
		} finally {
			is.close();
		}
	}

	public static void copyBuf(File source, File dest) throws IOException {// с
																			// использованием (use)
																			// BufferedInputStream
																			// &
																			// BufferedOutputStream
		FileInputStream is = new FileInputStream(source);
		BufferedInputStream bis = new BufferedInputStream(is);
		try {
			FileOutputStream os = new FileOutputStream(dest);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			try {
				byte[] buff = new byte[64 * 1024];// буфер 64 кбайт (buf 64 kbyte)
				int str;
				while ((str = bis.read(buff)) >= 0) {
					bos.write(buff, 0, buff.length);
				}
			} finally {
				bos.close();
			}
		} finally {
			bis.close();
		}
	}

	public static void copyDir(String soursedir, String destdir) throws IOException {
		File sdir = new File(soursedir);
		File ddir = new File(destdir);
		if (sdir.isDirectory()) {
			if (!ddir.isDirectory()) {
				ddir.mkdir();
			}
			File[] sfile = sdir.listFiles();
			File[] dfile = new File[sfile.length];
			for (int i = 0; i < sfile.length; i++) {
				String first = sfile[i].getPath();
				String second = first.replace(soursedir, destdir);
				dfile[i] = new File(second);
				//copy(sfile[i],dfile[i]); // копирует побайтово (copy byte)
				copyBuf(sfile[i], dfile[i]); // копирует через буфер (copy buf)
			}
		} else {
			System.out.println("No such directory " + soursedir);
		}
	}

	public static void main(String[] args) {

		try {
			copyDir("d:\\Test", "d:\\Test2");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
