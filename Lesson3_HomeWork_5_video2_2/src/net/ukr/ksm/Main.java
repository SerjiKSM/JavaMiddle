package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		Figures[] arr = new Figures[] {
				new Rectangle("Rectangle", 5, 10),
				new Circle("Circle", 10), 
				new Circle("Circle", 7),
				new Triangle("Triangle", 8, 9)
				};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + " square: " + arr[i].getSquare());
		}
		

	}

}
