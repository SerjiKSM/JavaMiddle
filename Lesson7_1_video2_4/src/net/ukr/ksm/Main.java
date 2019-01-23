// Prumer soedunit tri masiva v odun

package net.ukr.ksm;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		byte[] a = {1, 2, 3};
		byte[] b = {4, 5};
		byte[] c = {6, 7, 8, 9};
		
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		try {
			bs.write(a);
			bs.write(b);
			bs.write(c);
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
		byte[] res = bs.toByteArray();
		System.out.println(Arrays.toString(res));
			
	}

}
