package com.datastructure;

public class LRUCacheTest {
    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // return 1
        lRUCache.put(3, 3); // evicts key 2 → {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // return -1
        lRUCache.put(4, 4); // evicts key 1 → {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // return -1
        System.out.println(lRUCache.get(3));    // return 3
        System.out.println(lRUCache.get(4));    // return 4
    }
}
