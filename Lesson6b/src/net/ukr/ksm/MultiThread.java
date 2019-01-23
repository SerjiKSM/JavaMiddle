package net.ukr.ksm;

public class MultiThread implements Runnable {

	MultiThread(int[] b) {
		a = b;
	}

	int[] a;

	int[] getmassive() {
		return a;
	}

	void sortmassive() {
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
	}

	@Override
	public void run() {

		sortmassive();
		System.out.println(Thread.currentThread().getName()
				+ " sorting finished");

	}

}
