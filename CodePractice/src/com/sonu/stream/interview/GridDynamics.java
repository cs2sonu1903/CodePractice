package com.sonu.stream.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GridDynamics {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Cat","Dog","Cow","Cat","Dog","Cow","Goat","Dog","Dog");
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        List<String> sorted = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .map(s->s.getKey()).collect(Collectors.toList());
        System.out.println(sorted);


    }


}
