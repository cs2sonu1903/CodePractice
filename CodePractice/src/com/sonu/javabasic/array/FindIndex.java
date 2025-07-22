package com.sonu.javabasic.array;

public class FindIndex {
    public static void main(String[] args) {
        int [] arr={1,2,3,3,4,9,7,5,51,34,64,46,75};
        int iteam=51;

       int index= findElementIndex(arr,iteam);
        System.out.println(iteam+" placed at : "+index+" palce");

        int value=3;

        /*arr[value]=Integer.MIN_VALUE;
        for (int num : arr){
            System.out.print(num+" ");
        }*/

        int newArr[]=removeValue(arr,value);
        for (int num : newArr){
            System.out.print(num+" ");
        }
    }

    private static int[] removeValue(int[] arr, int value) {
        int count=0;
        for (int num : arr){
            if(num!=value)
                count++;
        }
        int[] newArray=new int[count];
       int i=0;
       for (int num : arr){
           if (num!=value){
               newArray[i]=num;
               i++;
           }
       }
        return newArray;
    }

    private static int findElementIndex(int[] arr, int iteam) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==iteam)
                return i;
        }
        return -1;
    }
}
