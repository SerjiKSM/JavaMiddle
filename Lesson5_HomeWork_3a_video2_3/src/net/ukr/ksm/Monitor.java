package net.ukr.ksm;

import java.io.File;
import java.util.Date;

public class Monitor {
	
	String dir;
	String file;
	IFileEvent event;
	boolean isFolder = false;
	
	public Monitor(String file, IFileEvent event) {
		
		File f = new File(file);

		if (f.isDirectory()) {
			this.dir = file;
		} else {
			this.file = file;
		}

		this.event = event;
	}
	
	public void start() {
		
		while (true) {
			
		if(file != null) {
			isFolder = false;
			
			File f = new File(file);
			
			if (f.exists() && f.isFile()) {
				if (event != null)
					
					event.onFileAdded(file, isFolder);
				
				break;
			}
		} else if (dir != null) {
			isFolder = true;
			
			File file2 = new File(dir);
			
			MyFileFilter filter = new MyFileFilter();
			filter.setExtension(".txt");				
			//filter.setExtension(new String[]{".doc", ".xls"});
			
			String[] directories = file2.list(filter); 
			
			if(directories.length > 0){
				event.onFileAdded(dir, isFolder);
				for(String item : directories){
					File f = new File(dir, item); 
					//if(System.currentTimeMillis() - f.lastModified() < 1000){					
						if (event != null){
							isFolder = false;
							event.onFileAdded(item, isFolder); 
							
						} 
						//break;
					//}   
				}
			}
			
			
		} else {
			break;
		}  
			
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			System.out.println("Waiting...");
		
		}
	}
}
