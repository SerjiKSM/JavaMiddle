package net.ukr.ksm;

public class SingleThread {

	int[] sortmassive(int[] a) {
		int temp;
		for (int i = 1; i < a.length; i++) {
			int k = i - 1;
			temp = a[i];
			for (; k >= 0 && a[k] > temp;) {
				a[k + 1] = a[k];
				a[k] = temp;
				k--;
			}

		}
		System.out.println("sorting finished");
		return a;
	}
	
}
