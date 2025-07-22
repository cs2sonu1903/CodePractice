package com.datastructure.linkedList;

public class RevSingleLinkedList {
    static class  ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        RevSingleLinkedList reverser = new RevSingleLinkedList();

        // Create a list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        reverser.printList(head);

        ListNode reversedHead = reverser.reverseList(head);
        System.out.print("Reversed List: ");
        reverser.printList(reversedHead); // Output: 5 -> 4 -> 3 -> 2 -> 1 -> null
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode tempNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tempNode;

        }
        return prev;
    }

    private void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
