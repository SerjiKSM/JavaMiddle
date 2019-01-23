/* 
 * 4. Write a function which save the contents of the directory in list and output first five elements on the screen. 
 * 
 */

package net.ukr.ksm;

import java.awt.List;
import java.io.File;
import java.util.LinkedList;

public class Main {

	
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		File file = new File("d:\\test\\");
		String[] files = file.list();
		for (String s : files) {
			list.add(s);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}

	}

}

