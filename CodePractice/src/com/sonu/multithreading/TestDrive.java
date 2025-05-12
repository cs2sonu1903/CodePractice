package com.sonu.multithreading;

public class TestDrive {

    public static void main(String[] args) {
       Medical medical=new Medical();
       medical.start();
       LicenceDemo licenceDemo=new LicenceDemo();
       licenceDemo.start();
       OfficerSign officerSign=new OfficerSign();
       officerSign.start();

    }
}
class Medical extends Thread{
    @Override
    public void run() {
        System.out.println("Medical Thread is running..");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Medical Thread is Completed.");
    }
}
class LicenceDemo extends Thread{
    @Override
    public void run() {
        System.out.println("LicenceDemo Thread is running..");
    }
}
class OfficerSign extends Thread{
    @Override
    public void run() {
        System.out.println("OfficerSign Thread is running..");
    }
}
