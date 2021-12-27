package com.teachmeskills.lesson7.task1;

public abstract class Animal {
    protected String food;
    protected String location;
    protected String name;

    public Animal(String food, String location, String name) {
        this.food = food;
        this.location = location;
        this.name = name;
    }

    void makeNoise() {
        System.out.println("Такое-то животное спит");
    }

    public void sleep() {

    }

    public abstract void eat();


    public String getFood() {

        return food;
    }

    public String getLocation() {

        return location;
    }

    public String getName() {
        return name;
    }


}
