package net.ukr.ksm;

public class Main {

	public static void main(String[] args) throws Exception {
//		try {
			Server server = new Server(20000);
			server.start();
			System.out.println("start server");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
	}

}
