package com.teachmeskills.lesson7.task1;

public class Vet {
    void treatAnimal(Animal animal) {
        System.out.println("Животное " + animal.getName() + " ест " + animal.getFood() + " и живет " + animal.getLocation());
    }
}