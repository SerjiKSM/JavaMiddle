package net.ukr.ksm;


public class Main {
	public static void main(String[] args) {
		Monitor m = new Monitor("d:\\1.txt", new FileEvent());
		m.start();
	}
}