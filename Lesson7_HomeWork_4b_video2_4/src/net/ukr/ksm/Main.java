/* Write program what create text file and write there list files (path, name, date create) from directory
 */

package net.ukr.ksm;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String sourceFolder = "d:\\Test\\";

		try {
			findFiles(sourceFolder, list);
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}

		String fileName = new SimpleDateFormat("yyyyMMdd").format(new Date());
		try (PrintWriter outfile = new PrintWriter(new File(sourceFolder,
				"files" + fileName + ".txt"))) {
			for (String s : list) {
				Path temp = Paths.get(s);
				outfile.println(temp.getParent());
				outfile.println(temp.getFileName());
				BasicFileAttributes attr = Files.readAttributes(temp,
						BasicFileAttributes.class);
				outfile.println(attr.creationTime());
				outfile.println("------<File>-------");
			}
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
		}
	}

	private static void findFiles(String srcPath, ArrayList<String> list) throws IOException {
		File dir = new File(srcPath);
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile())
				list.add(srcPath + files[i].getName());
		}

	}

}
