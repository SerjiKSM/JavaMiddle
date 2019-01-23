package net.ukr.ksm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEvent implements IFileEvent {
	@Override
	public void onFileAdded(String s, Boolean isFolder) {
		
		Date lastModified = new Date();	 
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy H:m:s");
        String date = DATE_FORMAT.format(lastModified);
		
        if(isFolder){
        	System.out.println("In folder: " + s);
        }else{
        	System.out.println("File added: " + s + " date " + date);
		}
        
	}

}
