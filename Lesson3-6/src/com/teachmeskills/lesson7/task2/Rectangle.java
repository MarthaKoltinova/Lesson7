package com.teachmeskills.lesson7.task2;

public class Rectangle extends Shape {
    private int top;
    private int left;
    private int height;
    private int width;

    public Rectangle(String color, int top, int left, int height, int width) {
        super(color);
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public int getTop() {

        return top;
    }

    public int getLeft() {

        return left;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "top=" + top +
                ", left=" + left +
                ", height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (top != rectangle.top) return false;
        if (left != rectangle.left) return false;
        if (height != rectangle.height) return false;
        return width == rectangle.width;
    }


}
