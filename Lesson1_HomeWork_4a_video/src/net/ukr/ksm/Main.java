package net.ukr.ksm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		try {

			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd:MM:yy");
			
			
			final StudentList studentList = new StudentList();

			//studentList.add(new Student("Vova" , "Ivanov", new Date(1986, 1, 1)));
			studentList.add(new Student("Vova" , "Ivanov", simpleDateFormat.format(new Date(1983, 1, 1))));
			studentList.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));

			int n = studentList.find("Vasya");
			//int n = studentList.find("Vadim");   // Error!
			System.out.println("Date born - " + studentList.get(n).getBirth().toString());

			int nb = studentList.find("Vova");
			//int n = studentList.find("Vadim");   // Error!
			System.out.println("Date born - " + studentList.get(nb).getBorn().toString());
			
			int sn = studentList.findSurName("Ivanov");
			System.out.println("Find SurName - " + studentList.get(sn).getSurname().toString());
			
			int numStud = studentList.findDateBorn(simpleDateFormat.format(new Date(1983, 1, 1)));
			System.out.println("The student date born - " + studentList.get(numStud).getBorn().toString() +
					" " + studentList.get(numStud).getName().toString() + " " + studentList.get(numStud).getSurname().toString());
			
			
		} catch (Exception ex) {
			System.out.println("Error!");
		}

	}

}
