package net.ukr.ksm;

public class FileEvent implements IFileEvent {
	@Override
	public void onFileAdded(String s) {
		System.out.println("File added: " + s);
	}
}
