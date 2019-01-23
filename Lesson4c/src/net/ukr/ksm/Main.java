package net.ukr.ksm;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Bug a = new Bug("Nosorog", 5, "black");
		Bug b = new Bug("Mayiskiy", 2, "green");
		Bug c = new Bug("Bojia korovka", 0.3, "red");
		Bug d = new Bug("Koloradskiy juk", 0.7, "black and yellow");
		Bug e = new Bug("Juk Olen", 3, "black");

		Bug[] bugcollection = { a, b, c, d, e };
		Arrays.sort(bugcollection);

		for (Bug k : bugcollection) {
			k.print();
		}
	}
}
