package com.sonu;

import java.util.Iterator;
import java.util.LinkedList;

public class StrTest {

    public static void main(String[] args) {

   /*     Input: s = "zop**sm*art*"
        Output: "zsar"*/

        String s="zop**sm*art*";
        char [] ch=new char[s.length()];
        ch=s.toCharArray();
        LinkedList<Character> ls=new LinkedList<Character>();

        for (int i = 0; i <ch.length-1 ; i++) {
            ls.add(ch[i]);
            }
        System.out.println(ls);

        for (int i = 0; i < ls.size(); i++) {
            if (ls.contains("*")){
            }

        }

        }


}
