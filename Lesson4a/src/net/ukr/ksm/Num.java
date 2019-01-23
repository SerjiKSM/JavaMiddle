/**
 * Пример класса реализующего один интерфейс
 */
package net.ukr.ksm;

/**
 * @author Serhio
 *
 */
public class Num implements Arithmetic {
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
}
