/*
1) Написать класс наследник SamsungS4 с диагональю экрана 5 дюймов, поддержкой Wifi и методом отправки SMS,
который будет дописывать к сообщению слово “Hello”.
2) Модифицировать класс Phone так, чтобы он считал
количество звонков и сообщений отдельно для каждого объекта.
3) Написать код для связи телефонов между собой. У каждого телефона будет свой номер. При вызове
call(x) телефон должен найти собеседника по номеру "x" из всех доступных в данный момент
телефонов (из всех созданных объектов типа Phone) и вызвать его метод answer().
*/

package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		Nokia3310 nokia = new Nokia3310();
		IPhone iphone = new IPhone();
		IPhone5 iphone5 = new IPhone5();
		Sumsung4 sumsung4 = new Sumsung4();

		ATS.setPhone("123-45-60", nokia);
		ATS.setPhone("123-45-61", iphone);
		ATS.setPhone("123-45-62", iphone5);
		ATS.setPhone("123-45-63", sumsung4);

		
		System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
		nokia.call("123-45-61");
		nokia.sendSMS("567-78-80", "text message");
		nokia.sendSMS("567-78-89", "text message");
		System.out.println("Nokia3310 called " + nokia.counterSMS);
		System.out.println("Nokia3310 sended message " + nokia.counterCall);

		System.out.println("----------------------------------");

		
		System.out.println("IPhone screent size: " + iphone.getScreenSize());
		iphone.call("123-45-60");
		iphone.sendSMS("567-78-85", "text message");
		iphone.sendSMS("567-78-89", "text message");
		System.out.println("IPhone called " + iphone.counterCall);
		System.out.println("IPhone sended message " + iphone.counterSMS);

		System.out.println("----------------------------------");

		System.out.println("IPhone5 screent size: " + iphone5.getScreenSize());
		iphone5.call("123-45-63");
		iphone5.sendSMS("567-78-89", "text message");
		System.out.println("IPhone5 called " + iphone5.counterCall);
		System.out.println("IPhone5 sended message " + iphone5.counterSMS);
		System.out.println("----------------------------------");

		System.out.println("Sumsung4 screent size: " + sumsung4.getScreenSize());
		System.out.println("Sumsung4 WiFi is " + sumsung4.isHasWifi());
		System.out.println("Sumsung4 touch is " + sumsung4.isTouch());
		sumsung4.call("123-45-62");
		sumsung4.sendSMS("754-63-56", "Bobby " + sumsung4.getSayHello());
		sumsung4.sendSMS("754-63-57", "Bobby " + sumsung4.getSayHello());
		sumsung4.sendSMS("754-63-58", "Bobby " + sumsung4.getSayHello());
		System.out.println("Sumsung4 called " + sumsung4.counterCall);
		System.out.println("Sumsung4 sended message " + sumsung4.counterSMS);

	}

}
