package com.teachmeskills.lesson6;

public abstract class LandTransport extends Transport {
    protected int wheelsNumber;
    protected double fuelConsumption;

    public LandTransport(int enginePower, int maxSpeed, double weight, String brand, int wheelsNumber, double fuelConsumption) {
        super(enginePower, maxSpeed, weight, brand);
        this.wheelsNumber = wheelsNumber;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "LandTransport{" +
                "wheelsNumber=" + wheelsNumber +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
