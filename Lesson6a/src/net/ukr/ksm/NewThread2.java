package net.ukr.ksm;

public class NewThread2 extends Thread{
	
	NewThread2(String g){
		super(g);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
}
}