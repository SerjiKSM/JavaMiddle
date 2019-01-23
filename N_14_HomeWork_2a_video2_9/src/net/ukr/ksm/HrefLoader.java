package net.ukr.ksm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class HrefLoader {

	// Metod return html text page po zadanomy url
	public static String htmlLoad(String URL) throws IOException{

		URL u = new URL(URL);
		URLConnection uc = u.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(
				uc.getInputStream()));
		String inputLine;
		StringBuilder sb = new StringBuilder();
		while ((inputLine = in.readLine()) != null)
			sb.append(inputLine + "\n");

		in.close();

		return sb.toString();

	}
	
	// Metod return array urllov prisutstvyyshchux v zadanom texste
	public static void getURLs(String HTMLSource, ArrayList<String> list) {
		char c;
		int pos = 0;
		StringBuilder sb = new StringBuilder();
		do {
			pos = HTMLSource.indexOf("<a href=\"http://", pos);
			if (pos >= 0) {
				pos += "<a href=\"".length();
				do {
					c = HTMLSource.charAt(pos++);
					if (c != '"')
						sb.append(c);
				} while (c != '"');
				list.add(sb.toString());
				sb.setLength(0);
			}
		} while (pos >= 0);

	}

	// Method save html text in file
	public static void Save(final String Text, final String Path) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					File f = new File(Path);
					FileWriter fw = new FileWriter(f);

					fw.write(Text);
					fw.close();
					System.out.println("File " + Path + " save");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		thread.start();
	}

}
