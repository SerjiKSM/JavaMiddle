// 3. Napisat programmy, kotoraya zaprosit vvestu s konsoly infirmation o 10 people, zapishet eyo   
// na disk, a pri sledyyshchem starte prochitaet zapisi i vuvedet sohranennue dannue na ekran.
//Odinakovue zapisi dolznu ignorirovatsya(Set + equals*). 

package net.ukr.ksm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		dispatcher();
	}

	/**
	 * Константы для хранения пути к файлу и кол. программистов
	 * Konstantu dly hraneniya pyti k fayly i kolichestvo programistov
	 */
	private static String PATH_TO_FILE = "d:\\test\\programmer.dat";
	private static int NUMBERS_PROGRAMMERS = 3;// 10

	/**
	 * Метод для наполнения колекции возвращает Set<Programmer>
	 *Metod dlya napolneniya kolekczii vozvrashchaet Set<Programmer>
	 */
	public static Set<Programmer> getGrupaProgrammer() {
		System.out.println("*****PROGRAMMA DLYA NABORA PROGRAMMISTOV NA KYRSU*****");
		System.out.println("*****POZALYSTO VVEDITE IMYA I VOZRAST, RAZDELYAYA IX ZAPYATOY*****");
		Scanner in = new Scanner(System.in);
		
		Set<Programmer> data = new HashSet<Programmer>();
		
		do {
			String stroka = in.nextLine();
			String[] arr = stroka.split(",");

			String name = arr[0];
			int age = Integer.parseInt(arr[1]);

			Programmer programmer = new Programmer(name, age);
			if (!data.contains(programmer)) {
				data.add(programmer);
			} else {
				System.out.println("**** TAKOY PROGRAMMIST VZE EST*****");
				System.out.println("*****POZALYSTO VVEDITE DRYGOE IMYA I VOZRAST, RAZDELYAYA IX ZAPYATOY*****");
			}

		} while (data.size() < NUMBERS_PROGRAMMERS);
		return data;
	}

	/**
	 * Метод для отображения списка программистов
	 * Metod dly otobrazenia spiska programmistov
	 */
	public static void showProgrammers(Set<Programmer> data) {
		System.out.println("******************RESULT*******************");
		for (Programmer progr : data) {
			System.out.println(progr.getName() + " : " + progr.getAge());
		}
	}

	/**
	 * Метод для сохранения и сериализации данных на диске
	 * Metod dlya soxranenia i serealizacii dannux na diske
	 */
	public static void saveToDiskData(Set<Programmer> data) {
		ObjectOutputStream object = null;
		FileOutputStream fileSaved = null;
		try {
			fileSaved = new FileOutputStream(PATH_TO_FILE);
			object = new ObjectOutputStream(fileSaved);
			object.writeObject(data);
		} catch (Exception e) {
			e.getMessage();
		} finally {
			try {
				fileSaved.close();
				object.close();
			} catch (Exception e2) {
				e2.getMessage();
			}
		}
	}

	/**
	 * Метод для чтения сериализованых данных с диска возвращает Set<Programmer>
	 * Metod dlya chtenia serealizovannux dannux s diska vozvrashchaet Set<Programmer>
	 */
	public static Set<Programmer> readWidthDiskData() {
		ObjectInputStream object = null;
		FileInputStream in = null;
		Set<Programmer> programmer = null;
		try {
			in = new FileInputStream(PATH_TO_FILE);
			object = new ObjectInputStream(in);
			programmer = (Set<Programmer>) object.readObject();

		} catch (Exception e) {
			e.getMessage();
		} finally {
			try {
				in.close();
				object.close();
			} catch (Exception e2) {
				e2.getMessage();
			}
		}
		return programmer;
	}

	/**
	 * Метод для разруливания действий
	 */
	public static void dispatcher() {
		if (new File(PATH_TO_FILE).exists()) {
			if (readWidthDiskData().size() < NUMBERS_PROGRAMMERS) {
				int N = NUMBERS_PROGRAMMERS - readWidthDiskData().size();
				System.out.println("*****NE XVATAET ESHCHO " + N
						+ " PROGRAMMISTOW*****");
				saveToDiskData(getGrupaProgrammer());
			} else {
				showProgrammers(readWidthDiskData());
			}
		} else {
			saveToDiskData(getGrupaProgrammer());
		}
	}

}
