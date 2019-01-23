// Переменная интерфейса может ссылатся на объект реализующего класса

package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		Num2 a = new Num2();
		System.out.println(a.plus(3.4, 5.6));
		
		Arithmetic b = a;   // Переменные интерфейса ссылаются на объекты реализующего их класса
		Info c = a;
		
		System.out.println(b.plus(56, 34)); // Использование методов с помощью переменной интерфейса

		c.printinfo();
		
	}

}
