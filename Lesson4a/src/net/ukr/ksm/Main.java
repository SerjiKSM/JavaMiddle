// ���������� ���������� ����� �������� �� ������ ������������ ������

package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		Num2 a = new Num2();
		System.out.println(a.plus(3.4, 5.6));
		
		Arithmetic b = a;   // ���������� ���������� ��������� �� ������� ������������ �� ������
		Info c = a;
		
		System.out.println(b.plus(56, 34)); // ������������� ������� � ������� ���������� ����������

		c.printinfo();
		
	}

}
