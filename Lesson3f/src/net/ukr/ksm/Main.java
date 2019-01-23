package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		try {
			System.out.println(sum(3, 4));
			System.out.println(sum(5, 6));
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

	static int sum(int a, int b) throws MyException {
		if (a == 5)	throw new MyException();
		return a + b;
	}

}
