
/*
 * 5.Change project "Monitor" so that files oldest then N minutes delete auto.
 * 6.To complement the project "Monitor" function of displaying information about files on the screen (creation date, size.....)
 * 
 * */

package net.ukr.ksm;

import java.io.File;
import java.text.SimpleDateFormat;

public class MyClass {

    static class MyStop extends Thread {
        private Monitor s;
        
        public MyStop(Monitor s) {
            this.s = s;
        }
        
        public void run() {
            s.stop();
        }
    }

    private static class MyEvents implements IFileEvents {
        
    	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    	
    	public void onFileChanged(String path) {
            //System.out.println("File changed: " + path);
    		System.out.println(new StringBuilder().append("File changed: " + path)
					.append(" size:" + new File(path).length())
					.append(" " + sdf.format(new File(path).lastModified())));
        }
        
        public void onFileAdded(String path) {
            //System.out.println("File added: " + path);
        	System.out.println(new StringBuilder().append("File added: " + path)
					.append(" size:" + new File(path).length())
					.append(" " + sdf.format(new File(path).lastModified())));
 
        }
        
        public void onFileDeleted(String path) {
            //System.out.println("File deleted: " + path);
        	System.out.println(new StringBuilder().append("File deleted: " + path)
					.append(" size:" + new File(path).length())
					.append(" " + sdf.format(new File(path).lastModified())));	
        }
    }

    public static void main(String[] args) {
       /*
    	if(args.length != 1) {
    		return;
    	}
    	*/	
    	
    	Monitor m = new Monitor("d:\\test");
        m.setTimeout(2000);
        m.setEvents(new MyEvents());
        m.start();
        
        Runtime.getRuntime().addShutdownHook(new MyStop(m));
    }
}