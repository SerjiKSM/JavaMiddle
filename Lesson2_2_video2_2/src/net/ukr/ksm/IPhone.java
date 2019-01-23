package net.ukr.ksm;

public class IPhone extends Phone{

	public IPhone(){
		touch = true;
		hasWifi = true;
		screenSize = 6;
	}
	
	@Override
	public void call(String number){
		System.out.println("IPhone is calling " + number);
		super.call(number);
	}
	
	@Override
	public void sendSMS(String number, String message) {
		super.sendSMS(number, message);
		System.out.println("IPhone is sending sms " + message + " to "
				+ number);
	}
	
	@Override
	public void answer() {
		System.out.println("IPhone say 'Hello'");
	}
	
}
