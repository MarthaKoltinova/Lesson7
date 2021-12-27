package com.teachmeskills.lesson7.task2;

public abstract class Shape {
    protected String color;

   public abstract void draw();

    public Shape(String color) {
        this.color = color;
    }
}
