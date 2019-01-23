package net.ukr.ksm;

import java.io.File;
import java.io.FilenameFilter;

class MyFileFilter implements FilenameFilter {
	
	private String[] exts;

	public MyFileFilter(String[] exts) {
		this.exts = exts;
	}

	public boolean accept(File dir, String name) {

		for (String ext : exts) {
			if (name.endsWith(ext))
				return true;
		}
		return false;

	}


}
