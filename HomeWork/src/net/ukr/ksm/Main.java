// Модифицировать проект «Список студентов» так, чтобы
// 1) список вводился с клавиатуры
// 2) была возможность удалять студента по номеру
// 3) при введении неправильных данных (пустое имя, неправильная дата) программа кидала исключение
// и обрабатывала его с выводом соотв. сообщений на экран.

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
		System.out.println("Заполните данные студентов.");

		System.out.println("Для создания нового студента введите \"Enter\"");
		System.out.println("Для завершения coздания списка введите \"Exit\"");

		while (!scan.nextLine().equals("Exit")) {

			System.out.println("Имя");
			String name = scan.nextLine();
			while (true) {
				if (name.length() == 0) {
					System.out.println("Вы не ввели имя! Введите снова!");
					name = scan.nextLine();
					
				} else {
					sl.add(new Student(name, null, null));
					break;
				}
			}
			/*
			System.out.println("Фамилия");
			String surname = scan.nextLine();

			while (true) {
				if (surname.length() == 0) {
					System.out.println("Вы не ввели фамилию! Введите снова!");
					surname = scan.nextLine();
				} else {
					break;
				}
			}
*/
			/*
			while (true) {
				try {
					System.out.println("Дата рождения в формате гггг.мм.дд");
					String birth = scan.nextLine();
					Date birthday = sdf.parse(birth);

					//sl.add(new Student(name, surname, birthday));
					//sl.add(new Student(name, null, birthday));
					break;

				} catch (ParseException e) {
					System.out.println("Неверная дата");
				}
			}*/
			
		}
/*
		System.out.println("Введите имя, чтобы найти дату рождения");
		int n = sl.find(scan.nextLine());
		if (n == -1) {
			System.out.println("Неверные данные!");
		} else {
			System.out.println(sl.get(n).getBirth().toString());
		}

		System.out.println("Введите фамилию, чтобы найти имя");
		int sn = sl.findSurname(scan.nextLine());
		if (n == -1) {
			System.out.println("Неверные данные!");
		} else {
			System.out.println(sl.get(sn).getName());
		}

		try {
			System.out
					.println("Введите дату рождения, чтобы найти имя и фамилию");
			int db = sl.findBirth(sdf.parse(scan.nextLine()));
			System.out.println(sl.get(db).getName() + " "
					+ sl.get(db).getSurname());
		} catch (ParseException e) {
			System.out.println("Неверная дата");
		}

		sl.printList();
*/
		System.out.println("Введите порядковый номер, чтобы удалить из списка");
		String num = scan.nextLine();
		if (num.length() == 0) {
			System.out.println("Неверные данные!");
		} else {
			sl.deleteNumber(Integer.parseInt(num));
		}

		sl.printList();
	}

}
