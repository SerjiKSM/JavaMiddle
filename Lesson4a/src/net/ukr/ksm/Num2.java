/**
 * Класс реализующий два интерфейса 
 */
package net.ukr.ksm;

/**
 * @author Serhio
 *
 */
public class Num2 implements Arithmetic, Info {

	public double plus(double a, double b) {
		return a + b;
	}

	public double minus(double a, double b) {
		return a - b;
	}

	public double mul(double a, double b) {
		return a * b;
	}

	public double div(double a, double b) {
		if (b != 0)
			return a / b;
		else
			return 0;
	}

	public void printinfo() {
		System.out.println("HELLO");
	}
}
