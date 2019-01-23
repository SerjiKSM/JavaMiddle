package net.ukr.ksm;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		//Primer_5
		try (DataOutputStream f = new DataOutputStream(new FileOutputStream("b.dat"))) {
			f.writeInt(12);
		} catch (IOException e) {
			System.out.println("File write error");
		}

		// Primer_6
		try (DataInputStream f = new DataInputStream(new FileInputStream("b.dat"))) {
			System.out.println(f.readInt());
		} catch (IOException e) {
			System.out.println("ERROR READ FILE");
		}
	}

}
