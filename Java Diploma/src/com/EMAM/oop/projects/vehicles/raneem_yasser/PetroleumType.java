/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EMAM.oop.projects.vehicles.raneem_yasser;

/**
 * @author HP
 */
public class PetroleumType {
    public static final int DIESEL = 1;
    public static final int GASOLINE = 2;

    private static double dieselPrice = 4.02;
    private static double gasolinePrice = 5.23;

    public static double getDieselPrice() {
        return dieselPrice;
    }

    public static double getGasolinePrice() {
        return gasolinePrice;
    }

    public static void setGasolinePrice(double gasolinePrice) {
        PetroleumType.gasolinePrice = gasolinePrice;
    }

    public static void setDieselPrice(double dieselPrice) {
        PetroleumType.dieselPrice = dieselPrice;
    }
}
