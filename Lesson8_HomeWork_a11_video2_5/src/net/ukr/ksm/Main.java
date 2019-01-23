// Napisat klass kotoruy pozvolit zapisuvat dannue v odin fayl iz raznux potokov
// 

package net.ukr.ksm;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		String text = " There is first line";
		String text1 = " There is last line";
		CopyF cp = new CopyF("d:\\test\\1.txt", text);
		cp.start();
		Thread.sleep(1000);
		CopyF cp1 = new CopyF("d:\\test\\1.txt", text1);
		cp1.start();
		Thread.sleep(1000);
	}
}