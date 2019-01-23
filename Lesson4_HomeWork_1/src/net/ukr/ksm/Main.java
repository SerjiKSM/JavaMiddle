package net.ukr.ksm;

//import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Bug[] bug = new Bug[3];
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	
		int count = 0;
		boolean daNet = true;

		while (daNet & count < 3) {
			//daNet = false;	
			
			System.out.println("Add new Bug?");
			Boolean danet = scanner.nextBoolean();

			if (daNet == danet) {
				System.out.println("What is your name?");
				String name = scanner.next();
				System.out.println("What is size?");
				int razmer = scanner.nextInt();
				System.out.println("What is color?");
				String color = scanner.next();
			
				bug[count] = new Bug(name, razmer, color);
								
				count++;
			} else {
				daNet = false;
			}

		}

		for (int i = 0; i < count; i++) {
			bug[i].print();
		}
		
	}

}
