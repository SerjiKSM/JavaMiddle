package net.ukr.ksm;

public class FileEvent implements IFileEvent {
	@Override
	public void onFilesAdded() {

       	System.out.println("File added!");
        
	}

}
