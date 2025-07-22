package com.datastructure.linkedList;

public class MyLinkedList {
    private Node head;

    public MyLinkedList(){
        this.head=null;
    }
    public  void add(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
        }else {
            Node currNode=head;
            while (currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }
    }
    public boolean remove(int data) {
        if (head == null) {
            return false; // List is empty
        }

        if (head.data == data) {
            head = head.next; // Remove head
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            return false; // Data not found
        }

        // Skip the node to be deleted
        current.next = current.next.next;
        return true;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List:");
        list.printList();

        System.out.println("\nRemoving 20:");
        list.remove(20);
        list.printList();  // Expected: 10 -> 30 -> 40 -> null

        System.out.println("\nRemoving 10 (head):");
        list.remove(10);
        list.printList();  // Expected: 30 -> 40 -> null

        System.out.println("\nRemoving 99 (not in list):");
        boolean removed = list.remove(99);
        System.out.println("Removed? " + removed);
        list.printList();  // Expected: 30 -> 40 -> null
    }
}
