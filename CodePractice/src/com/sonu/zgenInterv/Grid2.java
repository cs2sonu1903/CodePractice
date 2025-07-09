package com.sonu.zgenInterv;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grid2 {
    public static void main(String[] args) {
        String str= "abcfgio()[}{]";
        String str1= "abcfgio(([{}]))";
        String s = "Im the super cool guy ";
        Integer i1 = Arrays.stream(s.split(" ")).map(s2 -> new StringBuilder(s2).reverse()).findFirst().map(s1 -> s1.length()).get();
        System.out.println(i1);
//        System.out.println(collect);


        char []ch =str1.toCharArray();
        Stack<Character> stack=new Stack<>();
        boolean isPerfect = true;

//        'a',b,c,f,g,i,o,'(',')'

        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='('|| ch[i]=='{'||ch[i]=='['){
                stack.push(ch[i]);
            }else if (ch[i]== ')' || ch[i] == '}' || ch[i] == ']') {
                if (stack.isEmpty()) {
                    isPerfect=false;
                    break;
                }
               char top= stack.pop();
                if ((ch[i]==')' && top!='(' || ch[i]=='}' && top!='{'|| ch[i]==']' && top!=']')){
                    isPerfect=false;
                    break;
                }
            }
        }
        if (!stack.empty())
            isPerfect=false;
        if (isPerfect){
            System.out.println("Perfect string");
        }else {
            System.out.println("not a perfect string");
        }
    }
}
