package com.sonu.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WissenInterview {
    public static void main(String[] args) {
//        Map<String,String> list=new LinkedHashMap<>(); //fail fast mechanism
        Map<String,String> list=new ConcurrentHashMap<>(); //fail safe
        list.put("india","Kolkata");
        list.put("Russia","Moscow");
        list.put("USA","Wasinton");

        Iterator<String>  iterator = list.keySet().iterator();
        while (iterator.hasNext())
        {
            String country=iterator.next();

            if ("india".equals(country)){
                list.put("india","delhi");
                list.put("pakistan","ishlamabad"); //Exception : ConcurrentModificationException :- fail fast mechanism
            }
            System.out.println(country+"  "+list.get(country));
            //still pakistan will not print but its update in original list
            // Note: While the iterator is fail-safe, it may not reflect modifications made after the iterator was created.
            // This is a key difference from fail-fast iterators.
        }
        System.out.println(list);

    }
}
