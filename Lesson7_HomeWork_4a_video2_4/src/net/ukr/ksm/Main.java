/* Write program what create text file and write there list files (path, name, date create) from directory
 */

package net.ukr.ksm;

import java.io.*;

public class Main {

	//static byte[] byteSeparator;
	
	public static void main(String[] args) {

		creatFile("d:\\Test", "d:\\Test2\\inform.txt");
		
	}
	
	static void creatFile(String FileSource, String newFile){
		
		byte[] byteSeparatorTab = (String.valueOf('\t')).getBytes();
		byte[] byteSeparatorEnter = (String.valueOf('\n')).getBytes();
		
		try {
			
			FileOutputStream os = new FileOutputStream(new File(newFile));
			BufferedOutputStream bos = new BufferedOutputStream(os);
			try {
				File sdir = new File(FileSource);
				File[] sfile = sdir.listFiles();
								
				for (File f : sfile) {
					
					String text = f.getName() + " " + f.getPath() + " " + new java.util.Date(f.lastModified()) ;
					//String textSpace = " ";
					byte[] buff = text.getBytes();
					//byte[] buff2 = textSpace.getBytes();
					//bos.write(byteSeparatorEnter);
					bos.write(buff);
					//bos.write(buff2);
					bos.write(byteSeparatorEnter);
					bos.write(byteSeparatorTab);
										
				}
											
			} finally {
				bos.close();
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		
	}

	
}
