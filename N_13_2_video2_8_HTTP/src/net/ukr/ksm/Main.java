package net.ukr.ksm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) throws IOException {

		URL url = new URL("http://prog.kiev.ua");
		HttpURLConnection http = (HttpURLConnection) url.openConnection();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
			char[] buf = new char[1000];
			StringBuilder sb = new StringBuilder();
			int r;
			
			do {
				if ((r = br.read(buf)) > 0) {
					sb.append(new String(buf, 0, r));
				}
			} while (r > 0);
	
			System.out.println(sb.toString());
		
		} finally {
			http.disconnect();
		}

	}
}
