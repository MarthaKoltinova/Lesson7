package com.teachmeskills.lesson5;

public class Pants {
    private String color;
    private Size pantsSize;

    @Override
    public String toString() {
        return "Pants{" +
                "color='" + color + '\'' +
                ", pantsSize=" + pantsSize +
                '}';
    }

    public Pants(String color, Size pantsSize) {
        this.color = color;
        this.pantsSize = pantsSize;
    }
}
