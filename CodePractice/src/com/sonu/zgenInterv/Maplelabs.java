package com.sonu.zgenInterv;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Maplelabs {
    public static void main(String[] args) {

        /*String s="abcd";
        char[] ch=s.toCharArray();
        int count=0;
        for (int i = 0; i < ch.length-1; i++) {
            for (int j = i+1; j < ch.length; j++) {
                int pre=(int)ch[j]-1;
                int next=(int)ch[j]+1;
                if (ch[i])


            }
        }
        System.out.println(count);*/
        List<Integer> arr=Arrays.asList(1,2,3,4,5,1,4,3);
//        List<Integer> arr2 = Arrays.asList(3, 4);
        //count the sub array
//        boolean contains = arr.contains(arr2);

//        System.out.println(contains);
        Map<Integer, Long> count = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long collect = count.values().stream().filter(a -> a > 1).count();

        System.out.println(collect);

//        System.out.println(count);


    }
}
