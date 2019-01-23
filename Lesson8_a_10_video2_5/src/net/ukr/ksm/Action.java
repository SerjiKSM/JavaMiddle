package net.ukr.ksm;

public class Action extends Thread{

	Account account;            // shchet 
	private int withDraw = 0;   // summa kotoryy snimaem
	
	public Action(Account account, int withDraw){
		this.account = account;
		this.withDraw = withDraw;
	}
	
	public void run(){
		try {
			Thread.sleep(System.currentTimeMillis() % 100);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		synchronized (account) {
			int has = account.getMoney();
			if(has >= this.withDraw){
				account.setMoney(account.getMoney() - this.withDraw);
			}
		}
	}
	
}
