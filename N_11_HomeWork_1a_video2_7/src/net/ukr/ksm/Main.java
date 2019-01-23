/* 
 * Write method for conversation arrays string/number in list 
 */

package net.ukr.ksm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.awt.List;

public class Main {

	public static void main(String[] args) {

		Integer[] i = { 1, 2, 3, 4, 5, 6, 7 };
		String[] s = { "abc", "def", "c", "d", "e" };

		ArrayList aL1 = Test.ConvertArrayToList(i);
		for (int j = 0; j < aL1.size(); j++)
			System.out.print(aL1.get(j));

		ArrayList aL2 = Test.ConvertArrayToList(s);
		for (int j = 0; j < aL2.size(); j++)
			System.out.print(aL2.get(j));

	}

}

class Test {
	/*
	 * 1
	 */
	public static <T> ArrayList<T> ConvertArrayToList(T[] a) {
		ArrayList<T> temp = new ArrayList<T>();
		for (T t : a)
			temp.add(t);
		return temp;

	}
}
