package com.sonu.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REDynamicExaample {

    public static void checkStringAgainstRe(String re,String str){
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(str);
        boolean matches = matcher.matches();
        System.out.println(matches);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.println("Enter the Regular Expresion");
            String re=sc.nextLine();
            System.out.println("Enter your String");
            String str=sc.nextLine();

            checkStringAgainstRe(re,str);
            System.out.println( "Want to Exit[Y/N]");
            String choice=sc.nextLine();
            if (choice.equalsIgnoreCase("Y")){
                System.out.println("ThankYou for Using ");
                break;
            }
        }

    }
}
