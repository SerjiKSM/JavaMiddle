package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		Rectangel rectangel = new Rectangel(5, 4);
		System.out.println(rectangel.getName() + " " + rectangel.getSquare());

		Circle circle = new Circle(2);
		System.out.println(circle.getName() + " " + circle.getSquare());

		System.out.println("--------------------------------------------");

		Figure[] list = { new Circle(20.0), new Rectangel(10.0, 2.0) };

		for (Figure f : list) {
			StringBuilder sb = new StringBuilder().append(f.getName()).append(" : ").append(f.getSquare());

			System.out.println(sb.toString());
		}

	}

}
