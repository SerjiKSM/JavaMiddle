package net.ukr.ksm;

import java.io.File;

public class DownloadBar implements IProgress {

	private static long res;

	@Override
	public void progress(File src, int r) {
		res += r;
		double d = (double) res / src.length() * 100;
		int s = (int) Math.round(d);
		for (int i = 0; i < s / 10; i++) {
			System.out.print("+");
		}

	}

}
