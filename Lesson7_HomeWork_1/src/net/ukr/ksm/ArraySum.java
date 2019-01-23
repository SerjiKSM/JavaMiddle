/*1.Написать код для многопоточного подсчета суммы элементов 
массива целых чисел. Сравнить скорость подсчета с простым 
алгоритмом.
*/

package net.ukr.ksm;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySum extends Thread {

	public static ArrayList<Integer> AllSum = new ArrayList<Integer>();
	int[] ar;
	int start;
	int finish;
	int sumBlock = 0;
	final static int length = 100_000_000;
	final static int block = 10_000_000;
	static Integer counter = (length / block) + 1;

	public ArraySum(int[] ar, int start, int finish) {
		this.ar = ar;
		this.start = start;
		this.finish = finish;
	}

	public ArraySum() {

	}

	@Override
	public void run() {

		for (int i = start; i < finish; i++) {
			if (i >= ar.length) {
				break;
			}
			sumBlock += ar[i];
		}
		synchronized (AllSum) {
			AllSum.add(sumBlock);
			counter -= 1;
		}
	}

	public synchronized int getAllSum() {
		int sum = 0;
		for (int i : AllSum) {
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {

		int[] ar = new int[length];

		 try {

		Arrays.fill(ar, 1);

		int CountOfThreads = (ar.length / block) + 1;

		long start = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());

		for (int i = 0; i < CountOfThreads; i++) {
			ArraySum ar_s = new ArraySum(ar, i * block, i * block + block);
			ar_s.start();

		}

		do {
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (counter != 0);

		System.out.println(new ArraySum().getAllSum());

		System.out.println(System.currentTimeMillis() - start);
		 } catch (InterruptedException  e) {
		 System.out.println("ERROR");
		 }
	}

}
