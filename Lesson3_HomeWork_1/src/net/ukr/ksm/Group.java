package net.ukr.ksm;

import java.util.Arrays;
import java.util.Scanner;

public class Group {

	private Student[] group = new Student[3];

	Scanner in = new Scanner(System.in);

	public void listStudent() throws MyException {
		int count = 0;
		for (int i = 0; i < group.length; i++) {

			System.out.println("Add new student?");
			Boolean danet = in.nextBoolean();

			if (danet == true) {

				System.out.println("What is your name?");
				String l_name = in.next();
				System.out.println("What is your middle name?");
				String l_middleName = in.next();
				System.out.println("What is your last name?");
				String l_lastName = in.next();
				System.out.println("How old are?");
				String l_age = in.next();
				System.out.println("Who are you: men or women?");
				Boolean l_sex = in.nextBoolean();
				System.out.println("What is your university?");
				String l_university = in.next();
				System.out.println("What is your course?");
				String l_course = in.next();
				System.out.println("What is your group?");
				String l_group = in.next();
				System.out.println("What is your specialty?");
				String l_specialty = in.next();

				group[i] = new Student(l_name, l_middleName, l_lastName,
						Integer.parseInt(l_age), l_sex, l_university,
						Integer.parseInt(l_course), l_group, l_specialty); // Boolean.getBoolean(l_sex)
				count++;

			} else if (danet == false) {
				/*
				 * for (int j = 0; j < group.length; j++) { try {
				 * //Arrays.sort(group); group[j].info(); } catch
				 * (NullPointerException e) {
				 * System.out.println("Not all student"); }
				 * 
				 * }
				 */
			}

		}

		in.close();

		for (int i = 0; i < group.length; i++) {

			try {
				//Arrays.sort(group);
				group[i].info();
			} catch (NullPointerException e) {
				System.out.println("Not all student");
			}
		}

	}

	public void search(String second_name) {
		try {
			for (int i = 0; i < group.length; i++) {
				if (group[i].getMiddleName().equals(second_name)) {
					System.out.println(group[i].getMiddleName());
					group[i].info();
				}
			}
		} catch (NullPointerException e) {
			System.out.println("But you don't add all student");

		}
	}
}
