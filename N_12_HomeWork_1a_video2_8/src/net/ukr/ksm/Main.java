/*
 * Write program translator text
 */

package net.ukr.ksm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// example 1

		/*
		 * Map<String, String> map = new HashMap<String, String>();
		 * 
		 * String str =
		 * (JOptionPane.showInputDialog("Enter text for translat"));
		 * map.put("she", "она"); map.put("go", "идет"); map.put("to", "в");
		 * map.put("school", "школу");
		 * 
		 * System.out.println("Enter for translat this words - she, go, to, school"
		 * );
		 * 
		 * System.out.println("You enter: " + str);
		 * 
		 * for (String s : str.split(" ")) { System.out.print(map.get(s) + " ");
		 * }
		 */

		// // example 2
		Map<String, String> map = new HashMap<String, String>();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		map.put("she", "она");
		map.put("go", "идет");
		map.put("to", "в");
		map.put("school", "школу");
		map.put("She", "Она");

		System.out.println("Enter for translat this words - she, go, to, school");

		try {
			String tr = reader.readLine();

			for (String s : tr.split(" ")) {
				System.out.print(map.get(s) + " ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
