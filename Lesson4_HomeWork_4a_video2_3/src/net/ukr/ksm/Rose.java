package net.ukr.ksm;

public class Rose extends Plants {

	int height;

	Rose(int size, String color, String type, int price)
			throws ColorExceptions, TypeExceptions, PriceExceptions,
			SizeExceptions {
		super(size, color, type);
		if (price <= 0) {
			throw new PriceExceptions("Invalid price!");
		}
	}

}
