package com.sonu.collection.Map;

import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put(101,"Sonu");
        hashMap.put(102,"Rajesh");
        hashMap.put(103,"Riya");
        hashMap.put(103,"Riya Pandey");

        System.out.println(hashMap);
        System.out.println(hashMap.hashCode());
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(101));
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.containsValue("Sonu"));
    }
}
