// The class implements the algorithm quick sort

package net.ukr.ksm;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random rn = new Random();
		Primer_2 sortarr = new Primer_2();
		int[] a = new int[5];// 200000
		for (int i = 0; i < a.length; i++) {
			a[i] = rn.nextInt(1000);
		}
		long t = System.currentTimeMillis();
		sortarr.quicksort(a, 0, (a.length - 1));
		System.out.println((System.currentTimeMillis() - t));
		
	}

}
