package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		Triangular triangular = new Triangular();

		triangular.a = 3;
		triangular.b = 4;
		triangular.c = 5;
		
		Shape shape = triangular;  // ���������� ���������� ������������ ������  ������� ������������ ��� ������
		
		System.out.println(shape.Square());  
		
		// �������� ����� ���������� ����� ������ ������ � ������������� ���������� �������
	}

}
