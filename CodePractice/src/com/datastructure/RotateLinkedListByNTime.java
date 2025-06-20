package com.datastructure;

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

        Integer head=linkedList.peekFirst();
        System.out.println(head);
        Integer tail=linkedList.peekLast();
        System.out.println(tail);

    }
}
