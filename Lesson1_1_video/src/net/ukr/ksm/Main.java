package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Rectangle.NAME);
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3, 2);
		
		System.out.println("Rectangle1: " + r1.getHeight() + " x " + r1.getWidth());
		System.out.println("Rectangle2: " + r2.getHeight() + " x " + r2.getWidth());

		r2.setHeight(22);
		r2.setWidth(33);
		//r2.width = 100; // ошибка ---потому что объ€влена как через private
		System.out.println("Rectangle2: " + r2.getHeight() + " x " + r2.getWidth());
		
		Rectangle r3 = Rectangle.combine(r1, r2);
		System.out.println("Rectangle3: " + r3.getHeight() + " x " + r3.getWidth());
				
	}

}
