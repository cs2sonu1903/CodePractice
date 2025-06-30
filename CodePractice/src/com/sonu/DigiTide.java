package com.sonu;



import com.sonu.stream.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DigiTide {

    public static void main(String[] args) {
        Map<Integer, Student> slist=new HashMap<>();
        slist.put(1,new Student(1,"Sonu",100));
        slist.put(2,new Student(2,"Rajesh",65l));
        slist.put(3,new Student(3,"Divyanshu",39L));

        System.out.println(slist);

//        slist.entrySet().stream().sorted((s1,s2)->Long.compare(s1.getKey(), s2.getKey()));
        Map<String, Long> collect = slist.values().stream().collect(Collectors.toMap(s -> s.getName(), s -> s.getMarks()));
        System.out.println(collect);


    }

}
