package net.ukr.ksm;

import net.ukr.ksm.Phone.TypeInfo;

public class Sender {

	 public static void send(Phone phone){
		if (phone.getTypeInfo() == TypeInfo.CALL ) {
			phone.setCountCall();
		} else if(phone.getTypeInfo() == TypeInfo.SMS ) {
			phone.setCountSMS();	
		}
	}
	
}
