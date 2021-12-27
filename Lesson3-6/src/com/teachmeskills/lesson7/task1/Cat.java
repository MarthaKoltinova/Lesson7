package com.teachmeskills.lesson7.task1;

public class Cat extends Animal {
    protected boolean makeMeows;

    public Cat(String food, String location, String name, boolean makeMeows) {
        super(food, location, name);
        this.makeMeows = makeMeows;
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот спит");

    }

    @Override
    public void eat() {

    }
}
