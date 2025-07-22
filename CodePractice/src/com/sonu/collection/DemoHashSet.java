package com.sonu.collection;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

    public static void main(String[] args) {


        Set hasset=new HashSet();
        hasset.add(10);
        hasset.add("Sonu");
        hasset.add("Rajesh");
        hasset.add("Riya");

        System.out.println(hasset);
        System.out.println(hasset.hashCode());
//        System.out.println(hasset.remove(10));
        System.out.println(hasset.size());
//        hasset.clear();

        System.out.println(hasset);

    }
}
