// 3. Napisat proekt, "Virtyalnaya faylovaya sistema". Kazduy katalog i fayl predstavlen odnim obektom (Directory/File);
// dolznu podderzuvatsa svyazi mezdy obyektami; vsya failovaya stryctyra hranitsa v odnom fayle
// Obespechit bazovue fynkczii dlya rabotu s faylovoy sistemoy: dobavlenie i ydalenie faylov i katalogov

package net.ukr.ksm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainFileSystem {

	static MyDirectory mDir;
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static MyFile copyFile;
	static MyDirectory copyDirectory;

	public static void menu() {
		if (mDir == null) {
			MyDirectory mainDir = new MyDirectory();
			mDir = mainDir;
		}

		System.out.println("//" + mDir.getPath());

		String it = "";
		try {
			it = bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] input = it.split(" ");

		switch (input[0]) {
		case "info":
			info();
			break;

		case "dir":
			dir();
			break;

		case "exit":
			exit();
			break;

		case "in":
			in(input);
			break;

		case "cd":
			cd();
			break;

		case "creat_file":
			creatFile();
			break;

		case "creat_directory":
			creatDerictory();
			break;

		case "load":
			load();
			break;

		case "open":
			open(input);
			break;

		case "copy":
			copy(input);
			break;

		case "paste":
			paste();
			break;

		case "delete":
			delete(input);
			break;

		case "search":
			search(input);
			break;

		default:
			System.err.println("введены некоректные данные");
			menu();
			break;
		}
	}

	public static void info() {
		System.out.println("Системные команды:");
		System.out.println("dir - посмотреть перечень каталога");
		System.out.println("exit - сохраниться и выйти");
		System.out.println("load - загрузиться");
		System.out.println("in 'каталог' - зайти в каталог");
		System.out.println("cd - каталог вверх");
		System.out.println("creat_file - создать файл");
		System.out.println("creat_directory - создать каталог");
		System.out.println("delete 'файл/каталог'- удалить файл или каталог");
		System.out.println("copy 'файл/каталог' - скопировать файл или каталог");
		System.out.println("paste - вставить скопированное");
		System.out.println("open 'файл' - открыть файл");
		System.out.println("search 'файл' - найти файл");
		menu();
	}

	public static void dir() {
		mDir.dir();
		menu();
	}

	public static void in(String[] input) {
		if (input.length < 2)
			System.err.println("введите имя каталога");
		else {
			mDir = mDir.in(input[1]);
			mDir.dir();
		}
		menu();
	}

	public static void cd() {
		if (mDir.mDir != null)
			mDir = mDir.mDir;
		menu();
	}

	public static void open(String[] input) {
		if (input.length < 2)
			System.err.println("введите имя файла");
		else
			mDir.open(input[1] + ".file");

		try {
			Thread.sleep(5000); // почему-то без этого на слабой машине JFrame
								// зависает
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		menu();
	}

	public static void creatFile() {
		System.out.println("введите имя файла (одним словом)");
		try {
			String input = bf.readLine();
			new MyFile(input, mDir);
		} catch (IOException e) {
			e.printStackTrace();
		}
		menu();
	}

	public static void creatDerictory() {
		System.out.println("введите имя каталога (одним словом)");
		try {
			String input = bf.readLine();
			new MyDirectory(input, mDir);
		} catch (IOException e) {
			e.printStackTrace();
		}
		menu();
	}

	public static void load() {
		File file = new File("FileSystem.out");
		if (!file.isFile())
			System.err.println("файла не существует");
		else
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FileSystem.out"))) {
				mDir = (MyDirectory) ois.readObject();
				System.out.println("файл загружен");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		mDir.dir();
		menu();
	}

	public static void copy(String[] input) {
		if (input.length < 2)
			System.err.println("введите имя файла");
		else
			mDir.copy(input[1]);
		menu();
	}

	public static void paste() {
		if (copyFile != null) {
			MyFile f = new MyFile(copyFile.getName(), mDir);
			f.copyData(copyFile.getData());
			copyFile = null;
		} else if (copyDirectory != null) {
			MyDirectory dr = new MyDirectory(copyDirectory.getName(), mDir);
			copyDirectory.paste(dr);
			copyDirectory = null;
		} else
			System.err.println("файл не выбран");
		mDir.dir();
		menu();
	}

	public static void delete(String[] input) {
		if (input.length < 2)
			System.err.println("введите имя файла");
		else
			mDir.delete(input[1]);
		menu();
	}

	public static void search(String[] input) {
		if (input.length < 2)
			System.err.println("введите имя файла");
		else
			while (mDir.mDir != null) {
				mDir = mDir.mDir;
			}

		mDir = mDir.search(input[1]).mDir;
		mDir.dir();
		menu();
	}

	public static void exit() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FileSystem.out"))) {
			oos.writeObject(mDir);
			System.out.println("файл сохранён");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}

	public static void main(String[] args) {
		System.out.println("Type 'info' to see a list of system commands");
		menu();

	}

}
