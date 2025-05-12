package com.sonu.javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class AllProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Check Whether a Number is Prime or Not");
            System.out.println("2. Count the Prime Numbers");
            System.out.println("3. Display com.sonu.javabasic.Fibonacci Series");
            System.out.println("4. Check Whether a Number is Palindrome or Not");
            System.out.println("5. Display Star Patterns");
            System.out.println("6. Check Whether a String is Palindrome or Not");
            System.out.println("7. Calculate Average Using Arrays");
            System.out.println("8. Add Two Matrices Using Multi-dimensional Arrays");
            System.out.println("9. Concatenate Two Arrays");
            System.out.println("10. Convert Character to String and Vice-Versa");
            System.out.println("11. Check if An Array Contains a Given Value");
            System.out.println("12. Find Largest Element of an Array");
            System.out.println("13. Join Two Lists");
            System.out.println("14. Convert List (ArrayList) to Array and Vice-Versa");
            System.out.println("15. Convert Map (HashMap) to List");
            System.out.println("16. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    checkPrime(num);
                    break;
                case 2:
                    countPrimes();
                    break;
                case 3:
                    System.out.print("Enter the number of terms: ");
                    int n = scanner.nextInt();
                    displayFibonacciSeries(n);
                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    int palindromeNum = scanner.nextInt();
                    checkPalindromeNumber(palindromeNum);
                    break;
                case 5:
                    System.out.print("Enter the number of rows: ");
                    int rows = scanner.nextInt();
                    displayStarPatterns(rows);
                    break;
                case 6:
                    System.out.print("Enter a string: ");
                    String str = scanner.next();
                    checkPalindromeString(str);
                    break;
                case 7:
                    int[] numbers = {1, 2, 3, 4, 5};
                    calculateAverageUsingArrays(numbers);
                    break;
                case 8:
                    addMatrices();
                    break;
                case 9:
                    int[] firstArray = {1, 2, 3};
                    int[] secondArray = {4, 5, 6};
                    concatenateArrays(firstArray, secondArray);
                    break;
                case 10:
                    System.out.print("Enter a character: ");
                    char ch = scanner.next().charAt(0);
                    System.out.print("Enter a string: ");
                    String string = scanner.next();
                    convertCharToStringAndViceVersa(ch, string);
                    break;
                case 11:
                    int[] array = {1, 2, 3, 4, 5};
                    System.out.print("Enter a value to find: ");
                    int valueToFind = scanner.nextInt();
                    checkArrayContainsValue(array, valueToFind);
                    break;
                /*case 12:
                    int[] elements = {1, 2, 3, 4, 5};
                    findLargestElement(elements);
                    break;
                case 13:
                    joinLists();
                    break;
                case 14:
                    convertListToArrayAndViceVersa();
                    break;
                case 15:
                    convertMapToList();
                    break;*/
                case 16:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void checkPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public static void countPrimes() {
        int count = 0;
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println("Number of prime numbers between 1 and 100: " + count);
    }

    public static void displayFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.println("com.sonu.javabasic.Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }

    public static void checkPalindromeNumber(int num) {
        int reversedNum = 0, remainder, originalNum;
        originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversedNum)
            System.out.println(originalNum + " is a palindrome.");
        else
            System.out.println(originalNum + " is not a palindrome.");
    }

    public static void displayStarPatterns(int n) {
        // Pyramid com.sonu.javabasic.Pattern
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Right Triangle com.sonu.javabasic.Pattern
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Inverted Right Triangle com.sonu.javabasic.Pattern
        for (int i = n; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void checkPalindromeString(String str) {
        String reversedStr = "";
        int strLength = str.length();
        for (int i = (strLength - 1); i >= 0; --i) {
            reversedStr += str.charAt(i);
        }
        if (str.equals(reversedStr))
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");
    }

    public static void calculateAverageUsingArrays(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }

    public static void addMatrices() {
        int rows = 2, columns = 3;
        int[][] firstMatrix = {{2, 3, 4}, {5, 2, 3}};
        int[][] secondMatrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("Sum of two matrices is: ");
        for (int[] row : sum) {
            for (int column : row) {
                System.out.print(column + " ");
            }
        }
    }

    public static void concatenateArrays(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, result, 0, firstArray.length);
        System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);
        System.out.println("Concatenated Array: " + Arrays.toString(result));
    }

    public static void convertCharToStringAndViceVersa(char ch, String str) {
        String charToString = Character.toString(ch);
        System.out.println("Character to String: " + charToString);
        char stringToChar = str.charAt(0);
        System.out.println("String to Character: " + stringToChar);
    }

    public static void checkArrayContainsValue(int[] numbers, int valueToFind) {
        boolean found = false;
        for (int number : numbers) {
            if (number == valueToFind) {
                found = true;
                break;
            }


        }

    }
}