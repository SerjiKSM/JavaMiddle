package net.ukr.ksm;

import javax.print.attribute.standard.Fidelity;

public class Main {

	public static  void divide() {
		
		/*
		try {
			int[] a = new int[2];
			a[0] = 22 / 2;
			a[1] = 33 / 3;
			a[2] = 33 / 0;	
		} catch (ArithmeticException ex) {
			System.out.println("Деление на 0!");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Выход за пределы массива!");	
		}
		*/
		
		try {
			int[] a = new int[2];
			a[0] = 22 / 2;
			a[1] = 33 / 3;
			a[2] = 33 / 0;	
		// Java 7  появилось с седьмой версии
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();	
		}
		
		System.out.println("YES!");
		
	}

	public static void main(String[] args) {

		divide();
		
	}

}
