/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EMAM.oop.projects.vehicles.raneem_yasser;

/**
 * @author HP
 */
public class Minivan extends Vehicles {
    private int numberOfSeats;
    private Boolean airConditionON;
    private Boolean hasAutoDoors;

    public Minivan(String modelName, String modelNo, String brand, double tankSize, double fuelConsumption, Owner owner, int numberOfSeats, Boolean hasAutoDoors) {
        super(modelName, modelNo, brand, "hybrid", tankSize, fuelConsumption, owner);
        this.numberOfSeats = numberOfSeats;
        this.airConditionON = false;
        this.hasAutoDoors = hasAutoDoors;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setHasAutoDoors(Boolean hasAutoDoors) {
        this.hasAutoDoors = hasAutoDoors;
    }

    @Override
    public double costFor100Km() {
        return (airConditionON ? 1.2 * this.fuelConsumption : this.fuelConsumption) * 100 * PetroleumType.getGasolinePrice();
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
        return "Minivan{" +
                "numberOfSeats=" + numberOfSeats +
                ", airConditionON=" + airConditionON +
                ", hasAutoDoors=" + hasAutoDoors +
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
