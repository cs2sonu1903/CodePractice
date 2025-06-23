package com.sonu.Interview.Array;

public class WissenFindSecondLagestNumber {
    public static void main(String[] args) {

//        int[] list={35,34,32,10,12,14};
        //secend senerio : if element is same
//        int[] list={12,12};
        //third senerio: if list have one element
        int[] list={12};

        //my approch    time complexity = O(n2)
        int result=findSecondMax(list);
        System.out.println(result);
        //reduce time complexity
        int resul1=findSecondMaxwithInsertionSort(list);
        System.out.println(resul1);

        //best approch
        int sMax=fibdSMax(list);
        System.out.println(sMax);

    }

    private static int fibdSMax(int[] list) {
        int max=0,sMax=0;
        for (int i = 0; i < list.length; i++) {
            if(list[i]>max){
                max=list[i];
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i]<max && list[i]>sMax){
                sMax=list[i];
            }
        }

        return sMax;
    }

    private static int findSecondMaxwithInsertionSort(int[] list) {
        if (list.length>1){
            for (int i = 1; i <list.length ; i++) {
                int key=list[i];
                int j=i-1;
                if(key==j){
                    return 0;
                }
                while (j>=0 && list[i]>key ){
                    list[j+1]=list[i];
                    j--;
                }
                list[j+1]=key;
            }
            return list[1];
        }else {
            return 0;
        }
    }

    private static int findSecondMax(int[] list) {

        if (list.length > 1) {
            for (int i = 0; i < list.length - 1; i++) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j])
                    {
                        return 0;
                    }
                    if (list[i] == list[j])
                        if (list[i] < list[j]) {
                            int temp = list[i];
                            list[i] = list[j];
                            list[j] = temp;
                        }
                }
            }
            return list[1];
        }else {
        return 0;
        }
    }

}
