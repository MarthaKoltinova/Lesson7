package com.teachmeskills.lesson6;

import java.util.Scanner;

public class CivilTransport extends AirTransport {
    protected int passNumber;
    protected boolean businessClass;
    int passengers;
    Scanner scanner = new Scanner(System.in);

    public CivilTransport(int enginePower, int maxSpeed, double weight, String brand, double wingspan, double minLength, int passNumber, boolean businessClass) {
        super(enginePower, maxSpeed, weight, brand, wingspan, minLength);
        this.passNumber = passNumber;
        this.businessClass = businessClass;
    }

    public double getPassengers() {
        System.out.println("Введите количество пассажиров (чел):");
        passengers = scanner.nextInt();
        if (passengers < passNumber) {
            System.out.println("Самолет готов ");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }

        return passengers;
    }

    @Override
    public double getPowerK() {
        powerK = enginePower * 0.74;
        return powerK;
    }


    @Override
    public String toString() {
        return "CivilTransport{" +
                "enginePower=" + enginePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", powerK='" + getPowerK() +
                ", brand='" + brand + '\'' +
                " passNumber=" + passNumber +
                ", businessClass=" + businessClass +
                " wingspan=" + wingspan +
                ", minLength=" + minLength +
                '}';
    }
}
