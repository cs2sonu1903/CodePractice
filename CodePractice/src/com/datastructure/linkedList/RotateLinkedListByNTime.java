package com.datastructure.linkedList;

import java.util.LinkedList;
import java.util.List;

public class RotateLinkedListByNTime {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args) {
       /* List<Integer> list =new MyLinkedList<>();
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(10);
        list.add(20);
        System.out.println(list);
        
        int k=2;
        List<Integer> rotated =listRotate(list,k);
        System.out.println(rotated);*/
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;
        System.out.println("Original list:");
        printList(head);

        Node rotated = rotateRight(head, k);
        System.out.println("\nRotated list by " + k + " positions:");
        printList(rotated);
    }

    private static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Count length of the list and get the tail node
        Node temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Step 2: Connect the tail to head (make it circular temporarily)
        temp.next = head;

        // Step 3: Calculate the effective rotation
        k = k % length;
        int stepsToNewHead = length - k;

        // Step 4: Traverse to the new tail
        Node newTail = temp;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        // Step 5: Break the loop and assign new head
        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    
}
