package net.ukr.ksm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Serhio
 * Date: 20.08.15
 * Time: 7:22
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    static class Rectangle {
        public int w;
        public int h;

        public Rectangle(int w, int h){
            this.w = w;
            this.h = h;
        }

        @Override
        public String toString(){
            return w + " : " + h;
        }
    }

    public static void main(String[] args){
        //List<Rectangle> list = new LinkedList<Rectangle>();
        List<Rectangle> list = new ArrayList<Rectangle>();

        list.add(new Rectangle(1, 1));
        list.add(new Rectangle(2, 2));
        list.add(new Rectangle(3, 3));
        list.add(new Rectangle(4, 4));

        //list.remove(1);

        for (Rectangle r : list)
            System.out.println(r);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.size());

        ///////////////////////////////////////////////
        List<byte[]> listByte = new ArrayList<byte[]>();

        listByte.add(new byte[]{1, 2, 3, 4, 5});
        for (byte[] r : listByte)
            System.out.println(r);

         /////////////////////////////////////////////////

        List<List<String>> list4 = new ArrayList<List<String>>();

    }

}
