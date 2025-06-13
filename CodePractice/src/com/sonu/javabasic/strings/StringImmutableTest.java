package com.sonu.javabasic.strings;

public class StringImmutableTest {
    public static void main(String[] args) {
        String s="Sonu";
        System.out.println(s+" :-"+s.hashCode());
        s="Kumar";
        System.out.println(s+" :- "+s.hashCode());

        String fName="Sonu",mName="Kumar",lName="Dubey";

        System.out.println(fName+" :- "+fName.hashCode());

        System.out.println(mName+" :- "+mName.hashCode());

        System.out.println(lName+" :- "+lName.hashCode());

        fName=fName+mName;
        System.out.println(fName+" :- "+fName.hashCode());

    }
}
