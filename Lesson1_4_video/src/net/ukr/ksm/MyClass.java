package net.ukr.ksm;

public class MyClass {

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.add(10);
		calc.subtraction(2);
		System.out.println("Result: " + calc.getValue());
		
		calc = new Calc();
		calc.add(5);
		calc.multiply(5);
		System.out.println("Result: " + calc.getValue());

	}

}
