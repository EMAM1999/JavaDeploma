/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EMAM.oop.projects.vehicles.raneem_yasser;

/**
 * @author HP
 */
public class Car extends Vehicles {
    private int numberOfSeats;
    private Boolean airConditionON;

    public Car(String modelName, String modelNo, String brand, double tankSize, double fuelConsumption, Owner owner, int numberOfSeats) {
        super(modelName, modelNo, brand, "gasoline", tankSize, fuelConsumption, owner);
        this.numberOfSeats = numberOfSeats;
        this.airConditionON = false;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double costFor100Km() {
        return (airConditionON?1.1*this.fuelConsumption:this.fuelConsumption)*100*PetroleumType.getGasolinePrice();
    }

    @Override
    public boolean setAirConditionOn() {
        airConditionON = true;
        return true;
    }

    @Override
    public boolean setAirConditionOff() {
        airConditionON = false;
        return false;
    }


    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", airConditionON=" + airConditionON +
                ", modelName='" + modelName + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", brand='" + brand + '\'' +
                ", engineType='" + engineType + '\'' +
                ", tankSize=" + tankSize +
                ", fuelConsumption=" + fuelConsumption +
                ", owner=" + owner +
                '}';
    }
}
