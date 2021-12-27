package com.teachmeskills.lesson6;

public abstract class Transport {
   protected int enginePower;
  protected   int maxSpeed;
    protected double weight;
    protected String brand;
    protected double powerK;


    public Transport(int enginePower, int maxSpeed, double weight, String brand) {
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;

    }

    public double getPowerK(){
        return powerK;
    }


    @Override
    public String toString() {
        return "Transport{" +
                "enginePower=" + enginePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", powerK='" + powerK +
                ", brand='" + brand + '\'' +
                '}';
    }
}
