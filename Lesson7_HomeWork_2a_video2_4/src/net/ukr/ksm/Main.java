/*Napisat programmy kotoraya schituvat text fayl, zamenet v nyom vse slova "Hello" na "1234"
 * i zapishet izmeneniya v tot ze fayl 
 */

package net.ukr.ksm;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

	public static void main(String[] args) {
		final String file = "d:\\Test\\2.txt";
		try {
			String text = fileAsText(file);
			//text = text.replace("Hello", "1234");
			text = text.replace("1234", "Hello");
			writeTextToFile(file, text);
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}

	static String fileAsText(String file) throws IOException {
		RandomAccessFile f = new RandomAccessFile(file, "r");
		try {
			byte[] buf = new byte[(int) f.length()];
			f.read(buf);
			return new String(buf);
		} finally {
			f.close();
		}
	}

	static void writeTextToFile(String file, String text) throws IOException {
		RandomAccessFile f = new RandomAccessFile(file, "rw");
		try {
			f.setLength(0);
			byte[] buf = text.getBytes();
			f.write(buf);
		} finally {
			f.close();
		}
	}

}
