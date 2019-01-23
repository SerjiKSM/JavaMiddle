
package net.ukr.ksm;

public abstract class Phone {
	
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
	private int countCall;
	private int countSMS;
	//private String sendingInfo;
	//private String callableNumber;
	
	// Perechislenie
	public enum TypeInfo { SMS, CALL }
	
	private TypeInfo typeInfo;
	
	final public void prepareSMS(String number, String sms, String modelPhon) {
		typeInfo = TypeInfo.SMS;
		//sendingInfo = sms;
		//callableNumber = number;
		//setCountSMS();
		System.out.println(modelPhon + " class is sending sms " + number + " to " + sms);
	}

	final public void prepareCall(String number, String modelPhon) {
		typeInfo = TypeInfo.CALL;
		//sendingInfo = number;
		//callableNumber = number;
		
		System.out.println(modelPhon + " class called to " + number );
		setCountCall();
	}
	
	public Phone() {
		System.out.println("Phone constructor");
	}
	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public int getCountCall() {
		return countCall;
	}

	public void setCountCall() {
		++countCall;
	}

	public TypeInfo getTypeInfo() {
		return typeInfo;
	}

	public void setCountSMS() {
		++countSMS;
	}

	public void call(String number) {
		System.out.println("Phone class is calling " + number);
	}

	public int getCountSMS() {
		return countSMS;
	}

	public abstract void sendSMS(String number, String message);
	
}
