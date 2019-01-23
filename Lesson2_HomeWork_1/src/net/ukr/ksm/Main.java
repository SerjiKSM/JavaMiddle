package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		Triangular trian = new Triangular(new Point(1, 1), new Point(-2, 4), new Point(-2, -2));
		trian.Perimetr();
		trian.Area();

		System.out.println("----------------");

		Square kvadr = new Square(new Point(2, 10), new Point(10, 8), new Point(8, 0), new Point(0, 2));
		kvadr.Perimetr();
		kvadr.Area();

		System.out.println("----------------");

		Sphere circle = new Sphere(new Point(10, 5), new Point(7, 9));
		circle.Perimetr();
		circle.Area();

		System.out.println(" ");
		System.out.println("*****************");

		Board all = new Board();
		all.putBoard(circle, 1);
		all.putBoard(kvadr, 0);
		all.putBoard(trian, 3);
		all.info();
		all.deleteShape(0);
	}

}
