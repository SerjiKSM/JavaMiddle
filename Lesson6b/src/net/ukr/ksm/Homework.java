package net.ukr.ksm;

import java.util.Random;
import javax.swing.*;
import java.awt.*;

public class Homework {

	public static void main(String[] args) {

		SingleThread sort = new SingleThread();
		String s = "";
		Random rand = new Random();
		int[] b = new int[20];  // 200000
		int[] c = new int[20];
		int[] d = new int[20];

		for (int i = 0; i < b.length; i++) {
			b[i] = rand.nextInt(1000);
			c[i] = rand.nextInt(1000);
			d[i] = rand.nextInt(1000);
		}

		MultiThread t1 = new MultiThread(b);
		MultiThread t2 = new MultiThread(c);
		MultiThread t3 = new MultiThread(d);

		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);

		s = JOptionPane.showInputDialog("Выберите режим работы 1-Однопоточная сортировка" + "  " + "2-Многопоточная");

		long t = System.currentTimeMillis();
		if (s.compareTo("2") == 0) {
			th1.start();
			th2.start();
			th3.start();
			try {
				th1.join();
				th2.join();
				th3.join();
				b = t1.getmassive();
				c = t2.getmassive();
				d = t3.getmassive();
			}

			catch (Exception e) {
				System.out.println("error");
			}

		} else if (s.compareTo("1") == 0) {
			b = sort.sortmassive(b);
			c = sort.sortmassive(c);
			d = sort.sortmassive(d);
		}
		JOptionPane.showMessageDialog(null,
				" Sorting took " + (System.currentTimeMillis() - t) + " ms");

		printmass(b);
	}
	
	static void printmass(int[] mass) {
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + "  ");
		}
	}

}
