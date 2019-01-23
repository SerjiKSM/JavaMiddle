package net.ukr.ksm;

import java.math.BigInteger;

public class Factorial implements Runnable {

	private int n;

	public Factorial(int n) {

		this.n = n;
		new Thread(this).start();

	}

	@Override
	public void run() {

		BigInteger result = BigInteger.valueOf(1);

		for (int i = 1; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}

		System.out.println(" n = " + n + " : " + result);

	}

}
