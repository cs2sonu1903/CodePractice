package com.sonu.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class RotateLinkedListByNTime {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println(linkedList);


//        Collections.reverse(linkedList);
        Collections.rotate(linkedList,2);
        System.out.println(linkedList);
    }
}
