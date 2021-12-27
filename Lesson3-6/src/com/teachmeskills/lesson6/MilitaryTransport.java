package com.teachmeskills.lesson6;

public class MilitaryTransport extends AirTransport {
    protected boolean catapult;
    protected int missilesNumber;

    public MilitaryTransport(int enginePower, int maxSpeed, double weight, String brand, double wingspan, double minLength, boolean catapult, int missilesNumber) {
        super(enginePower, maxSpeed, weight, brand, wingspan, minLength);
        this.catapult = catapult;
        this.missilesNumber = missilesNumber;
    }

    public int shot() {
        if (missilesNumber != 0) {
            System.out.println("Ракета пошла...");
        } else if (missilesNumber == 0) {
            System.out.println("Боеприпасы отсутствуют...");
        }
        return missilesNumber;
    }

    public boolean bailout() {
        if (catapult == true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
        return catapult;
    }

    @Override
    public double getPowerK() {
        double powerK = enginePower * 0.74;
        return powerK;
    }

    @Override
    public String toString() {
        return "MilitaryTransport{" +
                "enginePower=" + enginePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", powerK='" + getPowerK() +
                ", brand='" + brand + '\'' +
                " catapult=" + catapult +
                ", missilesNumber=" + missilesNumber +
                " wingspan=" + wingspan +
                ", minLength=" + minLength +
                '}';
    }
}
