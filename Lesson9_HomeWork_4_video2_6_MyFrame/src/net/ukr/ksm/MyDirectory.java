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
				System.err.println("���� � ����� ������ ��� ����������");
				return;
			}
		fileList.add(file);
		System.out.println("���� ������� ������");
	}

	public void addDirectory(MyDirectory dir) {
		for (MyDirectory dr : directoryList)
			if (dr.getName().equals(dir.getName())) {
				System.err.println("������� � ����� ������ ��� ����������");
				return;
			}
		directoryList.add(dir);
		System.out.println("������� ������� ������");
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
		System.out.println("����������� ����");
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
		System.err.println("����������� ��� �����");
	}

	public void copy(String input) {
		for (MyFile f : fileList)
			if (f.getName().equals(input + ".file")) {
				MainFileSystem.copyFile = f;
				System.out.println("�������� 'paste' ��� ������� �����");
				break;
			}

		if (MainFileSystem.copyFile == null)
			for (MyDirectory dr : directoryList) {
				if (dr.getName().equals(input)) {
					MainFileSystem.copyDirectory = dr;
					System.out.println("�������� 'paste' ��� ������� ��������");
					break;
				}
			}
		if (MainFileSystem.copyFile == null
				&& MainFileSystem.copyDirectory == null)
			System.err.println("����������� ��� �����");
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
			System.out.println("���� " + input + ".file ������� �����");
		} else
			for (MyDirectory dr : directoryList)
				if (dr.getName().equals(input))
					index = directoryList.indexOf(dr);

		if (index >= 0) {
			directoryList.remove(index);
			System.out.println("������� " + input + " ������� �����");
		} else
			System.err.println("����� � ����� ������ �� ����������");
	}

	public MyFile search(String input) {
		for (MyFile f : fileList)
			if (f.getName().equals(input + ".file")) {
				System.out.println("���� ������");
				return f;

			}

		for (MyDirectory dr : directoryList)
			return dr.search(input);

		System.err.println("���� �� ������");
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
