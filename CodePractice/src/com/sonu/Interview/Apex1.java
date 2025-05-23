package com.sonu.Interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Apex1 {

    public static void main(String[] args) {
        String s="witty";
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
        System.out.println();

        int[] arr={1,2,0,0,2,1};
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                int temp=arr[i];
                arr[i]=arr[4];
                arr[4]=temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }
}
