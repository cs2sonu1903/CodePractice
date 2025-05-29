package com.slidingWindow;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr={100,200,300,400,500,600};

        //normal approch using for loop

        int[] conSumarr=new int[arr.length-1];
        for (int i = 0; i <arr.length-1 ; i++) {
            conSumarr[i]=arr[i]+arr[i+1];
        }
        for (int i = 0; i <conSumarr.length ; i++) {
            System.out.println(conSumarr[i]);
        }
       /* for (int i = conSumarr.length-1; i < conSumarr.length; i++) {
            System.out.println("Max sum of sub array : "+conSumarr[conSumarr.length-1]);

        }*/

        //normal approch using stram stream
        System.out.println("Max sum of sub array : "+Arrays.stream(conSumarr).max().getAsInt());


    }
}
