// Serialization,  DasSerialization

/*
 import java.io.Serializable;

 public class Rectangular implement Serializable, Cloneable{
 private static final long serialVersionUID = 1L; // версия (InvalidClassExeption)
 ....
 public transient int height;
 public int width;
 .....
 }
 */

package net.ukr.ksm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.Box.Filler;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		System.out.println(Rectangle.NAME);
		Rectangle rectangle1 = new Rectangle(3, 2);
		Rectangle rectangle2 = new Rectangle(5, 6);
		
		try {
			
			// write
			FileOutputStream fileOutputStream = new FileOutputStream(
					"d:\\test\\temp.out");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);

			try {
				objectOutputStream.writeObject(rectangle1);
				objectOutputStream.writeObject(rectangle2);
			} finally {
				objectOutputStream.close();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}


		// read
		try {
			Rectangle rectangls;
			FileInputStream fileInputStream = new FileInputStream("d:\\test\\temp.out");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			try {
				rectangls = (Rectangle) objectInputStream.readObject();

				System.out.println("Rectangle height: "	+ rectangls.getHeight());
				System.out.println("Rectangle width: " + rectangls.getWidth());
				
				rectangls = (Rectangle) objectInputStream.readObject();

				System.out.println("Rectangle height: "	+ rectangls.getHeight());
				System.out.println("Rectangle width: " + rectangls.getWidth());
				
			} finally {
				objectInputStream.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
