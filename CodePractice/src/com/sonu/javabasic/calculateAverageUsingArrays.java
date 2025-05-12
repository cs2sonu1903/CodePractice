package com.sonu.javabasic;

import java.util.Scanner;

public class calculateAverageUsingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int s=scanner.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter the array element: ");
        for (int i = 0; i < s; i++) {
            if (scanner.hasNext()) {
                arr[i]= scanner.nextInt();
            }

        }
        System.out.println( "The elements of the array are: ");
        for (int i = 0; i <s ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum=0;
        for (int i = 0; i <s ; i++) {
            sum=sum+arr[i];
        }
        double avg= (double) sum /s;
        System.out.println("Avrage of array is : "+avg);

    }
}
