package com.sonu.oopsinterview;

public class Apexon extends  OverrideTest{

    public Apexon() {
    }

    public static void main(String[] args) {

        int first=0,second=1,n=0;

        while (n<10){
            System.out.print(first);
            int sum=first+second;
            first=second;
            second=sum;
            n++;
        }
        System.out.println();



        Apexon apx=new Apexon();
        apx.logging(1256);
        apx.logging("skuma","Sonu123");

        OverrideTest ort=new Apexon();
        ort.runMethod();




    }
    public void logging(int passkey ){
        System.out.println("Logging through PassKey");
    }
    public void logging(String userName, String password){
        System.out.println("Logging Through Id and Password");
    }
   public void runMethod(){
       System.out.println("Child class method running");

   }



}

