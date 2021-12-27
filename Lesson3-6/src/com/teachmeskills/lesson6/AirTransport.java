package com.teachmeskills.lesson6;

public abstract class AirTransport extends Transport {
    protected double wingspan;
    protected double minLength;

    public AirTransport(int enginePower, int maxSpeed, double weight, String brand, double wingspan, double minLength) {
        super(enginePower, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLength = minLength;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "wingspan=" + wingspan +
                ", minLength=" + minLength +
                '}';
    }
}
