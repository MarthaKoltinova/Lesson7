package com.teachmeskills.lesson7.task1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Fish", "Home", "Barsik", true);
        Animal dog = new Dog("Meal", "Home", "Tuzik", true, 5);
        Animal horse = new Horse("Apple", "Farm", "Iris", false, "Racing");
        // cat.makeNoise();
        // dog.makeNoise();
        //  horse.makeNoise();
        Vet vet = new Vet();
        Animal[] animals = {cat, dog, horse};
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
