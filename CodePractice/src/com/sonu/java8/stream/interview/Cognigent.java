package com.sonu.java8.stream.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cognigent {

    public static void main(String[] args) {
        ArrayList<Employee> arrayList=new ArrayList<Employee>();
        arrayList.add(new Employee("Sonu",35000,"Gopalganj"));
        arrayList.add(new Employee("Rajesh",55000,"Gopalganj"));
        arrayList.add(new Employee("Amit",215000,"Patna"));
        arrayList.add(new Employee("Ashmita",35000,"Patna"));
        arrayList.add(new Employee("Srishti",86300,"Bengalore"));
        arrayList.add(new Employee("Rahul", 60000,"Bengaluru"));

        System.out.println(arrayList);
        //find the employee who is earning more then 30000
        List<Employee> earnMore30 = arrayList.stream().filter(emp -> emp.getSalary() > 30000).collect(Collectors.toList());
        System.out.println(earnMore30);

        // store this in Map where city is the key and List of employee is value
        Map<Object, List<Object>> collectInMap = arrayList.stream().filter(emp -> emp.getSalary() > 30000).collect(Collectors.groupingBy(e -> e.getCity(), Collectors.mapping(e1 -> e1.getName(), Collectors.toList())));
        System.out.println(collectInMap);
    }
}
