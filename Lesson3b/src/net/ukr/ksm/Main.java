package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		// ������ ��������� ����������
		
		int a = 3;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("������� �� ����");
		} 
		finally {
			System.out.println("�� ��������� ��� ����� ��������");
		}
		System.out.println("����� ���������");

	}
}
