package com.sonu.Interview;

import java.util.concurrent.TimeUnit;

public class Deloite {
    enum TrafficLight{
        RED,
        YELLOY,
        GREEN
    }
    public static void main(String[] args) {
        TrafficLight currentLight=TrafficLight.RED;
        while (true){
            switch (currentLight){
                case RED:
                    System.out.println("Red Light- Ruk ja bhai...");
                    wait(10);
                    currentLight=TrafficLight.GREEN;
                    break;

                case GREEN:
                    System.out.println("Green Light- Chale Jawo");
                    wait(10);
                    currentLight=TrafficLight.YELLOY;
                    break;

                case YELLOY:
                    System.out.println("Yellow Light- Dhire Bhai saheb");
                    wait(3);
                    currentLight=TrafficLight.RED;
            }
        }
        
    }
    private static void wait(int second){
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("Error during wait: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
