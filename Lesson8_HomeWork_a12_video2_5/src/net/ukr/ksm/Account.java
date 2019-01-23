package net.ukr.ksm;

public class Account {

	private int money = 0; // Kolichestvo deneg na shchote

	/**
	 * @param money
	 */
	public Account(int money) {
		super();
		this.money = money;
	}

	/**
	 * @return the money
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
