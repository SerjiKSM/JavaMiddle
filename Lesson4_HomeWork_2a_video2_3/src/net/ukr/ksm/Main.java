// Написать разные ексепшыны

package net.ukr.ksm;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		// public static int parseInt(String s) throws NumberFormatException

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Введите любое целое число: ");
			String s = scan.nextLine();
			int n = Integer.parseInt(s);
			System.out.println("Вы ввели это число: " + n);
		} catch (NumberFormatException e) {
			System.out
					.println("Вы ввели некорректное число! Попробуйте еще раз!");
		}

		// public int nextInt() throws InputMismatchException
		// public char charAt(int index) throws IndexOutOfBoundsException

		try {
			System.out.println("Введите любое слово: ");
			String word = scan.nextLine();
			System.out.println("С какой по счету буквы начнем игру?");
			int num = scan.nextInt() - 1;
			System.out.println("Назовите страну на букву \"" + word.charAt(num)
					+ "\"");
		} catch (IndexOutOfBoundsException | InputMismatchException ex) {
			System.out.println("Вы ввели некорректное число!");
		}

		// public boolean after(Date when) throws NullPointerException

		Date today = new Date();
		Date once = null;
		System.out.println("Сегодня более поздняя дата, чем однажды? ");
		try {
			System.out.println(today.after(once));
		} catch (NullPointerException e) {
			System.out.println("Вторая дата не указана!");
		}

		// nextInt(int bound) throws IllegalArgumentException

		Random r = new Random();
		try {
			System.out
					.println("Введите максимальное положительное число для определения случайного числа: ");
			int n = r.nextInt(scan.nextInt());
			System.out.println("Случайное число: " + n);
		} catch (IllegalArgumentException | InputMismatchException e) {
			System.out.println("Вы ввели некорректное число!");
		}

		// public static Object get(Object array, int index)
		// throws NullPointerException, IllegalArgumentException,
		// ArrayIndexOutOfBoundsException

		String[] array = new String[] { "чебуреки", "Чебоксары", "чемодан",
				"Чебурашка" };
		int index = 3;
		// Варианты того как можно ошибиться:
		// Вариант 1 (раскомментить строку ниже)
		// array = null;

		// Вариант 2 (в методе get запросить array2 и раскомментить строку ниже)
		// String array2 = "Ку-ку!";

		// Вариант 3 (раскомментить строку ниже)
		// index = 4;
		try {
			System.out.println(Array.get(array, index));
		} catch (NullPointerException | IllegalArgumentException
				| ArrayIndexOutOfBoundsException e) {
			System.out
					.println("Чувак, разберись, ты сделал с массивом что-то не то!");
		}
	}
}
