package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		int x = 5;
		int y = 8;

		for (int j = 0; j < y; j++) {
			System.out.print("0");
		}
		System.out.println();

		for (int i = 1; i < x - 1; i++) {
			for (int k = 0; k < y; k++) {
				if ((k == 0) || (k == y - 1)) {
					System.out.print("0");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int j = 0; j < y; j++) {
			System.out.print("0");
		}
		System.out.println();

	}

}
