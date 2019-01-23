package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		/*// Primer 1
		// Polychaem glavnuy potoc
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		try {
			t.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("main thread break");
		}
		System.out.println("Stop programm");
		*/
		// ///////////////////////////////////////////
		/*
		// Test
		// Sozdanie obectow realizaciey interfeysa  Runnable
		NewThread newThread = new NewThread();
		newThread.run();
		*/
		// ///////////////////////////////////////////
		/*
		// // Primer 2
		Thread thr1 = new Thread(new NewThread(), "2 thread");
		Thread thr2 = new Thread(new NewThread(), "3 thread");
		Thread thr3 = new Thread(new NewThread(), "4 thread");
		thr1.start();
		thr2.start();
		thr3.start();
		System.out.println("Stop programm");
		*/
		
		/////////////////////////////////////////////
		/*
		// Primer 3
		Thread thr1 = new Thread(new NewThread(), "2 tread");
		Thread thr2 = new Thread(new NewThread(), "3 tread");
		Thread thr3 = new Thread(new NewThread(), "4 tread");

		NewThread2 thr4 = new NewThread2("5 tread");
		NewThread2 thr5 = new NewThread2("6 tread");
		NewThread2 thr6 = new NewThread2("7 tread");

		thr1.start();
		thr2.start();
		thr3.start();
		thr4.start();
		thr5.start();
		thr6.start();

		System.out.println("Stop programm");
		*/
		/////////////////////////////////////////////
		/*
		// Primer 4 use - join()
		Thread thr1 = new Thread(new NewThread(), "2 tread");
		NewThread2 thr4 = new NewThread2("5 tread");
		try {
			thr1.start();
			thr4.start();
			thr1.join();
			thr4.join();
		} catch (InterruptedException e) {
		}
		System.out.println("Stop programm");
		*/
		/////////////////////////////////////////////

		// Primer 5 use -  setDaemon, isDaemon, interrupt
		Thread t = Thread.currentThread();
		Thread thr1 = new Thread(new NewThread(), "2 tread");
		thr1.setDaemon(true);
		System.out.println(thr1.isDaemon());
		thr1.start();
		System.out.println("Stop programm");
		t.interrupt();
	}

}
