package com.sonu.stream.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class moveAllZeroInStart {
    public static void main(String[] args) {
        int[] arr={5,0,1,0,8,0};

        //1st Approch and simple one

        List<Integer> zeros = Arrays.stream(arr).boxed().filter(x -> x == 0).collect(Collectors.toList());
        List<Integer> NonZeros = Arrays.stream(arr).boxed().filter(x -> x != 0).collect(Collectors.toList());
        List<Integer> finalList=new ArrayList<>();
        finalList.addAll(zeros);
        finalList.addAll(NonZeros);
        System.out.println(finalList);

        //2nd Approch
        List<Integer> values = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e != 0)).values()
                .stream().flatMap(i->i.stream()).collect(Collectors.toList());
        System.out.println(values);
    }
}
