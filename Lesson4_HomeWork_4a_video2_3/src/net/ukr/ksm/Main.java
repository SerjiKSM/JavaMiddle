// ѕридумать свое исключение и написать соответствующий класс и использующий его код.


package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		try {
			Rose netherlands = new Rose(5, "brown", "flower", 15);
		} catch (ColorExceptions | TypeExceptions | PriceExceptions
				| SizeExceptions e) {
			System.err.println(e.getMessage());
		}

	}

}
