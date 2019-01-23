package net.ukr.ksm;

import java.util.Date;

public interface IFileEvent {
	
	void onFileAdded(String s, Boolean isFolder);
	
	
}
