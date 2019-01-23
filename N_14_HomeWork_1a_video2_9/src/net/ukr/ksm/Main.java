/*
 * Vuvesti na ekran vse ssulki kotorue soderzatsya v scachenom HTML documente 
 * 
 * */

package net.ukr.ksm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		WebReferences webReferences = new WebReferences();

		final String html = webReferences.getHTML("http://prog.kiev.ua");

		final List<String> list = new ArrayList<String>();
		webReferences.extractURLs(html, list);

		for (String s : list)
			System.out.println(s);
	}

}
