// RECURCIA

/* Dopolnit Proekt "Monitor" funkcziy recyrsivnogo monitoringa kataloga
 * 
 */

package net.ukr.ksm;

public class Main {
	
public static void main(String[] args) {
		
		String[] fileList = {
				"1.txt",
				"2.txt",
				"3.txt",
				"Hatasha"
		};
		
		String dir = "d:\\test";
		
		Monitor m = new Monitor(fileList, dir, new FileEvent());
		m.start();
	}

}
