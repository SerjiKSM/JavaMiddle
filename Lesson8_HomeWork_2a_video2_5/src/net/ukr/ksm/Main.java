/* Sozdat potok, kotoruy bydet kazdue 10 sekynd vuvodit tekyshchee vremya na ekran.
 * Sdelat vozmoznost preruvania potoka s pomoshchyy comandu v konsole
 */

package net.ukr.ksm;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {

			TestThread testThread = new TestThread();
			testThread.start();
			Thread.sleep(3000);

			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			if (s.equals("z")) {
				testThread.interrupt();
			}
			sc.close();

		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
