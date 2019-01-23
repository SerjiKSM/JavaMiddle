package net.ukr.ksm;

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
        public void onFileChanged(String path) {
            System.out.println("File changed: " + path);
        }
        
        public void onFileAdded(String path) {
            System.out.println("File added: " + path);
        }
        
        public void onFileDeleted(String path) {
            System.out.println("File deleted: " + path);
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