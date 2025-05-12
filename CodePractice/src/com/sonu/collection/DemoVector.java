package com.sonu.collection;

import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add("Sonu");
        vector.add(1,"Rajesh");
        vector.addElement("Riya");
        vector.addElement(567);
        vector.setElementAt(250,3);

        System.out.println(vector);
    }
}
