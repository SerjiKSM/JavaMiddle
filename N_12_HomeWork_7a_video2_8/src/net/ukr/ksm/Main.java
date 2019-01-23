/*
Write program "DataBaseUser" with method "add, delete, find, out information" about user his id 
 */

package net.ukr.ksm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Main {

	private static class Person implements Serializable {
		private static final long serialVersionUID = 1L;

		public String name;
		public int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	private static class Database implements Serializable {
		private static final long serialVersionUID = 1L;

		private int index;
		private HashMap<Integer, Person> map = new HashMap<Integer, Person>();

		public Database() {
			index = 0;
		}

		public int add(Person p) {
			map.put(index, p);
			return index++;
		}

		public Person get(int index) {
			return map.get(index);
		}

		public boolean delete(int index) {
			return map.remove(index) != null;
		}

		public void save(String file) throws IOException {
			FileOutputStream fo = new FileOutputStream(file);
			try {
				ObjectOutputStream oo = new ObjectOutputStream(fo);
				try {
					oo.writeObject(this);
				} finally {
					oo.close();
				}
			} finally {
				fo.flush();
				fo.close();
			}
		}

		public static Database load(String file) throws Exception {
			File f = new File(file);
			if (!f.exists())
				return new Database();

			FileInputStream fi = new FileInputStream(f);
			try {
				ObjectInputStream oi = new ObjectInputStream(fi);
				try {
					return (Database) oi.readObject();
				} finally {
					oi.close();
				}
			} finally {
				fi.close();
			}
		}
	}

	public static void main(String[] args) {

		final String file = "database.db";

		try {
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			Person p;
			int index;

			Database db = Database.load(file);

			try {
				while (true) {
					System.out.println("�������:");
					System.out.println("1 - ��� ���������� ������������");
					System.out.println("2 - ��� ��������");
					System.out.println("3 - ��� ������");
					System.out.println("4 - ��� ������ ����������");
					System.out.println("���-�� ������ ��� ������");

					String s = d.readLine();
					int ch = Integer.parseInt(s);

					switch (ch) {
					case 1:
						System.out.println("������� ��� ������������:");
						String name = d.readLine();
						System.out.println("������� ������� ������������:");
						s = d.readLine();

						int age = Integer.parseInt(s);

						int id = db.add(new Person(name, age));

						System.out.println("������������ �������� � ID = " + id);

						break;
					case 2:
						System.out.println("������� ID ������������:");
						s = d.readLine();
						index = Integer.parseInt(s);

						if (!db.delete(index))
							System.out.println("��� ������ ������������!");
						else
							System.out.println("OK!");

						break;
					case 3:
						System.out.println("������� ID ������������:");
						s = d.readLine();
						index = Integer.parseInt(s);

						p = db.get(index);
						if (p != null)
							System.out.println("���� ����� ������������!");
						else
							System.out.println("��� ������ ������������!");

						break;
					case 4:
						System.out.println("������� ID ������������:");
						s = d.readLine();
						index = Integer.parseInt(s);

						p = db.get(index);
						if (p == null)
							System.out.println("��� ������ ������������!");
						else
							System.out.println("����: " + p.name + ", " + p.age);

						break;
					default:
						return;
					}
				}
			} finally {
				db.save(file);
			}
		} catch (Exception ex) {
			;
		}

	}

}
