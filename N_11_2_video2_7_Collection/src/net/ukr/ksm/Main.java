package net.ukr.ksm;

import java.util.*;

public class Main {

	public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("One");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ///////////////////////////////

        //Set --- Ne soderzut odinakovux znacheniy

        Set<String> set = new HashSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /////////////////////////////////////////////////

        ArrayList list2 = new ArrayList();
        list2.add("1234");
        list2.add("2568");
        //list2.add(555);

        String s1 = (String) list2.get(0);
       // String s2 = (String) list2.get(2); // ClassCastException

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("One");
        list3.add("Two");
        list3.add("Three");
        //list3.add(kkkk);

        String s3 = list3.get(0);
        String s4 = list3.get(2);

    }

}
