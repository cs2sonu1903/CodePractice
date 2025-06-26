package com.datastructure.array;

public class ThreeSum {
    public static void main(String[] args) {
      int[]  nums = {-1,0,1,2,-1,-4};
      int sum=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j; k <nums.length; k++) {
                    if (i!=j && i!=k && j!=k){
                        int tSum=nums[i]+nums[j]+nums[k];
                        if (tSum==sum){
                            System.out.println("["+nums[i]+" "+nums[j]+" "+nums[k]+"]");
                            break;
                        }
                    }
                }
            }
        }
    }
}
