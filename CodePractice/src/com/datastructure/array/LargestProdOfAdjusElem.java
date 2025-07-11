package com.datastructure.array;

public class LargestProdOfAdjusElem {
    public static void main(String[] args) {
         LargestProdOfAdjusElem largestProdOfAdjusElem=new LargestProdOfAdjusElem();
        int[] arr1 = {3, 6, -2, -5, 7, 3};
        System.out.println("Max adjacent product for {3, 6, -2, -5, 7, 3}: " + largestProdOfAdjusElem.adjacentElementsProduct(arr1)); // Output: 21

        int[] arr2 = {-1, -2};
        System.out.println("Max adjacent product for {-1, -2}: " + largestProdOfAdjusElem.adjacentElementsProduct(arr2)); // Output: 2

        int[] arr3 = {5, 1, 2, 3, 0};
        System.out.println("Max adjacent product for {5, 1, 2, 3, 0}: " + largestProdOfAdjusElem.adjacentElementsProduct(arr3)); // Output: 6
    }

    private int adjacentElementsProduct(int[] arr1) {
        int maxProduct;
        if (arr1.length==0 || arr1.length<2)
            return 0;
        maxProduct=arr1[0] * arr1[1];
        for (int i = 1; i < arr1.length-1; i++) {
            int currProduct=arr1[i] * arr1[i+1];
            if (currProduct>maxProduct){
                maxProduct=currProduct;
            }
        }

        return maxProduct;
    }
}
