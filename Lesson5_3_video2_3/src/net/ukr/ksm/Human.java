package net.ukr.ksm;

//public class Human implements Comparable {
public class Human {
	private int age;

	/**
	 * @param age
	 */
	public Human(int age) {
		super();
		this.age = age;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/*
	// ������� 1 ���� � ��� ���� ������ �  ���������� ��������
	// ��� ���������� � ����� ������ ����� ������ � ������ Main ���������� ��
	// ����������
	@Override
	public int compareTo(Object another) {

		Human h = (Human) another; // Object another �������� � ���� (Human) another

		if (age < h.age)
			return -1;
		else if (age == h.age)
			return 0;
		else if (age > h.age)
			return 1;
		else
			return 0;
	}
*/
}
