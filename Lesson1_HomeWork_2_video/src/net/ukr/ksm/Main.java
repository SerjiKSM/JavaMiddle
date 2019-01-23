package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(NewClass.countClass);
		
		int n = 10;
		while (n-- > 0)
			new NewClass();	

		System.out.println(NewClass.countClass);
	}

}
