// Prumer soedunit tri masiva v odun

package net.ukr.ksm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException  {
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			dos.writeInt(777);
			dos.writeUTF("Hello!");
		} finally {
			dos.close();	
		} 
		
		byte[] arr = bos.toByteArray();
		System.out.println(Arrays.toString(arr));
		
		ByteArrayInputStream bis = new ByteArrayInputStream(arr);
		DataInputStream dis = new DataInputStream(bis);
		try {
			int x =  dis.readInt();
			String s = dis.readUTF();

			System.out.println(x + ", " + s);
		} finally {
			dis.close();	
		} 
					
	}

}
