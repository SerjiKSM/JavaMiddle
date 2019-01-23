/*
 * 2.Skachat vse HTML files, dostypnue po ssulkam v otdelnuy katalog 
 * 
 * */

package net.ukr.ksm;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws UnknownHostException, IOException  {
		
		//String temp = HrefLoader.htmlLoad("http://rutor.org/");
		String temp = HrefLoader.htmlLoad("http://prog.kiev.ua");
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(temp);
		
		HrefLoader.getURLs(temp, list);
		String path;
		for(int i=0;i<list.size();i++) {
			path = list.get(i);
			System.out.println(path);
			HrefLoader.Save(HrefLoader.htmlLoad(path), 
					"d:\\test\\"+path.replace("http://", "").replace("/", "_")+".html");
			
		}
		
	}

}
