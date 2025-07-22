package com.datastructure.linkedList;

public class ReverseMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.add(23);
        list.add(56);
        list.add(54);
        list.add(75);
        list.add(55);

        list.printList();
        list.remove(56);
        list.add(45);
        list.printList();

        reverseThisList(list);

    }

    private static void reverseThisList(MyLinkedList list) {
        
    }
}
