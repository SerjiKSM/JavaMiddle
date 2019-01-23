package net.ukr.ksm;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	int port;
	Thread thread;

	public Server(int port) {
		this.port = port;
	}

	public void stop() {
		thread.interrupt();
	}

	public void start() throws IOException {
		thread = new Thread() {
			public void run() {
				try {
					ServerSocket s = new ServerSocket(port);
					//int num = 0;
					int num = 1;
					while (!isInterrupted()) {
						Socket c = s.accept();
						try {
							Runtime r = Runtime.getRuntime();
							StringBuilder sb = new StringBuilder();
							sb.append("Hello!!!");
							sb.append("\r\n");
							sb.append("Total memory in JVM ");
							sb.append(r.totalMemory());
							sb.append("\r\n");
							sb.append("Free memory in JVM  ");
							sb.append(r.freeMemory());
							sb.append("\r\n");
							sb.append("System property OS "
									+ System.getProperty("os.name"));
							sb.append("\r\n");
							sb.append("System property OS ver "
									+ System.getProperty("os.version"));
							sb.append("\r\n");
							sb.append("Request number " + num++);
							sb.append("\r\n");
							c.getOutputStream().write(sb.toString().getBytes());
						} finally {
							c.getOutputStream().write(("end").getBytes());
							c.close();
						}
					}
					s.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		thread.start();
	}

}
