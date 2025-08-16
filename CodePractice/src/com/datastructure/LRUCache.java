package com.datastructure;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node {
        int key, value;
        Node prev, next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        // Dummy head and tail nodes
        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        remove(node);
        insertToFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }

        if (map.size() == capacity) {
            // Remove least recently used (from back)
            Node lru = tail.prev;
            remove(lru);
        }

        Node newNode = new Node(key, value);
        insertToFront(newNode);
    }

    private void remove(Node node) {
        map.remove(node.key);

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertToFront(Node node) {
        map.put(node.key, node);

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

   /* public class Node{
        int key,value;
        Node prev,next;
        Node(int k,int val){
           k=key;
           val=value;
           prev=next=null;
        }

    }
    private final Node head,tail;
    private final int limit;
    private final Map<Integer,Node> unMap;


  *//*  Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);

    Map<Integer,Node> unMap=new HashMap<>();*//*


    public LRUCache(int capacity) {
        this.limit=capacity;
        unMap=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);

    }

    public int get(int key) {
        if (!unMap.containsKey(key))
            return -1;
        Node newNode=unMap.get(key);
//        int ans=newNode.value;
//        unMap.remove(newNode);
        removeNode(newNode);
        addNode(newNode);
//        unMap.get(newNode);

        return  newNode.value;
    }

    public void put(int key, int value) {
        if (unMap.containsKey(key)){
            removeNode(unMap.get(key));
        }
        if (unMap.size()==limit){
            Node lru=tail.prev;
            removeNode(lru);
//            unMap.remove(key);
        }
        Node newNode=new Node(key,value);
        addNode(newNode);
//        unMap.put(key,newNode);

    }

    private void addNode(Node newNode) {
        unMap.put(newNode.key,newNode);
        newNode.next=head.next;
        newNode.prev=head;
        head.next.prev=newNode;
        head.next=newNode;

       *//* Node oldNode=head.next;
        head.next=newNode;
        oldNode.prev=newNode;
        newNode.prev=head;
        newNode.next=oldNode;*//*
    }

    private void removeNode(Node node) {
        unMap.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
        *//*Node nodePre=node.prev;
        Node nodeNext=node.next;

        nodePre.next=nodeNext;
        nodeNext.prev=nodePre;*//*

    }*/
//    public static void main(String[] args) {
//            LRUCache lRUCache = new LRUCache(2);
//            lRUCache.put(1, 1); // cache is {1=1}
//            lRUCache.put(2, 2); // cache is {1=1, 2=2}
//            System.out.println(lRUCache.get(1));    // return 1
//            lRUCache.put(3, 3); // evicts key 2 → {1=1, 3=3}
//            System.out.println(lRUCache.get(2));    // return -1
//            lRUCache.put(4, 4); // evicts key 1 → {4=4, 3=3}
//            System.out.println(lRUCache.get(1));    // return -1
//            System.out.println(lRUCache.get(3));    // return 3
//            System.out.println(lRUCache.get(4));    // return 4
//
//    }


}
