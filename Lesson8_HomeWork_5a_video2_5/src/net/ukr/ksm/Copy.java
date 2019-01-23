package net.ukr.ksm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Copy {

	public void copyBlocks(String src, String dest)	throws FileNotFoundException {
		File f1 = new File(src);
		File f2 = null;
		if (f1.isFile() && f1.exists()) {
			if (dest.endsWith("\\")) {
				f2 = new File(dest + f1.getName());
			} else {
				f2 = new File(dest + "\\" + f1.getName());
			}
			try {
				f2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("File was not created");
			}
			int blockSize = (int) Math.ceil(f1.length() / 15);// 15 blocks of data      
			long bgn = 0;
			for (int i = 0; i < 15; i++) { // create 15 threads and let's go
				ThreadCopy t = new ThreadCopy("Thread" + i, f1, f2, bgn, blockSize, new DownloadBar());
				t.start();
				bgn += blockSize;
			}

		} else {
			throw new FileNotFoundException("No such file");
		}

	}

}
