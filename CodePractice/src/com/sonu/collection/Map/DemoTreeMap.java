package com.sonu.collection.Map;

import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        TreeMap treeMap=new TreeMap();
        treeMap.put(1,"Riya");
        treeMap.put(9,"Amit");
        treeMap.put(7,"Ashmita");
        treeMap.put(4,"Steffi");
        treeMap.put(1,"Riya Pandey");

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.pollFirstEntry());
    }
}
