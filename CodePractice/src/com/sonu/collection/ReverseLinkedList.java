package com.sonu.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
