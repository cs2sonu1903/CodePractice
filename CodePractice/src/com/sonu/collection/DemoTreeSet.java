package com.sonu.collection;

import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(90);
        ts.add(50);
        ts.add(40);
        ts.add(30);
        ts.add(60);
        ts.add(70);

        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.hashCode());
        System.out.println(ts.remove(60));
        System.out.println(ts.hashCode());
//        ts.clear();
        System.out.println(ts);
        System.out.println(ts.descendingSet());
        System.out.println(ts.comparator());


    }
}
