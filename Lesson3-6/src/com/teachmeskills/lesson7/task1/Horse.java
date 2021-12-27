package com.teachmeskills.lesson7.task1;

public class Horse extends Animal {
    protected boolean horseShoes;
    protected String type;

    public Horse(String food, String location, String name, boolean horseShoes, String type) {
        super(food, location, name);
        this.horseShoes = horseShoes;
        this.type = type;
        this.name = name;
    }


    @Override
    public void makeNoise() {
        System.out.println("Лошадь спит");

    }

    @Override
    public void eat() {


    }
}
