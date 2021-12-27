package com.teachmeskills.lesson7.task1;

public class Dog extends Animal {
    protected boolean makeBark;
    protected int commandsNumber;

    public Dog(String food, String location, String name, boolean makeBark, int commandsNumber) {
        super(food, location, name);
        this.makeBark = makeBark;
        this.commandsNumber = commandsNumber;
    }

    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {
        System.out.println("Собака спит");

    }
}
