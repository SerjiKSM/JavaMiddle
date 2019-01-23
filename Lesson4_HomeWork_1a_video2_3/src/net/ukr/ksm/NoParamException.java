package net.ukr.ksm;

public class NoParamException extends Exception {
	public NoParamException(String message) {
		super(message);
	}

	public String getMessage() {
		return "NoParamException: " + super.getMessage();
	}

}
