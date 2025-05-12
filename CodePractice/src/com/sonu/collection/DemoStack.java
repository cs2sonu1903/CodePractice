package com.sonu.collection;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push("Sonu");
        st.push(420);
        st.add(2,"Rajesh");
        st.push("Riya");
        st.push("Raam");

        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
        st.push("Rahul");
        System.out.println(st);
        System.out.println(st.search("Riya"));
        System.out.println(st.empty());
    }
}
