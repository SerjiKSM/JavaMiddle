package net.ukr.ksm;

import javax.net.ssl.ExtendedSSLSession;

public class Main {

	public static void main(String[] args) throws Exception{
		Account account = new Account(1000);
		for (int i = 0; i < 100; i++) {
			Action action = new Action(account, 10);
			action.start();			
		}
		
		Thread.sleep(5000);
		System.out.println(account.getMoney());
	}

}
