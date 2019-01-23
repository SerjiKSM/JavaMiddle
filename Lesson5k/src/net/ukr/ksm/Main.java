// BufferedWriter  simvolnuy potokovuy vvod

package net.ukr.ksm;

import java.io.*;

public class Main {

	public static void main(String[] args) {

		try (BufferedWriter f = new BufferedWriter(new FileWriter("d.txt"))) {
			f.write("Hello");
			f.newLine();
			f.write("Word");
			System.out.println();
		} catch (IOException e) {
			System.out.println("ERROR!");
		}
		
		
		// BufferedReader  simvolnuy potokovuy vuvod
		
		try (BufferedReader f = new BufferedReader(new FileReader("d.txt"))) {
			String str = "";
			for (; (str = f.readLine()) != null;)
				System.out.println(str);
		} catch (IOException e) {
			System.out.println("ERROR");
		}
		
		
		//  PrintWriter  simvolnuy potokovuy vvod

		try (PrintWriter a = new PrintWriter("c.txt")) {
			for (int i = 0; i < 10; i++) {
				a.println(i);
			}
			a.println();
			a.println("Hello WORD");
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}
	}

}
