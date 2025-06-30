package com.sonu.stream;

public class Employee {
    String name;
    int salary;
    String city;

    public Employee() {
    }

    public Employee(String name, int salary, String city) {
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}
