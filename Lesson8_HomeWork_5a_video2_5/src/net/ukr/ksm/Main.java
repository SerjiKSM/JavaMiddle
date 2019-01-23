/* Kopirovanie fayla blokami(1 potok na blok)
 * + zadanue ¹6 napisat programmy kopirovania fayla s vuvodom progressa na konsol
 */

package net.ukr.ksm;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		Copy c = new Copy();
		try {
			c.copyBlocks("d:\\Test\\1.pdf", "d:\\Test2");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
