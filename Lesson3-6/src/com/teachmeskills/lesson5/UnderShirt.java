package com.teachmeskills.lesson5;

public class UnderShirt {
    private String size;
    private String color;
    private String inscription;

    @Override
    public String toString() {
        return "UnderShirt{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", inscription='" + inscription + '\'' +
                '}';
    }

    public UnderShirt(String size, String color, String inscription) {
        this.size = size;
        this.color = color;
        this.inscription = inscription;
    }
}
