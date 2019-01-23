// Создать список фигур. Реализовать сортировку списка по возрастанию площади фигуры

package net.ukr.ksm;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*
		Figures[] arr = new Figures[] {
				new Rectangle("Rectangle", 5, 10),
				new Circle("Circle", 10), 
				new Circle("Circle", 7),
				new Triangle("Triangle", 8, 9)
				};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + " square: " + arr[i].getSquare());
		}
		*/
		
		Figures[] list = new Figures[] { new Circle("Circle1", 10), 
										 new Rectangle("Rectangle", 5, 10),
										 new Circle("Circle2", 7), 
										 new Circle("Circle3", 4), 
										 new Triangle("Triangle", 8, 9), };
		// Variant 1
		//Arrays.sort(list);
		
		// Variant 2
		Arrays.sort(list, new FiguresComparator()); // sort VOZRASTANIE
		//Arrays.sort(list, new FiguresComparator().reversed()); // sort UBUVANIE
		
		for (Figures h : list) {
			System.out.println(h.getName() + " square " +  h.getSquare());
		}
	}

}
