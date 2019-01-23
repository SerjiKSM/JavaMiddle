package net.ukr.ksm;

public class NoDeviderException extends Exception {
	public NoDeviderException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "NoDeviderException: " + super.getMessage();
	}
}
