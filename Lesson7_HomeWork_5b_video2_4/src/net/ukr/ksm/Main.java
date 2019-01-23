/* Write program what copy some two or three or ..... files in one file
 */

package net.ukr.ksm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

	private static void findFiles(String srcPath, ArrayList<String> list) throws IOException {
		File dir = new File(srcPath);
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile())
				list.add(srcPath + files[i].getName());
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String sourceFolder = "d:\\Test\\";
		String targetFile = "d:\\Test2\\temp.txt";

		try {
			findFiles(sourceFolder, list);
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}

		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(targetFile))) {
			for (String s : list) {
				writer.write(Paths.get(s).getFileName() + ":");
				writer.newLine();
				try (BufferedReader reader = Files.newBufferedReader(Paths.get(s))) {
					String line = null;
					while ((line = reader.readLine()) != null) {
						writer.write(line, 0, line.length());
						writer.newLine();
					}
				} catch (IOException x) {
					System.err.format("IOException: %s%n", x);
				}
			}
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}
	}

}
