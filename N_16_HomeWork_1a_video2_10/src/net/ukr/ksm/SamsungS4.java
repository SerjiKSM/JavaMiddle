
package net.ukr.ksm;

public class SamsungS4 extends Phone {
 
	protected boolean hasWifi;	
	protected int screenSize;
	//private int countCall;
	//private int countSMS;
	
	/*
	public int getCountSMS() {
		return super.countSMS;
	}
	*/


	/**
	 * @param hasWifi
	 * @param screenSize
	 */


	public SamsungS4(boolean hasWifi, int screenSize) {
		this.hasWifi = hasWifi;
		this.screenSize = screenSize;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	
	
	@Override
	public void sendSMS(String number, String message) {
		//int countSMS = super.setCountSMS();
		//super();
		System.out.println("SamsunhS4 class is sending sms " + message + " to " + number);		
	}

	
}
