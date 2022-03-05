/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop.projects.vehicles.raneem_yasser;

public class Truck extends Vehicles {
    private int numberOfSeats;
    private Boolean airConditionON;
    private int power;

    public Truck(String modelName, String modelNo, String brand, double tankSize, double fuelConsumption, Owner owner, int numberOfSeats, int power) {
        super(modelName, modelNo, brand, "diesel", tankSize, fuelConsumption, owner);
        this.numberOfSeats = numberOfSeats;
        this.airConditionON = false;
        this.power = power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double costFor100Km() {
        return (airConditionON?1.2*this.fuelConsumption:this.fuelConsumption)*100*PetroleumType.getDieselPrice();
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
        return "Truck{" +
                "numberOfSeats=" + numberOfSeats +
                ", airConditionON=" + airConditionON +
                ", power=" + power +
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
