package net.ukr.ksm;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("prog.kiev.ua", 80);

		try {
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println("GET / HTTP/1.1");
			pw.println("Host: prog.kiev.ua");
			pw.println("");
			pw.flush();

			InputStream s = socket.getInputStream();
			byte[] buf = new byte[1000];
			int r;

			do {
				if ((r = s.read(buf)) > 0) {
					System.out.println(new String(buf, 0, r));
				}
			} while (r > 0);
		} finally {
			socket.close();
		}

	}
}
