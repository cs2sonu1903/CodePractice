package com.sonu.oopsinterview;

public class Singalton {
    public static final Singalton instance=new Singalton();
    Singalton(){

    }
    public static Singalton getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello fromsingalton");
    }
}
