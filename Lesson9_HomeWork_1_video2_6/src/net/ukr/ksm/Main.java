// 1. Napisat klass chelovek. Realizovat ego metodu -- clone, equals, hashCode, toString
// 2. Realizovat vozmoznost serealization dlya klassa "Human"

package net.ukr.ksm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {

		Human tom = new Human(170, 65, "Tomas");
		Human tim;
		try {
			// Clone
			tim = (Human) tom.clone();
			System.out.print(tim.getHeight() + " cm ");
			System.out.print(tim.getWeight() + " kg ");
			System.out.println(tim.getName());

			// Equals
			if (tom.equals(tim)) {
				System.out.println("Equals");
			} else
				System.out.println("Not Equals");

			// HashCode
			int h1 = tim.hashCode();
			int h2 = tom.hashCode();
			System.out.println(h1 + " " + h2);

			// Input new name
			tim.setName("Timati");
			System.out.println("I set new name to object Tim = Timati");

			// HashCode after new name
			h1 = tim.hashCode();
			h2 = tom.hashCode();
			System.out.println(h1 + " " + h2);

			// Save to File
			try (FileOutputStream os = new FileOutputStream("d:\\test\\temp.out");
					ObjectOutputStream oos = new ObjectOutputStream(os);) {
				oos.writeObject(tim);
				oos.writeObject(tom);
			} catch (Exception e) {
			}

			// Return From File
			Human ReturnTim;
			Human ReturnTom;

			FileInputStream is = new FileInputStream("d:\\test\\temp.out");
			ObjectInputStream oos = new ObjectInputStream(is);
			
			ReturnTim = (Human) oos.readObject();
			System.out.println(ReturnTim.getName());
			
			ReturnTom = (Human) oos.readObject();
			System.out.println(ReturnTom.getName());
			
		} catch (CloneNotSupportedException | IOException ee) {
			System.out.print("Can`t clone. Sorry");
		}

	}

}
