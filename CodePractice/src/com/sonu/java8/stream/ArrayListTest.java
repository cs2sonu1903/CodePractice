package com.sonu.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListTest {
    public static void main(String[] args) {
//        ArrayList<Objects> arrayList=new ArrayList<Objects>();
        List<Employee> listofemp= Arrays.asList(new Employee("Rajesh", 40000,"Bengaluru"),
                new Employee("Rahul", 60000,"Bengaluru"),
                new Employee("Sonu", 25000,"Bihar"),
                new Employee("Srishti",86300,"Bihar"),
                new Employee("Ashmita",40000,"Delhi"));
        System.out.println(listofemp);

/*        List<Employee> salgreater = listofemp.stream().filter(employee -> employee.salary > 20000).collect(Collectors.toList());
//        System.out.println(salgreater);
        Optional<Employee> maxSal = listofemp.stream().max(Comparator.comparingInt(emp -> emp.salary));
//        System.out.println(maxSal);
//        List<Long> salIncForFresh = listofemp.stream().filter(emp -> emp.salary < 30000).map(emp -> emp.salary = emp.salary * 2).collect(Collectors.toList());
//        System.out.println(salIncForFresh);
        List<Integer> salIncFresh = listofemp.stream().filter(employee -> employee.salary < 30000).map(employee -> employee.salary * 2).collect(Collectors.toList());
//        System.out.println(salIncFresh);

        List<Student> studentList=Arrays.asList(new Student("Sonu",1),
                new Student("Rajesh",2),
                new Student("Divyanshu",3));
        System.out.println(studentList);

        Map<String, Integer> map1 = studentList.stream().collect(Collectors.toMap(s -> s.name, s -> s.studentId));
        System.out.println(map1);

        List<String> collect = map1.keySet().stream().collect(Collectors.toList());
        System.out.println(collect);*/

      /*  List<Employee> collect = listofemp.stream().filter(employee -> employee.salary > 30000).collect(Collectors.toList());
        System.out.println(collect);*/

        /*Map<String, String> collect = listofemp.stream().filter(employee -> employee.salary > 30000).collect(Collectors.toMap(emp -> emp.city,emp -> emp.name));
        System.out.println(collect);*/

        Map<String, List<String>> collect = listofemp.stream().filter(emp -> emp.salary > 30000).collect(Collectors.groupingBy(e -> e.city, Collectors.mapping(e1 -> e1.name, Collectors.toList())));
        System.out.println(collect);
    }
}
