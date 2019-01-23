package net.ukr.ksm;

import java.util.Date;

public class StudentList {

	//private Student[] list = new Student[100];
	private Student[] list = new Student[4];
	private int p = 0;

	public void add(Student s) {
		if (p == list.length - 1) {
			Student[] t = new Student[list.length * 2];

			for (int i = 0; i < list.length; i++) {
				t[i] = list[i];
			}

			list = t;
		}

		list[p++] = s;

	}

	public Student get(int n) {
		return list[n];
	}

	public int find(String name) {
		for (int i = 0; i < p; i++) {
			if (list[i].getName().equalsIgnoreCase(name))
				return i;
		}

		return -1;
	}

	public int findSurname(String surname) {
		for (int i = 0; i < p; i++) {
			if (list[i].getSurname().equalsIgnoreCase(surname))
				return i;
		}

		return -1;
	}

	public int findBirth(Date birth) {
		for (int i = 0; i < p; i++) {
			if (list[i].getBirth().equals(birth))
				return i;
		}

		return -1;
	}

	public void deleteNumber(int n) {
		n--;
		if (n < 0 || n > list.length) {
			System.out.println("Неверные данные!");
		} else {
			Student[] t = new Student[list.length - 1];
			int k = 0;

			for (int i = 0; i < n; i++) {
				t[k++] = list[i];
			}

			for (int i = n + 1; i < list.length; i++) {
				t[k++] = list[i];
			}
			list = t;
		}
	}

	public void printList() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				sb.append(list[i].getName());
				sb.append(" ");
				sb.append(list[i].getSurname());
				sb.append(" ");
				sb.append(list[i].getBirth());
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}

}
