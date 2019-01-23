// Вариант 2 когда нет доступа к объекту по каким то причинам
// Создаем дополнительный класс HumanComparator имплементуем интерфейс
// Comparator

package net.ukr.ksm;

import java.util.Comparator;

public class HumanComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Human h1 = (Human) o1; // Object o1 приводим к типу (Human) o1
		Human h2 = (Human) o2;

		if (h1.getAge() < h2.getAge())
			return -1;
		else if (h1.getAge() == h2.getAge())
			return 0;
		else if (h1.getAge() > h2.getAge())
			return 1;
		else
			return 0;

	}

}
