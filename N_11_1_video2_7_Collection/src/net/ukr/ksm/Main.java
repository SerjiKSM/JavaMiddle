package net.ukr.ksm;


import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1234");
        arrayList.add("5678");
        arrayList.add("abcd");

        for(String s : arrayList) {
            System.out.println(s);
        }

        arrayList.remove(0);

        int sz = arrayList.size();

        for (int i = 0; i < sz; i++)
            System.out.println(arrayList.get(i));

	}

}
