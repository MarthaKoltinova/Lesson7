package com.teachmeskills.lesson7.task2;

public class Circle extends Shape {
    private int xCenter;
    private int yCenter;

    public Circle(String color,int xCenter, int yCenter) {
        super(color);
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public int getxCenter() {

        return xCenter;
    }

    public int getyCenter() {

        return yCenter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void draw() {

        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (xCenter != circle.xCenter) return false;
        return yCenter == circle.yCenter;
    }

}
