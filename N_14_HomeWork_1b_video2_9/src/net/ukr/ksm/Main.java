/*
 * 2.Skachat vse HTML files, dostypnue po ssulkam v otdelnuy katalog 
 * 
 * */

package net.ukr.ksm;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		//List<String> list = HTMLExperiments.getHtmlLinks("http://www.gismeteo.ua");
		List<String> list = HTMLExperiments.getHtmlLinks("http://prog.kiev.ua");
		
		for (String str : list)
			System.out.println(str);
	}

}
