package net.ukr.ksm;

import java.util.*;

public class Bug implements Comparable, Comparator {
	String name;
	double razmer;
	String color;

	/**
	 * @param name
	 * @param razmer
	 * @param color
	 */
	public Bug(String name, double razmer, String color) {
		super();
		this.name = name;
		this.razmer = razmer;
		this.color = color;
	}
	
	void print() {
		System.out.println();
		System.out.println("Название  " + name);
		System.out.println("Размер  " + razmer + "  cm");
		System.out.println("Цвет  " + color);
	}

	@Override
	public int compare(Object bug_a, Object bug_b) {
		Bug a = (Bug) bug_a;
		Bug b = (Bug) bug_b;
		if (a.razmer > b.razmer)
			return 1;
		else if (a.razmer < b.razmer)
			return -1;
		else
			return 0;
	}

	@Override
	public int compareTo(Object bug_b) {
		Bug b = (Bug) bug_b;
		if (razmer > b.razmer)
			return 1;
		else if (razmer < b.razmer)
			return -1;
		else
			return 0;
	}

}
