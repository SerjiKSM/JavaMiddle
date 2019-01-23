// Вариант 2 когда нет доступа к объекту по каким то причинам
// Создаем дополнительный класс HumanComparator имплементуем интерфейс
// Comparator

package net.ukr.ksm;

import java.util.Comparator;

public class FiguresComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Figures h1 = (Figures) o1; // Object o1 приводим к типу (Figures) o1
		Figures h2 = (Figures) o2;

		if (h1.getSquare() < h2.getSquare())
			return -1;
		else if (h1.getSquare() == h2.getSquare())
			return 0;
		else if (h1.getSquare() > h2.getSquare())
			return 1;
		else
			return 0;

	}

}
