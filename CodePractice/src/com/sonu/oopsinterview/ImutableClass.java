package com.sonu.oopsinterview;

import java.util.Date;

final class ImutableClass {
    private final String name;
    private final int age;
    private final Date dateOfBirth;

    public ImutableClass(String name, int age, Date dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

    @Override
    public String toString() {
        return "ImutableClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
