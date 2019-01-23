// �������� ������ ���������

package net.ukr.ksm;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		// public static int parseInt(String s) throws NumberFormatException

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("������� ����� ����� �����: ");
			String s = scan.nextLine();
			int n = Integer.parseInt(s);
			System.out.println("�� ����� ��� �����: " + n);
		} catch (NumberFormatException e) {
			System.out
					.println("�� ����� ������������ �����! ���������� ��� ���!");
		}

		// public int nextInt() throws InputMismatchException
		// public char charAt(int index) throws IndexOutOfBoundsException

		try {
			System.out.println("������� ����� �����: ");
			String word = scan.nextLine();
			System.out.println("� ����� �� ����� ����� ������ ����?");
			int num = scan.nextInt() - 1;
			System.out.println("�������� ������ �� ����� \"" + word.charAt(num)
					+ "\"");
		} catch (IndexOutOfBoundsException | InputMismatchException ex) {
			System.out.println("�� ����� ������������ �����!");
		}

		// public boolean after(Date when) throws NullPointerException

		Date today = new Date();
		Date once = null;
		System.out.println("������� ����� ������� ����, ��� �������? ");
		try {
			System.out.println(today.after(once));
		} catch (NullPointerException e) {
			System.out.println("������ ���� �� �������!");
		}

		// nextInt(int bound) throws IllegalArgumentException

		Random r = new Random();
		try {
			System.out
					.println("������� ������������ ������������� ����� ��� ����������� ���������� �����: ");
			int n = r.nextInt(scan.nextInt());
			System.out.println("��������� �����: " + n);
		} catch (IllegalArgumentException | InputMismatchException e) {
			System.out.println("�� ����� ������������ �����!");
		}

		// public static Object get(Object array, int index)
		// throws NullPointerException, IllegalArgumentException,
		// ArrayIndexOutOfBoundsException

		String[] array = new String[] { "��������", "���������", "�������",
				"���������" };
		int index = 3;
		// �������� ���� ��� ����� ���������:
		// ������� 1 (������������� ������ ����)
		// array = null;

		// ������� 2 (� ������ get ��������� array2 � ������������� ������ ����)
		// String array2 = "��-��!";

		// ������� 3 (������������� ������ ����)
		// index = 4;
		try {
			System.out.println(Array.get(array, index));
		} catch (NullPointerException | IllegalArgumentException
				| ArrayIndexOutOfBoundsException e) {
			System.out
					.println("�����, ���������, �� ������ � �������� ���-�� �� ��!");
		}
	}
}
