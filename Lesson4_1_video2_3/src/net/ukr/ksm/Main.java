package net.ukr.ksm;

public class Main {

	public static void divide() {
		try {
			int x = 1;
			int y = 0;
			int z = x / y;
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("ERROR");
		}

	}

	public static void main(String[] args) {

		divide();

	}

}
