package com.company;

public class MyClass {
	public static void main(String[] args) {
		Document doc = new Document();

		Sender[] senders = {
				new Sender(doc, "one@mail.com"),
				new Sender(doc, "two@mail.com"),
				new Sender(doc, "three@mail.com"),
				new Sender(doc, "four@mail.com")
		};

		// отправляют сканированный документ разным адресатам
		for (Sender sender : senders)
			sender.start();

		DigitalScanner pr = new DigitalScanner(doc);
		pr.start();
	}
}
