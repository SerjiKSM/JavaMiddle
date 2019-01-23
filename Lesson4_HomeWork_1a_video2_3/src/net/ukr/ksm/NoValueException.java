package net.ukr.ksm;

public class NoValueException extends Exception {
	public NoValueException(String message) {
		super(message);
	}

	public String getMessage() {
		return "NoValueException: " + super.getMessage();
	}

}
