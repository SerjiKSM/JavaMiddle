package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		try {
			int a = 22;
			int b = 0;
			int c = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("finally section");
		}

	}

}
