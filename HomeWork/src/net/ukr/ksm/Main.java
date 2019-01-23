// �������������� ������ ������� ��������� ���, �����
// 1) ������ �������� � ����������
// 2) ���� ����������� ������� �������� �� ������
// 3) ��� �������� ������������ ������ (������ ���, ������������ ����) ��������� ������ ����������
// � ������������ ��� � ������� �����. ��������� �� �����.

package net.ukr.ksm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		StudentList sl = new StudentList();
		System.out.println("��������� ������ ���������.");

		System.out.println("��� �������� ������ �������� ������� \"Enter\"");
		System.out.println("��� ���������� co������ ������ ������� \"Exit\"");

		while (!scan.nextLine().equals("Exit")) {

			System.out.println("���");
			String name = scan.nextLine();
			while (true) {
				if (name.length() == 0) {
					System.out.println("�� �� ����� ���! ������� �����!");
					name = scan.nextLine();
					
				} else {
					sl.add(new Student(name, null, null));
					break;
				}
			}
			/*
			System.out.println("�������");
			String surname = scan.nextLine();

			while (true) {
				if (surname.length() == 0) {
					System.out.println("�� �� ����� �������! ������� �����!");
					surname = scan.nextLine();
				} else {
					break;
				}
			}
*/
			/*
			while (true) {
				try {
					System.out.println("���� �������� � ������� ����.��.��");
					String birth = scan.nextLine();
					Date birthday = sdf.parse(birth);

					//sl.add(new Student(name, surname, birthday));
					//sl.add(new Student(name, null, birthday));
					break;

				} catch (ParseException e) {
					System.out.println("�������� ����");
				}
			}*/
			
		}
/*
		System.out.println("������� ���, ����� ����� ���� ��������");
		int n = sl.find(scan.nextLine());
		if (n == -1) {
			System.out.println("�������� ������!");
		} else {
			System.out.println(sl.get(n).getBirth().toString());
		}

		System.out.println("������� �������, ����� ����� ���");
		int sn = sl.findSurname(scan.nextLine());
		if (n == -1) {
			System.out.println("�������� ������!");
		} else {
			System.out.println(sl.get(sn).getName());
		}

		try {
			System.out
					.println("������� ���� ��������, ����� ����� ��� � �������");
			int db = sl.findBirth(sdf.parse(scan.nextLine()));
			System.out.println(sl.get(db).getName() + " "
					+ sl.get(db).getSurname());
		} catch (ParseException e) {
			System.out.println("�������� ����");
		}

		sl.printList();
*/
		System.out.println("������� ���������� �����, ����� ������� �� ������");
		String num = scan.nextLine();
		if (num.length() == 0) {
			System.out.println("�������� ������!");
		} else {
			sl.deleteNumber(Integer.parseInt(num));
		}

		sl.printList();
	}

}
