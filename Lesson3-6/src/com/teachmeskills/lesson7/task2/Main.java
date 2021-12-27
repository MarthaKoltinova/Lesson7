package com.teachmeskills.lesson7.task2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Black",3,6);
        Shape rectangle = new Rectangle("Blue",3,2,5,4);
        Shape[] shapes = {circle, rectangle};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
