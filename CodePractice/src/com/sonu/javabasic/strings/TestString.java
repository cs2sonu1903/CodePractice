package com.sonu.javabasic.strings;

public class TestString {
    public static void main(String[] args) {
        String a="swaroop",b="swa"+"roop",c="swa",d=c+"roop";
        System.out.println(a==b);
        System.out.println(a==d);

        String s2=a.replace("o","O");
        String s3="swarOOp";
        System.out.println(s2);
        System.out.println(s2==s3);
        System.out.println(s2.hashCode()+" "+s3.hashCode());

        String str=new String("Sonu");
       String str2= str.concat("dubey");
        System.out.println(str);
        System.out.println(str2);

        StringBuffer sb=new StringBuffer("Sonu");
        sb.append("dubey");
        System.out.println(sb);
    }
}
