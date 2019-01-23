/* Modificzirovat class "Counter" tak chtobu on czuklicheski vuvodil chisla iz opredelennogo diapazona 
 * 
 */

package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		try {
			Counter counter = new Counter(123, 130);

			counter.start();
			Thread.sleep(10000);
			counter.interrupt();
		} catch (InterruptedException e) {
			System.out.println("Error");
		}

	}

}
