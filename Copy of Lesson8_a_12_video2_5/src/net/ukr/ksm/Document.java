package net.ukr.ksm;

// shematicheski :)
public class Document {
	private byte[] data;

	public void setData(byte[] data) {
		this.data = data;
	}

	public boolean ready() {
		return data != null;
	}
}
