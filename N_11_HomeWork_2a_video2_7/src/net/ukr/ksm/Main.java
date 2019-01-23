/* 
 * Write method who create list and set there 10 elements and then delete first two and last elements
 */

package net.ukr.ksm;

import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		list.remove(0);
		list.remove(0);
		list.remove(list.size() - 1);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
	}

}

