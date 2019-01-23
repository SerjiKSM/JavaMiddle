package net.ukr.ksm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Action extends Thread {

	Account account; // shchet
	private int withDraw = 0; // summa kotoryy snimaem

	public Action(Account account, int withDraw) {
		this.account = account;
		this.withDraw = withDraw;
	}

	// ////////////////////////////////////////
	/*
	 * public void run(){ try { Thread.sleep(System.currentTimeMillis() % 100);
	 * } catch (InterruptedException e) { // TODO: handle exception }
	 * 
	 * synchronized (account) { int has = account.getMoney();
	 * 
	 * // ksm + //if(has >= this.withDraw){ if(has >= this.withDraw && (has -
	 * this.withDraw >= 100)) { // ksm - account.setMoney(account.getMoney() -
	 * this.withDraw); }
	 * 
	 * } }
	 */

	// ////////////////////////////////////////
	
	public void run(){
		doAction();	
	}
	
	Lock lock = new ReentrantLock();

	public void doAction() {

		lock.lock();

		try {
			Thread.sleep(System.currentTimeMillis() % 100);
		} catch (InterruptedException e) {

		}

		int has = account.getMoney();

		if (has >= this.withDraw + 100) {
			account.setMoney(account.getMoney() - this.withDraw);
			System.out.println("You took " + this.withDraw + " dollars! "
					+ account.getMoney() + " left on your balance ");
		}
		if (has < this.withDraw + 100) {
			/*
			try {
				throw new Exception("Not enough money on your account! You can withdraw only " + (has - 100));
			} catch (Exception e) {
				e.printStackTrace();
			}*/
			System.out.println("Not enough money on your account! You can withdraw only " + (has - 100));
		}
		lock.unlock();
	}
}
