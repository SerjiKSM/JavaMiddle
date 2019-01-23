/*
 * Reshut zadachy podschota povtoryayshchixsa elements v masive s pomoshchyu HashMap 
 * 
 * */

package net.ukr.ksm;


import java.util.HashMap;
import java.util.Map;

public class ElementArray<E> {
	protected Map<E, Integer> map = new HashMap<E, Integer>();

	public void count(E[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (!map.containsKey(ar[i])) {
				map.put(ar[i], 1);
			} else
				map.put(ar[i], map.get(ar[i]) + 1);
		}
	}

	public Map<E, Integer> getMap() {
		return map;
	}

	public static void main(String[] args) {
		Integer[] ar = { 1, 2, 4, 5, 1, 2, 3, 4, 5, 6, 6, 6, 3, 2, 1, 6 };
		ElementArray ea = new ElementArray();
		ea.count(ar);
		System.out.println(ea.getMap());
	}
}

