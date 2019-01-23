package net.ukr.ksm;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ThreadCopy extends Thread {

	File src;
	File dest;
	long bgn;
	int blockSize;
	RandomAccessFile in;
	RandomAccessFile out;
	String name;
	IProgress p;

	public ThreadCopy(String name, File src, File dest, long bgn,
			int blockSize, IProgress p) {
		this.src = src;
		this.dest = dest;
		this.bgn = bgn;
		this.blockSize = blockSize;
		this.name = name;
		this.p = p;
	}

	@Override
	public void run() {

		try {
			in = new RandomAccessFile(src, "r");
			try {
				out = new RandomAccessFile(dest, "rw");
				try {

					byte[] buf = new byte[blockSize];
					int r = 0;
					in.seek(bgn);
					r = in.read(buf, 0, buf.length);
					if (r > 0) {
						p.progress(src, r);
						out.seek(bgn);
						out.write(buf, 0, r);
					}
				} finally {
					out.close();
				}

			} finally {
				in.close();
			}
		} catch (IOException e) {
			System.out.println("IOExeption");
		}

	}

}
