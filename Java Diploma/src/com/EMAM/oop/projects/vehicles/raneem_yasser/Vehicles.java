package com.EMAM.oop.projects.vehicles.raneem_yasser;

public abstract class Vehicles {

    protected String modelName;
    protected String modelNo;
    protected String brand;
    protected String engineType;
    protected double tankSize;
    protected double fuelConsumption;
    public Owner owner;

    public Vehicles(String modelName, String modelNo, String brand, String engineType, double tankSize, double fuelConsumption, Owner owner) {
        this.modelName = modelName;
        this.modelNo = modelNo;
        this.brand = brand;
        this.engineType = engineType;
        this.tankSize = tankSize;
        this.fuelConsumption = fuelConsumption;
        this.owner = owner;
    }

    //  movable distance , cost for 100km ()
    public abstract double costFor100Km();

    public double movableDistance() {
        return tankSize / fuelConsumption;
    }

    public abstract boolean setAirConditionOn();

    public abstract boolean setAirConditionOff();
}
