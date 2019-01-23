package net.ukr.ksm;


import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: Serhio
 * Date: 20.08.15
 * Time: 7:22
 * To change this template use File | Settings | File Templates.
 */
public class Main {

  
    public static void main(String[] args){

        // Primer 1

        // Sinhronization spiskov dlya monogo potochnux rabot
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        list.add("test");

        Set<Integer> set = Collections.synchronizedSet(new TreeSet<Integer>());
        set.add(777);


        //////////////////////////////////////////////////////

        // Primer 2

        // delete some elements from list
        List<Integer> listLong = new ArrayList<Integer>();

        for (int i = 0; i < 10 ; i++) {
            listLong.add(i);
        }

        listLong.subList(4, 7).clear();

        for (Integer i : listLong){
            System.out.println(i);
        }
       //////////////////////////////////////////////////////

        // Primer 3

        TestClass testClass = new TestClass();
        List<String> listTestClass = testClass.getList();
        listTestClass.add("test");

    }

    // for Primer 3
    static class TestClass {
        List<String> list = new ArrayList<String>();

        public List<String> getList() {
            //return list; // return list for add and read
            return Collections.unmodifiableList(list);    // // return list only for read
        }

    }


}
