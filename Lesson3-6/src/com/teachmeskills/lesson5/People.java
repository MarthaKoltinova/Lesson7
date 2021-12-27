package com.teachmeskills.lesson5;

import java.time.LocalDate;
import java.time.Period;


public class People {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private double weight;
    private String sex;
    private UnderShirt underShirt;
    private Pants pants;

    public People(String name, String surname, double weight, String sex, UnderShirt underShirt, Pants pants) {
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.sex = sex;
        this.underShirt = underShirt;
        this.pants = pants;
    }

    public void run() {
        System.out.println("Let's go");
    }

    public void age() {
        dateOfBirth = LocalDate.of(2000, 4, 2);
        LocalDate now = LocalDate.now();
        Period.between(dateOfBirth, now).getYears();
        System.out.println("Возраст: " + Period.between(dateOfBirth, now).getYears());
    }

    public void changeUnderShirt(UnderShirt underShirt) {
        this.underShirt = underShirt;
    }

    void changePants(Pants pants) {
        this.pants = pants;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                //", dateOfBirth=" + dateOfBirth +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", underShirt=" + underShirt +
                ", pants=" + pants +
                '}';
    }
}
