// Модифицировать код для сортировки Human чтобы элементы упорядочивались по убыванию

package net.ukr.ksm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import javax.sound.sampled.ReverbType;

public class Main {

	public static void main(String[] args) {

		Human[] list = { new Human(40), new Human(20), new Human(3),
				new Human(7) };

		// Вариант 1
		Arrays.sort(list);
		
		// Вариант 2
		//Arrays.sort(list, new HumanComparator().reversed());

		for (Human h : list) {
			System.out.println(h.getAge());
		}
	}

}
