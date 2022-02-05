/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop;

import java.util.Scanner;

public class Car {
    String owner = "Mohamed";
    String color = "black";
    double speed = 0;
    String model = "";
    int tires = 4;
    int maxWeightKG = 2000;
    int chairsNumber = 5;
    double litter = 30;
    String engineStatus = "stop";
    String gasType = "solar";

    void startEngine() {
        engineStatus = "run";
    }

    void stopEngine() {
        engineStatus = "stop";
    }

    void startGPS() {
    }

    void speedUp(int s) {
        if (engineStatus.equals("run"))
            speed += s;
    }

    void slowDown(int s) {
        speed -= s;
    }


    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.engineStatus);
        System.out.println("current speed :: "+c.speed+" Km/H");
        c.speedUp(5);
        System.out.println("after speedup :: "+c.speed+" Km/H");

        c.startEngine();
        System.out.println(c.engineStatus);
        System.out.println("current speed :: "+c.speed+" Km/H");
        c.speedUp(5);
        System.out.println("after speedup :: "+c.speed+" Km/H");
    }

}
