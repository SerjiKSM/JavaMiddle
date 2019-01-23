package net.ukr.ksm;

import java.io.Serializable;

public class MyFile implements Serializable {

	private String name, data;
	MyDirectory mDir;

	public MyFile(String name, MyDirectory mDir) {
		if (name.endsWith(".file"))
			this.name = name;
		else
			this.name = name + ".file";
		this.mDir = mDir;

		mDir.addFile(this);
	}

	public String getName() {
		return name;
	}

	public String getPath() {
		StringBuilder directory = new StringBuilder();

		if (mDir.getName() != "mainDirectory")
			directory.append(mDir.getPath() + "/");
		directory.append(getName());
		return directory.toString();
	}

	public void add() {
		new MyFrame(data, this);
	}

	public void setDat(String input) {
		data = input;
	}

	public void copyData(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

}
