package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		try {
			for (int i = 0; i < 10; i++) {
				if (i == 5)
					throw new ArithmeticException();
			}
		} catch (ArithmeticException e) {
			System.out.println("Перехват сгенерированного исключения");
		} finally {
			System.out.println("");
		}
		System.out.println("Конец программы");

	}

}
