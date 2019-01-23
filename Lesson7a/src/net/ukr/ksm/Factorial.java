// Пример создания синхронизированного метода

package net.ukr.ksm;

public class Factorial {

	public synchronized void facCalculate() {
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "     "
					+ "factorial " + i + "=" + factorial(i));
			if (i == 5)
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println("ERROR");
				}
		}
	}

	private int factorial(int a) {
		int fuct = 1;
		for (int i = 1; i <= a; i++) {
			fuct = fuct * i;
		}
		return fuct;
	}


}
