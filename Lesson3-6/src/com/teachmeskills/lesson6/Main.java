package com.teachmeskills.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car(200, 180, 2000, "Audi", 4, 6.6, "sedan", 5);
        System.out.println("Легковой автомобиль: " + car.toString());
        Truck truck = new Truck(280, 170, 3800, "MAZ", 6, 18, 2000);
        System.out.println("Грузовой автомобиль: " + truck.toString());
        CivilTransport civilTransport = new CivilTransport(25000, 820, 26500, "Boeing", 28.35, 3200, 190, true);
        System.out.println("Воздушный траспорт: " + civilTransport.toString());
        MilitaryTransport militaryTransport = new MilitaryTransport(28500, 1300, 10760, "Су", 25.5, 3000, true, 4);
        System.out.println("Воздушный военный траспорт: " + militaryTransport.toString());
        car.getTime();
        truck.getKg();
        civilTransport.getPassengers();
        militaryTransport.shot();
        militaryTransport.bailout();

    }
}
