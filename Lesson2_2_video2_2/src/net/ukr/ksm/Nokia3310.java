package net.ukr.ksm;

public class Nokia3310 extends Phone {

	public Nokia3310() {
		touch = false;
		hasWifi = false;
		screenSize = 2;
	}

	/*
	 * @Override public void call(String number) { super.call(number);
	 * System.out.println("Nokia3310 class is calling " + number); }
	 * 
	 * @Override public void sendSMS(String number, String message) {
	 * System.out.println("Nokia3310 class is sending sms " + message + " to " +
	 * number); }
	 */

	@Override
	public void call(String number) {
		System.out.println("Nokia3310 is calling " + number);
		super.call(number);
	}

	@Override
	public void sendSMS(String number, String message) {
		super.sendSMS(number, message);
		System.out.println("Nokia3310 is sending sms " + message + " to "
				+ number);
	}

	@Override
	public void answer() {
		System.out.println("Nokia3310 say 'Hello'");
	}

}
