package com.sonu.oopsinterview;

import java.util.Date;

public class ImutableTest {
    public static void main(String[] args) {
        Date dob = new Date();
        ImutableClass person = new ImutableClass("John Doe", 30, dob);

        System.out.println(person);

        dob.setTime(0);
        System.out.println("After modifying dob: " + person);

        person.getDateOfBirth().setTime(0);
        System.out.println("After modifying dateOfBirth: " + person);
    }
}
