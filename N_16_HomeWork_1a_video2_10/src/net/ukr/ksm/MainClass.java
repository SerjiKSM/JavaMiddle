
/*
 * 1. Write class the heir "Samsung4" with screen 5 inches, Wifi with method "SendSMS" 
 * which will append to the message the word "Hello"

 *2. To modify the class "Phone" so he did count the number of calls and messages separately for each object
 */


package net.ukr.ksm;

import java.util.ArrayList;
import java.util.List;

import otherPhone.Nokia3310;

public class MainClass {

	public static void main(String[] args) {
		
		Nokia3310 nokia3310 = new Nokia3310();
		SamsungS4 samsungS4 = new SamsungS4(true, 5);
		Sender sender = new Sender();
		
		/*
		 * SamsungS4
		 */
		System.out.println("SamsungS4 screent size: " + samsungS4.getScreenSize());
		System.out.println("SamsungS4 Wifi: " + samsungS4.isHasWifi());
		
		samsungS4.prepareSMS("567-78-89", "Hello", "SamsungS4");
		sender.send(samsungS4);
		samsungS4.prepareSMS("111-55-66", "Hy man", "SamsungS4");
		sender.send(samsungS4);
		
		System.out.println("Count sms: " + samsungS4.getCountSMS());
		
		samsungS4.prepareCall("567-78-89", "SamsungS4");
		samsungS4.prepareCall("111-55-66", "SamsungS4");
		samsungS4.prepareCall("555-55-55", "SamsungS4");
		
		System.out.println("Count called: " + samsungS4.getCountCall());
		
		////////////////////////////////////////////////////////////
		/*
		 * Nokia3310
		 */
		System.out.println("Nokia3310 screent size: " + nokia3310.getScreenSize());
		System.out.println("Nokia3310 Wifi: " + nokia3310.isHasWifi());
		System.out.println("Nokia3310 touch: " + nokia3310.isTouch());
		
		nokia3310.prepareSMS("567-78-89", "Hello", "Nokia3310");
		sender.send(nokia3310);
		nokia3310.prepareSMS("111-55-66", "Hy man", "Nokia3310");
		sender.send(nokia3310);
		
		System.out.println("Count sms: " + nokia3310.getCountSMS());
		
		nokia3310.prepareCall("567-78-89", "Nokia3310");
		nokia3310.prepareCall("111-55-66", "Nokia3310");
		nokia3310.prepareCall("555-55-55", "Nokia3310");
		nokia3310.prepareCall("666-77-66", "Nokia3310");
		
		System.out.println("Count called: " + nokia3310.getCountCall());
		
		
	}
}
