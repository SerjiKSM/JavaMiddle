package net.ukr.ksm;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	int port;
	Thread thread;

	/**
	 * @param port
	 */
	public Server(int port) {

		this.port = port;
	}

	public void stop() {
		thread.interrupt();
	}

	public void start() throws IOException {
		thread = new Thread() {
			@Override
            public void run() {
				try {
					ServerSocket s = new ServerSocket(port);

					while (!isInterrupted()) {
						Socket c = s.accept();

						try {
							String msg = "Hello Serhio!!!\r\n";
							c.getOutputStream().write(msg.getBytes());
						} finally {
							c.close();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
        thread.start();
	}

}
