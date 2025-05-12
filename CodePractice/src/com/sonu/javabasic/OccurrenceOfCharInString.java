package com.sonu.javabasic;

import java.util.Scanner;

public class OccurrenceOfCharInString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string=sc.nextLine();
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Occurrence Of All The Characters In Given String");
            System.out.println("2. Occurrence Of Given Character in String");
            System.out.println("3. Occurrence Of Vowels in String");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    occurrenceOfAllTheCharInString(string);
                    break;
                case 2:
                    System.out.println("Enter the target character: ");
                    char targetChar = sc.next().charAt(0);
                    occurrenceOfGivenCharInString(string, targetChar);
                    break;
                case 3:
                    occurrenceOfVowelsString(string);
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void occurrenceOfVowelsString(String string) {
        string=string.toLowerCase();
        int count=0;
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i) =='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u' )
                count++;
        }
        System.out.println("Total no of vowels in string are: " + count);

    }


    private static void occurrenceOfGivenCharInString(String string, char ch) {
        int count=0;
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i) == ch)
                count++;
        }
        System.out.println("The character '" + ch + "' appears " + count + " times.");
    }

    private static void occurrenceOfAllTheCharInString(String string) {
        int[] count=new int[256];
        for (int i = 0; i <string.length() ; i++) {
            count[string.charAt(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i]>0) {
                System.out.println((char) i+": "+count[i]);
            }
        }
    }

}
