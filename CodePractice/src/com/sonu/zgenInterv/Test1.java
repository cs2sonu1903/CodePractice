package com.sonu.zgenInterv;

public class Test1 {

    public static void main(String[] args) {
        String str="abciiidef";
        int k=3;
        String str1="";
        String str2="";

        for (int i = 0; i <str.length() ; i++) {
            if(i<k)
                str1=str1+i;
            else
                str2=str2+i;

        }

        int count=0;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                count++;
            }

        }

    }
}
