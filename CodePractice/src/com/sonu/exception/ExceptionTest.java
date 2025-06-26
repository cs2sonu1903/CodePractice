package com.sonu.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            testMethod(true);
        }catch (CustomException e){
            System.out.println("My Exception"+" "+e.getMessage());
        }


    }
    public static void testMethod(boolean condition) throws CustomException{
        if (condition) {
            throw new CustomException("This is custom exception");
        }
    }
}
