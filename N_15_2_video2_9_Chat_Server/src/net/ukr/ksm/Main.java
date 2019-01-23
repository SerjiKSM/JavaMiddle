
package net.ukr.ksm;

public class Main {
    public static void main(String[] args) throws Exception {
        final Server s = new Server(5000);
        s.start();
        
        // Close Server (Ctrl + C)
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			
			@Override
			public void run() {
				s.stop();				
			}
		}));
    }
}
