package net.ukr.ksm;

import java.io.Serializable;
import java.util.ArrayList;

public class MyDirectory implements Serializable {

	private String name;
	private ArrayList<MyFile> fileList = new ArrayList<MyFile>();
	private ArrayList<MyDirectory> directoryList = new ArrayList<MyDirectory>();
	MyDirectory mDir;

	public MyDirectory(String name, MyDirectory mDir) {
		this.name = name;
		this.mDir = mDir;
		mDir.addDirectory(this);
	}

	public MyDirectory() {
		name = "mainDirectory";
	}

	public void addFile(MyFile file) {
		for (MyFile f : fileList)
			if (f.getName().equals(file.getName())) {
				System.err.println("файл с таким именем уже существует");
				return;
			}
		fileList.add(file);
		System.out.println("файл успешно создан");
	}

	public void addDirectory(MyDirectory dir) {
		for (MyDirectory dr : directoryList)
			if (dr.getName().equals(dir.getName())) {
				System.err.println("каталог с таким именем уже существует");
				return;
			}
		directoryList.add(dir);
		System.out.println("каталог успешно создан");
	}

	public String getName() {
		return name;
	}

	public String getPath() {
		StringBuilder directory = new StringBuilder();

		if (mDir == null)
			return directory.toString();
		else if (mDir.mDir != null)
			directory.append(mDir.getPath() + "/");

		directory.append(getName());
		return directory.toString();
	}

	public void dir() {
		System.out.println(this.toString());
	}

	public MyDirectory in(String input) {
		for (MyDirectory dir : directoryList) {
			if (dir.getName().equals(input)) {
				return dir;
			}
		}
		System.out.println("некоректный ввод");
		return this;
	}

	public MyDirectory cd() {
		return mDir;
	}

	public void open(String input) {
		for (MyFile f : fileList)
			if (input.equals(f.getName())) {
				f.add();
				return;
			}
		System.err.println("некоректное имя файла");
	}

	public void copy(String input) {
		for (MyFile f : fileList)
			if (f.getName().equals(input + ".file")) {
				MainFileSystem.copyFile = f;
				System.out.println("наберите 'paste' для вставки файла");
				break;
			}

		if (MainFileSystem.copyFile == null)
			for (MyDirectory dr : directoryList) {
				if (dr.getName().equals(input)) {
					MainFileSystem.copyDirectory = dr;
					System.out.println("наберите 'paste' для вставки каталога");
					break;
				}
			}
		if (MainFileSystem.copyFile == null
				&& MainFileSystem.copyDirectory == null)
			System.err.println("некоректное имя файла");
	}

	public void paste(MyDirectory md) {
		if (!fileList.isEmpty())
			for (MyFile f : fileList) {
				MyFile mf = new MyFile(f.getName(), md);
				mf.copyData(f.getData());
			}

		if (!directoryList.isEmpty())
			for (MyDirectory dr : directoryList) {
				MyDirectory mdr = new MyDirectory(dr.getName(), md);
				dr.paste(mdr);
			}
	}

	public void delete(String input) {
		int index = -1;
		for (MyFile f : fileList)
			if (f.getName().equals(input + ".file"))
				index = fileList.indexOf(f);

		if (index >= 0) {
			fileList.remove(index);
			System.out.println("файл " + input + ".file успешно удалён");
		} else
			for (MyDirectory dr : directoryList)
				if (dr.getName().equals(input))
					index = directoryList.indexOf(dr);

		if (index >= 0) {
			directoryList.remove(index);
			System.out.println("каталог " + input + " успешно удалён");
		} else
			System.err.println("файла с таким именем не сушествует");
	}

	public MyFile search(String input) {
		for (MyFile f : fileList)
			if (f.getName().equals(input + ".file")) {
				System.out.println("файл найден");
				return f;

			}

		for (MyDirectory dr : directoryList)
			return dr.search(input);

		System.err.println("файл не найден");
		return null;
	}

	@Override
	public String toString() {
		StringBuilder file = new StringBuilder("Files: ");
		StringBuilder directory = new StringBuilder("Directory: ");

		for (MyFile f : fileList)
			file.append(f.getName() + "; ");

		for (MyDirectory dir : directoryList)
			directory.append(dir.getName() + "; ");

		return file + "\n" + directory;
	}

}
