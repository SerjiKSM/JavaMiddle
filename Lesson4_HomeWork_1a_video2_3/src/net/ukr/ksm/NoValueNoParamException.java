package net.ukr.ksm;

public class NoValueNoParamException extends Exception {
	public NoValueNoParamException(String message) {
		super(message);
	}

	public String getMessage() {
		return "NoValueNoParamException: " + super.getMessage();
	}

}
