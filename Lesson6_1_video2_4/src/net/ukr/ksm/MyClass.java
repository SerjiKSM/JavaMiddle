package net.ukr.ksm;

import java.io.File;



public class MyClass {
   public static void main(String[] args) {
	   
	   try {
		   
		File f = new File("d:\\Test");
		
		String[] list1 = f.list();
		
		File[] list2 = f.listFiles();
		
		for (String s : list1) {
			System.out.println(s);
		}
		
		System.out.println("/////////////////////////////////////////////");
		
		for (File t : list2) {
			System.out.println(t.getCanonicalPath());
		}
		
		
		//list2[0].delete(); // delete file
		
		long sz = list2[1].length(); // size file
		
		long date = f.lastModified();
		boolean b = f.isDirectory();
		
		new File("d:\\Test").mkdir(); //creat folder
		new File("d:\\Test\\1\\2").mkdirs(); //creat folder in folder
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	   
	   
	   System.out.println("");
	   
   }
}