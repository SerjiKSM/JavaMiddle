package net.ukr.ksm;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		try {

			final StudentList studentList = new StudentList();

			studentList.add(new Student("Vova" , "Ivanov", new Date(1986, 1, 1)));
			studentList.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));
			studentList.add(new Student("Serhio", "Ramus", new Date(1980, 5, 20)));
			
			
			int n = studentList.find("Vasya");
			//int n = studentList.find("Vadim");   // Error!
			System.out.println("Vasya born - " + studentList.get(n).getBirth().toString());

			// Delete
			studentList.delete(1);
			
			for (int i = 0; i < 2; i++) {
				System.out.println(studentList.get(i).getSurname().toString());
			}
			
		} catch (Exception ex) {
			System.out.println("Error!");
		}

	}

}
