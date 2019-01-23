package net.ukr.ksm;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileEvent implements IFileEvent {

	@Override
	public void onFileAdded(String s) {
		
		File file = new File(s);
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		System.out.println("File added: " + s);
		System.out.println("Time: " + dateFormat.format(file.lastModified()));
	}
	
}
