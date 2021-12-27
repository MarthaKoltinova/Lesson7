package com.teachmeskills.lesson6;

import java.util.Random;
import java.util.Scanner;

public class Truck extends LandTransport {
    protected double liftingCapacity;
    double kg;
    Scanner scanner = new Scanner(System.in);

    public Truck(int enginePower, int maxSpeed, double weight, String brand, int wheelsNumber, double fuelConsumption, double liftingCapacity) {
        super(enginePower, maxSpeed, weight, brand, wheelsNumber, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public double getKg() {
        System.out.println("Введите вес груза (кг):");
        kg = scanner.nextInt();
        if (kg <= liftingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }

        return kg;
    }

    @Override
    public double getPowerK() {
        powerK = enginePower * 0.74;
        return powerK;
    }


    @Override
    public String toString() {
        return "Truck{" +
                " liftingCapacity=" + liftingCapacity +
                " enginePower=" + enginePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand +
                " wheelsNumber=" + wheelsNumber +
                ", fuelConsumption=" + fuelConsumption +
                ", powerK='" + getPowerK() +
                '}';
    }
}
