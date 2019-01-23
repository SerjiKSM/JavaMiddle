package net.ukr.ksm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// zapus danux v fayl
		OutputStream os = new FileOutputStream("d:\\test\\out.txt");
		try{
			String s = "Ser";
			byte [] b = s.getBytes();
			os.write(b);
		}finally{
			os.close();
		}	
		
		// dobavlenue dannux v fayl
		RandomAccessFile ra = new RandomAccessFile("d:\\test\\out.txt", "rw");
		
		try{
			ra.seek(ra.length()); // peremeshchenuy v konecz teksta v fayle
			String s = " New string";
			byte [] b = s.getBytes();
			ra.write(b);
		}finally{
			ra.close();
		}	

		// chtenie dannux iz fayla
		InputStream is = new FileInputStream("d:\\test\\out.txt");
		try{
			byte [] buf = new byte[100];
			int r = is.read(buf);
			String s = new String(Arrays.copyOf(buf, r)); 

			System.out.println(s);
			System.out.println(Arrays.toString(Arrays.copyOf(buf, r)));
		}finally{
			ra.close();
		}
		
	}

}
