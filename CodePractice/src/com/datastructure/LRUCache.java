package com.datastructure;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    public class Node{
        int key,value;
        Node prev,next;
        Node(int k,int val){
           k=key;
           val=value;
           prev=next=null;
        }

    }
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);

    Map<Integer,Node> unMap=new HashMap<>();
    int limit;

    public LRUCache(int capacity) {
        limit=capacity;
        head.next=tail;
        tail.prev=head;

    }

    public int get(int key) {
        if (!unMap.containsKey(key))
            return -1;
        Node newNode=unMap.get(key);
        int ans=newNode.value;
        unMap.remove(newNode);
        removeNode(newNode);
        addNode(newNode);
        unMap.get(newNode);

        return  ans;
    }

    public void put(int key, int value) {
        if (unMap.containsKey(key)){
            removeNode(unMap.get(key));
        }
        if (unMap.size()==limit){
            Node lru=tail.prev;
            removeNode(lru);
            unMap.remove(key);
        }
        Node newNode=new Node(key,value);
        addNode(newNode);
        unMap.put(key,newNode);

    }

    private void addNode(Node newNode) {
        Node oldNode=head.next;
        head.next=newNode;
        oldNode.prev=newNode;
        newNode.prev=head;
        newNode.next=oldNode;
    }

    private void removeNode(Node node) {
        Node nodePre=node.prev;
        Node nodeNext=node.next;

        nodePre.next=nodeNext;
        nodeNext.prev=nodePre;

    }
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
