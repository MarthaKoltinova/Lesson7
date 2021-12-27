package com.teachmeskills.lesson6;

import java.util.Scanner;

public class Car extends LandTransport {
    protected String bodyType;
    protected int passengersNumber;
    double time, km, consumption;
    Scanner scanner = new Scanner(System.in);

    public Car(int enginePower, int maxSpeed, double weight, String brand, int wheelsNumber, double fuelConsumption, double km, double time, double consumption) {
        super(enginePower, maxSpeed, weight, brand, wheelsNumber, fuelConsumption);
        this.km = km;
        this.consumption = consumption;
        this.time = time;
    }

    public Car(int enginePower, int maxSpeed, double weight, String brand, int wheelsNumber, double fuelConsumption, String bodyType, int passengersNumber) {
        super(enginePower, maxSpeed, weight, brand, wheelsNumber, fuelConsumption);
        this.bodyType = bodyType;
        this.passengersNumber = passengersNumber;
    }

    public double getTime() {
        System.out.println("Введите время (ч):");
        time = scanner.nextInt();
        km = maxSpeed * time;
        System.out.println("За время " + time + " автомобиль " + brand + " двигаясь с максимальой скоростью " + maxSpeed + " проедет " + km);
        return time;
    }

    @Override
    public double getPowerK() {
        powerK = enginePower * 0.74;
        return powerK;
    }


    @Override
    public String toString() {
        return "Car{" +
                "bodyType='" + bodyType + '\'' +
                ", passengersNumber=" + passengersNumber +
                " enginePower=" + enginePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand +
                " wheelsNumber=" + wheelsNumber +
                ", fuelConsumption=" + fuelConsumption +
                ", powerK='" + getPowerK() +
                '}';
    }

    public double getKm() {
        return km;
    }
}
