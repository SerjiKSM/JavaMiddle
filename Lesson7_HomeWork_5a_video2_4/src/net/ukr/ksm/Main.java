/* Write program what copy some two or three or ..... files in one file
 */

package net.ukr.ksm;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Main {

	public static void main(String[] args) {// throws Exception {

		try {

			String sourceDir = "d:\\Test\\";
			String mergedFile = "d:\\Test2\\mergedfiles.txt";

			File dir = new File(sourceDir);
			File[] files = dir.listFiles();

			ArrayList<String> fileslist = new ArrayList<String>();

			for (int i = 0; i < files.length; i++) {
				if (files[i].isFile())
					fileslist.add(sourceDir + files[i].getName());
			}

			ArrayList<InputStream> inputStreams = new ArrayList<InputStream>();
			FileInputStream filesstream = null;
			for (int i = 0; i < fileslist.size(); i++) {
				filesstream = new FileInputStream(fileslist.get(i));
				inputStreams.add(filesstream);
			}

			Enumeration<InputStream> streamenum = Collections.enumeration(inputStreams);
			SequenceInputStream sstream = new SequenceInputStream(streamenum);

			int b;
			
			try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(mergedFile))) {
				while ((b = sstream.read()) != -1) {
					out.write(b);
			
				}
				System.out.flush();
			} catch (FileNotFoundException ex) {
				System.out.println(ex.getStackTrace());
			} finally {
				sstream.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
