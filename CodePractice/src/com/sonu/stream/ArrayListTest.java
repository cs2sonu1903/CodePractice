package com.sonu.stream;

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

        //find the employee whoes sal is greater then 20000
        System.out.println("employee whoes sal is greater then 20000");
        List<Employee> salgreater = listofemp.stream().filter(employee -> employee.salary > 20000)
                .collect(Collectors.toList());
        System.out.println(salgreater);

        //maximum salary
        System.out.println("maximum salary");
        Optional<Employee> maxSal = listofemp.stream().max(Comparator.comparingInt(emp -> emp.salary));
        System.out.println(maxSal);

        //salary incriment
        System.out.println("Salary Incriment by");

        List<Integer> salIncrement = listofemp.stream().filter(emp -> emp.salary < 30000)
                .map(emp -> emp.salary = emp.salary * 2).collect(Collectors.toList());
        System.out.println(salIncrement);


        // new list

        List<Student> studentList=Arrays.asList(new Student("Sonu",1),
                new Student("Rajesh",2),
                new Student("Divyanshu",3));
        System.out.println("Student list /n"+studentList);

        // store list into map
        Map<String, Integer> map1 = studentList.stream().collect(Collectors.toMap(s -> s.name, s -> s.studentId));
        System.out.println(map1);

        //collect map in list
        List<String> collectList = map1.keySet().stream().collect(Collectors.toList());
        System.out.println(collectList);

        //Salary Filter
        List<Employee> salFilter = listofemp.stream().filter(employee -> employee.salary > 30000)
                .collect(Collectors.toList());
        System.out.println(salFilter);

        // employee whoes salary is greater then 30k amd store in map where key is city and value is the list of employee from that city
         Map<String, List<String>> collect = listofemp.stream().filter(emp -> emp.salary > 30000)
                 .collect(Collectors.groupingBy(e -> e.city, Collectors.mapping(e1 -> e1.name, Collectors.toList())));
        System.out.println(collect);
    }
}
