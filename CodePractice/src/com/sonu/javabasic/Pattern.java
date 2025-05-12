package com.sonu.javabasic;

public class Pattern {
    public static void main(String[] args) {
        int num =5;

//        squarPattern();
        System.out.println("---------------------------");
//        triagke90downPattern();
//        System.out.println("---------------------------");
//        triagke90UpPattern();
//        System.out.println("---------------------------");
//        triagke90SpacePattern();
//        System.out.println("---------------------------");
//        triangle();
//        System.out.println("---------------------------");
        tringleMirrorPattern(num);
//        System.out.println("---------------------------");
//        tringleRevMirrorPattern(num);
        }

    public static void squarPattern(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j<=5 ; j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }

    }
    public static void triagke90downPattern(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >=i; j--){
//                System.out.print(" * ");
                System.out.print(j+" ");
            }
            System.out.println("\n");
        }

    }
    public static void triagke90UpPattern(){
        for (int i = 1; i<=5; i++) {
            for (int j = 1; j <=i; j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }

    }
    public static void triagke90SpacePattern(){
        for (int i = 1; i<=5; i++) {
            for (int j = 4; j >=i; j--){
                System.out.print("   ");

            }
            for (int j = 1; j<=i; j++) {
                System.out.print(" * ");
//                System.out.print(j+" ");
            }

            System.out.println("\n");
        }

    }

    public static void triangle(){
        for (int i = 1; i<=5; i++) {
            for (int j = 4; j >=i; j--){
                System.out.print("   ");

            }
            for (int j = 1; j<=i; j++) {
                System.out.print(" * ");
            }
            for (int k = 2; k <=i; k++) {
                System.out.print(" * ");
            }

            System.out.println("\n");
        }

    }
    public static void tringleMirrorPattern(int num){
        for (int i = 1; i<=num; i++) {
            for (int j = num-1; j >=i; j--){
                System.out.print("   ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(" * ");
            }
            for (int k =1; k <i; k++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
        for (int i =1; i<num; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print("   ");
            }
            for (int j =i; j<num ; j++) {
                System.out.print(" * ");
            }
            for (int k =num-1; k>i; k--) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }

    }
    public static void tringleRevMirrorPattern(int num){


        for (int i = 1; i<=num; i++) {
            for (int j = 1; j<i; j++){
                System.out.print("   ");

            }
            for (int j =i; j<=num; j++) {

                System.out.print(" * ");
//                System.out.print(i+"   ");
//                System.out.print(j+"   ");
            }
            for (int j = num; j>i; j--) {
                System.out.print(" * ");
//                System.out.print(i+"   ");
//                System.out.print(j+"   ");
            }

            System.out.println("\n");
        }
        for (int i =num-1; i >=1 ; i--) {
            for (int j = 1; j<i ; j++) {
                System.out.print("   ");
            }
            for (int j =i; j <=num ; j++) {
                System.out.print(" * ");
//                System.out.print(i+"   ");
//                System.out.print(j+"   ");
            }
            for (int j = i-1; j <num-1 ; j++) {
                System.out.print(" * ");
//                System.out.print(i+"   ");
//                System.out.print(j+"   ");
            }
            System.out.println("\n");
        }


    }

}
