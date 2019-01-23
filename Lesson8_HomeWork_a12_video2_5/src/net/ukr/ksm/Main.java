// izmenit reshenie zadachi pro bank tak, chtobu balanc nikogda ne stanovilsa menshe 	100

package net.ukr.ksm;

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
