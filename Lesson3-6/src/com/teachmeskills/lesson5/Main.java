package com.teachmeskills.lesson5;

public class Main {
    public static void main(String[] args) {
        UnderShirt underShirt1 = new UnderShirt("M", "Blue", "Hello");
        UnderShirt underShirt2 = new UnderShirt("S", "White", "Bye");
        UnderShirt underShirt3 = new UnderShirt("XL", "Black", "Love");
        Pants pants1 = new Pants("Black", Size.L);
        Pants pants2 = new Pants("Blue", Size.S);
        Pants pants3 = new Pants("Black", Size.Xl);

        People people1 = new People("Liza", "Ivanova", 50.7, "Female", underShirt2, pants2);
        People people2 = new People("Sasha", "Sidorov", 80.5, "Male", underShirt3, pants3);
        people1.run();
        System.out.println(people1);
        System.out.println(people2);
        people1.age();
        System.out.println("Варианты всех маек: " + underShirt1);
        System.out.println(underShirt2);
        System.out.println(underShirt3);
        System.out.println("Варианты всех штанов: " + pants1);
        System.out.println(pants2);
        System.out.println(pants3);
        people1.changeUnderShirt(underShirt1);
        System.out.println(people1);
        people1.changePants(pants1);
        System.out.println(people1);

    }

}
