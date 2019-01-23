package net.ukr.ksm;

public class MyException extends Exception {
	@Override
	public String getMessage() {
		return "You have exceeded the limit of the input text!";
	}
}
