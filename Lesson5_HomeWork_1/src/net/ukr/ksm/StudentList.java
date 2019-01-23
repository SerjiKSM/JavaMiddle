package net.ukr.ksm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

public class StudentList {
	
	private Student[]list = new Student[100];
	private int p = 0;
	
	public void add(Student s) {
		list[p++] = s;
	}
	
	public Student get(int n) {
		return list[n];
	}	
	
	public int find(String name) {
		for (int i = 0; i < p; i++) {
			if(list[i].getName().equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}
	
	public void addStudentInFile() {

		try (PrintWriter printWriter = new PrintWriter("Students.txt")) {

			SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");

			for (Student student : list) {
				if (student == null)
					continue;

				printWriter.println(student.getSurname() + " "
						+ student.getName() + " "
						+ DATE_FORMAT.format(student.getBirth()));
			}

		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}
	}
	
	public void readStudent(){
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Students.txt"))) {
			String str = "";
			for (; (str = bufferedReader.readLine()) != null;)
				System.out.println(str);
		} catch (IOException e) {
			System.out.println("ERROR");
		}
		
	}
	
}
