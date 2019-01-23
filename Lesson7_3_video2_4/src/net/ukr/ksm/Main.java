package net.ukr.ksm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			copyFile("D:\\Test\\1.txt", "D:\\Test\\2.txt");
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
	}

	public static void copyFile(String src, String dest) throws Exception { 
		FileInputStream in = new FileInputStream(src);
		try {
			FileOutputStream out = new FileOutputStream(dest);
			try {
				byte[] buf = new byte[1024]; // 1 KB
				int r;
				
				do {
					r = in.read(buf, 0, buf.length);
					if(r > 0)
						out.write(buf, 0, r);
				} while (r > 0);
				
			} finally {
				out.close();
			}
		} finally {
			in.close();
		}
	}

}
