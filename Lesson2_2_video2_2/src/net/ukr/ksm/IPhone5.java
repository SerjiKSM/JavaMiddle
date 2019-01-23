package net.ukr.ksm;

public class IPhone5 extends Phone{

	/**
	 * 
	 */
	public IPhone5() {
		super();
		touch = true;
		hasWifi = true;
		screenSize = 8;
	}
	
	@Override
	public void call(String number){
		System.out.println("IPhone5 is calling " + number);
		super.call(number);
	}
	
	@Override
	public void sendSMS(String number, String message) {
		super.sendSMS(number, message);
		System.out.println("IPhone5 is sending sms " + message + " to "
				+ number);
	}
	
	@Override
	public void answer() {
		System.out.println("IPhone5 say 'Hello'");
	}

	
}
