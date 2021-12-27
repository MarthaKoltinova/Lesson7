package com.teachmeskills.lesson3;

public class Task2 {
    public static void main(String[] args) {
        int array[] = new int[100];
        for (int i = 1; i < 100; i += 2) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n---------------------------------");
        for (int i = 99; i >= 1; i -= 2) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }
}
