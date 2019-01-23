package net.ukr.ksm;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLExperiments {

	private HTMLExperiments() {
	}

	public static List<String> getHtmlLinks(String htmlLink) {
		String htmlPage = downloadHtmlPage(htmlLink);

		List<String> list = new ArrayList<String>();

		String htmlRegex = "((https?|ftp|file):|href\\s*=\\s*)//([-a-zA-Z0-9+&@#/%?=~_|!:,.;]+[-a-zA-Z0-9+&@#/%=~_|])";
		Pattern htmlPattern = Pattern.compile(htmlRegex);
		Matcher htmlMatcher = htmlPattern.matcher(htmlPage);
		while (htmlMatcher.find()) {
			list.add(htmlMatcher.group(3));
		}
		return list;
	}

	public static String downloadHtmlPage(String htmlLink) {
		StringBuilder htmlPg = new StringBuilder();
		try {
			URL url = new URL(htmlLink);

			HttpURLConnection http = null;
			try {
				http = (HttpURLConnection) url.openConnection();

				LineNumberReader r = new LineNumberReader(
						new InputStreamReader(http.getInputStream()));
				String s;
				while ((s = r.readLine()) != null) {
					htmlPg.append(new String(s.getBytes("Cp1251"), "UTF-8"));
				}
				r.close();
			} catch (IOException iOException) {
				iOException.printStackTrace();
			} finally {
				if (http != null)
					http.disconnect();
			}

		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		}
		return htmlPg.toString();
	}

}
