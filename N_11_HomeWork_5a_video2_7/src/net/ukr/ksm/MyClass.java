package net.ukr.ksm;

public class MyClass {

    private static class MyEvents implements IFileEvents {
        public void onFileAdded(String path) {
            System.out.println("File added: " + path);
        }
        
        public void onFileDeleted(String path) {
            System.out.println("File deleted: " + path);
        }
        
        @Override
		public void onFileModified(String path) {
			System.out.println("File modified: " + path);
		}
    }

    public static void main(String[] args) {
        Monitor m = new Monitor("d:\\test");
        m.setTimeout(5000);
        m.setEvents(new MyEvents());
        m.start();
    }
}