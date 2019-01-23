package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		// Пример обработки исключения
		
		int a = 3;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль");
		} 
		finally {
			System.out.println("Но программа все равно работает");
		}
		System.out.println("Конец программы");

	}
}
